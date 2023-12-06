import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class user_interface extends personal{
      Border b=BorderFactory.createEtchedBorder(20, Color.yellow,Color.yellow);
       Font f1=new Font("kk",Font.CENTER_BASELINE,15);
       JPanel dep_panel;
       JPanel cart_panel;
       double d;
	user_interface(String s) throws IOException{
		JFrame fra=new JFrame("           user interface");
		 dep_panel=new JPanel();
		 cart_panel=orderOf(s);
		fra.setDefaultCloseOperation(fra.DISPOSE_ON_CLOSE);
		fra.setSize(1200,700);
		fra.getContentPane().setBackground(new Color(200,250,245));
	    fra.setLayout(new FlowLayout());
		
		JPanel first_panel=new JPanel();
		first_panel.setLayout(null);
		first_panel.setPreferredSize(new Dimension(1100,200));
		first_panel.setBackground(new Color(200,250,245));
		JLabel my1=new JLabel("user profile");
	
		my1.setBounds(0,0,200,150);
		ImageIcon im1=new ImageIcon("p5.png");
		my1.setForeground(Color.blue);
		
		JTextArea my12=new JTextArea();
		String m="  Username: "+s+"\n  Balance: "+arr[getindex(s)][2]+"";
		my12.setBounds(10,160,200,50);
		my12.setBackground(Color.CYAN);
		
		my12.setText(m);
		my1.setPreferredSize(new Dimension(200,200));
		my1.setIcon(im1);
		first_panel.add(my1);
		first_panel.add(my12);
		
	    

	     JButton view_item=new JButton("View Item");
		    view_item.setBackground(new Color(0,45,240));
		    view_item.setPreferredSize(new Dimension(100,50));
		    view_item.setForeground(Color.white);
		    view_item.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					new order_item(s,d);
					
				}
		    	
		    });
		    fra.add(view_item);
		    
		    JButton deposit=new JButton("Deposit");
		    deposit.setBackground(new Color(0,45,240));
		   deposit.setPreferredSize(new Dimension(100,50));
		    deposit.setForeground(Color.white);
		    deposit.addActionListener(new ActionListener() {
		    		public void actionPerformed(ActionEvent e) {
		    	      dep_panel.setVisible(true);
		    	      cart_panel.setVisible(false);
					}
		    }	
	);
		    fra.add(deposit);
		    
		    JButton buy=new JButton("Order Item");
		    buy.setBackground(new Color(0,45,240));
		    buy.setPreferredSize(new Dimension(100,50));
		    buy.setForeground(Color.white);
		    buy.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					new order_item(s,d);
					
				}
		    	
		    });
		    fra.add(buy);
		    
		    JButton mycart=new JButton("My Cart");
		    mycart.setBackground(new Color(0,45,240));
		   mycart.setPreferredSize(new Dimension(100,50));
		    mycart.setForeground(Color.white);
		    mycart.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 
					fra.add(cart_panel);
					dep_panel.setVisible(false);
					cart_panel.setVisible(true);
				}
		    	
		    });
		    fra.add(mycart);
		    fra.add(first_panel);
	       
		
	    
	    dep_panel.setBackground(Color.GRAY);
	    dep_panel.setLayout(new FlowLayout());
	    dep_panel.setPreferredSize(new Dimension(350,400));
	   
	    JLabel amount=new JLabel("Enter Amount");
	    amount.setFont(f1);
	    amount.setForeground(Color.yellow);
	    amount.setPreferredSize(new Dimension(120,40));
	    amount.setBounds(500,650,100,40);
	    dep_panel.add(amount);
	    
	    JTextField tdeposit=new JTextField();
	    tdeposit.setPreferredSize(new Dimension(200,40));
	    dep_panel.add(tdeposit);
	    JLabel pass=new JLabel("Verfy Password");
	    pass.setFont(f1);
	    pass.setForeground(Color.yellow);
	    pass.setPreferredSize(new Dimension(120,40));
	    pass.setBounds(500,650,100,40);
	    dep_panel.add(pass);
	   
	    
	    JPasswordField tpass=new JPasswordField();
	    tpass.setPreferredSize(new Dimension(200,40));
	    dep_panel.add(tpass);
	    
	    JLabel space=new JLabel();
	    space.setPreferredSize(new Dimension(300,50));
	    dep_panel.add(space);
	 
	    
	   dep_panel.setVisible(false);
	     fra.add(dep_panel);
	     
	     JButton depo=new JButton("Deposit");
		  depo.setBackground(new Color(10,50,250));
		  depo.setPreferredSize(new Dimension(200,40));
		  
		  depo.addActionListener(new ActionListener() {

			@Override
			
			public void actionPerformed(ActionEvent e) {
				boolean n=true;
				for(int i=0;i<tdeposit.getText().length();i++) {
					if(!Character.isDigit(tdeposit.getText().charAt(i))){
						tdeposit.setText("invalid");
						n=false;
					}
				}
				if(n) {
					 d=Double.parseDouble(arr[getindex(s)][2])+Double.parseDouble(tdeposit.getText());
					arr[getindex(s)][2]=String.valueOf(d);
					try {
						Update(s,Integer.parseInt(tdeposit.getText()));
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				JOptionPane.showMessageDialog(fra, "deposit succesfully");
				String g="  Username: "+s+"\n  Balance: "+d+" Birr";
				my12.setText(g);
				}
			}
			  
		  });
		  dep_panel.add(depo);
		    
	   //dep_panel.setVisible(false);
	     fra.add(dep_panel);
	     
	    
		
		//fra.add(content);
		fra.setVisible(true);
		
		
	}
	
	public static void main(String []argv) throws IOException {
		user_interface user=new user_interface("fira");
	}


}
