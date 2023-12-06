import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class order_item extends view_items{
  Font f1=new Font("faon",Font.TYPE1_FONT,15);
	public order_item(String s,double d) {
		JFrame order_frame=new JFrame(" items");
		order_frame.setSize(800,700);
		order_frame.setLayout(new FlowLayout());
		
	     
		for(int i=0;i<row;i++) {
			JPanel pani=new JPanel();
			pani.setPreferredSize(new Dimension(200,150));
			pani.setBackground(new Color(230,240,255));
			int in=0;
		
			
			JTextArea texti=new JTextArea();
			texti.setPreferredSize(new Dimension(190,100));
			texti.setBackground(Color.gray);
			texti.setForeground(Color.white);
			texti.setFont(f1);
			String ss=myItem[0]+": "+Items[i][0]+"\n"+myItem[1]+": "+Items[i][1]+"\n"+myItem[2]+": "+Items[i][2]+"\n"+myItem[3]+": "+Items[i][3];
			texti.setText(ss);
			pani.add(texti);
			JButton bi=new JButton("Order");
			bi.setBackground(new Color(30,144,255));
			bi.setPreferredSize(new Dimension(100,40));
			bi.addActionListener(new ActionListener() {
     
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
					int mm=Integer.parseInt(JOptionPane.showInputDialog("Enter amount: "));
					if(mm*Integer.parseInt(Items[in][3])>d) {
						JOptionPane.showMessageDialog(order_frame, "Insuficient balance");
					}
					else {
					new database(s,Items[in][0],Items[in][1],mm,Integer.parseInt(Items[in][3]));
					int mg=mm*Integer.parseInt(Items[in][3]);
					JOptionPane.showMessageDialog(order_frame, "Ordered succesfully");
					new personal().Update(s,mg);
					 updateAmount(s,mm);
					}
					} catch (NumberFormatException | IOException e1) {
						System.out.println("invalid");
					}
					
				}
				
			});
			pani.add(bi);
			order_frame.add(pani);
			
		}
		
		
		order_frame.setVisible(true);
	}
	

	
}
