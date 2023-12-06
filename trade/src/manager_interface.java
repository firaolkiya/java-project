import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class manager_interface extends ordered{
     Border bo=BorderFactory.createEtchedBorder(10,Color.yellow,Color.yellow);
	manager_interface()throws IOException{
		
		JFrame manager=new JFrame("        Manager Interface");
		 manager.setDefaultCloseOperation(manager.DISPOSE_ON_CLOSE);
		manager.setSize(1000,700);
		manager.setLayout(null);
		
		JButton view=new JButton("View Item");
		view.setBackground(new Color(20,230,30));
		view.setBounds(400,350,200,100);
		view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.dispose();
				new table_item();
			}
		});
		manager.add(view);
		
		JButton search=new JButton("Search Item");
		search.setBackground(new Color(20,230,30));
		search.setBounds(400,200,200,100);
		manager.add(search);
		
		JButton add=new JButton("Add Item");
		add.setBackground(new Color(20,230,30));
		add.setBounds(650,350,200,100);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.dispose();
				new insert_item();
			}
		});
		manager.add(add);
		
		JButton delete=new JButton("Delete");
		delete.setBackground(new Color(20,230,30));
		delete.setBounds(150,200,200,100);
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String gh=JOptionPane.showInputDialog("Insert tem name: ");
				try {
					new ItemEditor().deleteItem(gh);
					JOptionPane.showMessageDialog(manager, "delete succesfully");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
			
		});
		manager.add(delete);
		
		JButton order=new JButton("View Orderred");
		order.setBackground(new Color(20,230,30));
		order.setBounds(150,350,200,100);
		order.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ar1[] ={"Customer username","Name of Item","ordered Amount","Price"};
				JTable tab=new JTable(ord,ar1);
				JScrollPane pane=new JScrollPane(tab);
				pane.setSize(400,300);
				JFrame manag2=new JFrame();
				manag2.setSize(700,600);
				manag2.add(pane);
				manag2.setVisible(true);
				
			}
			
		});
		manager.add(order);
		
		JTextField tser=new JTextField();
		tser.setBounds(650, 250, 200, 40);
		
		manager.add(tser);
		
		
		manager.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		manager_interface m=new manager_interface();

	}

}
