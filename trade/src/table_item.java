import javax.swing.JTable;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;
import java.io.IOException;
import java.util.ArrayList;
public class table_item extends view_items {
	
	 table_item(){
	 JFrame tableFrame = new JFrame("Read Item");
   JTable tableItem = new JTable(Items, myItem);
   tableFrame.setDefaultCloseOperation(tableFrame.DISPOSE_ON_CLOSE);
   tableFrame.setSize(1000, 700);
   tableFrame.setLayout(null);
   tableFrame.getContentPane().setBackground(Color.DARK_GRAY);
   tableItem.setBorder(border);
   tableItem.setBackground(Color.lightGray);
   tableItem.setForeground(new Color(10,15,240));

   JScrollPane scrollPane = new JScrollPane(tableItem);
   scrollPane.setBounds(40, 40, 700, 400);
   scrollPane.setBorder(border);

   tableFrame.add(scrollPane);
   
   JButton back=new JButton("Back to Menu");
   back.setBackground(new Color(20,14,250));
   back.setBounds(400,500,200,40);
   back.setForeground(Color.white);
   back.addActionListener(new ActionListener() {
   	public void actionPerformed(ActionEvent e) {
   		tableFrame.dispose();
   		try {
			new manager_interface();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
		
		}
   	}
   });
   tableFrame.add(back);
   
   
   tableFrame.setVisible(true);
   
}

}
