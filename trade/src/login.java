import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class login extends personal implements ActionListener {
    String names,password;
    ImageIcon image;
    Font font=new Font("mmm",Font.ROMAN_BASELINE,20);
    Font font2=new Font("mm",Font.PLAIN,20);
    int counter=0;
    boolean isregistred=false;
    JFrame frame;
    JTextField username,enter_password;
    JButton login_button,create_button,forget_button;
    int fx=1000,fy=800;
    public login()throws IOException{
        frame=new JFrame();
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        JPanel panel=new JPanel();
       frame.setLayout(new GridLayout(1,1));
        panel.setLayout(new FlowLayout());
        frame.setTitle("      online trading industries");
        panel.setPreferredSize(new Dimension(fx,fy));

        image=new ImageIcon("photo.jpg");

        //create the image storing panel
        JPanel p1=new JPanel();
        p1.setPreferredSize(new Dimension(fx,400));
        p1.setBackground(Color.DARK_GRAY);
        p1.setLayout(new FlowLayout());
        
        
          JLabel welcome_label=new JLabel("                  WELCOME TO ONLINE SHOPING");
          welcome_label.setHorizontalTextPosition(welcome_label.CENTER);
          welcome_label.setBackground(Color.blue);
          welcome_label.setPreferredSize(new Dimension(800,40));
          welcome_label.setForeground(Color.white);
          
          p1.add(welcome_label);
        
        JButton manager_button=new JButton("Manager");
        manager_button.setBackground(Color.BLUE);
        manager_button.setForeground(Color.white);
        manager_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				try {
					new manager_interface();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
        	
        });
        p1.add(manager_button);

        JLabel image_label=new JLabel();
        image_label.setPreferredSize(new Dimension(1000,400));
        image_label.setIcon(image);

        p1.add(image_label);
        //image_label.prepareImage(image.getImag,null);
         panel.add(p1);

         //create login part
        JPanel p2=new JPanel();
        p2.setPreferredSize(new Dimension(fx,400));
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(new FlowLayout());


        JLabel l1=new JLabel();
        l1.setAlignmentX(Component.LEFT_ALIGNMENT);
        l1.setPreferredSize(new Dimension(250,50));
        p2.add(l1);

        JLabel labuser=new JLabel("Enter Username");
        labuser.setAlignmentX(Component.LEFT_ALIGNMENT);
        labuser.setFont(font);
        labuser.setPreferredSize(new Dimension(150,50));
        p2.add(labuser);

        
         username=new JTextField();
         username.setPreferredSize(new Dimension(250,50));
         username.setBounds(500,500,200,30);
         username.setFont(font2);

        username.setBackground(Color.white);
         p2.add(username);

        JLabel l2=new JLabel();
        l2.setAlignmentX(Component.LEFT_ALIGNMENT);
        l2.setPreferredSize(new Dimension(250,50));
        p2.add(l2);
        JLabel l22=new JLabel();
        l22.setAlignmentX(Component.LEFT_ALIGNMENT);
        l22.setPreferredSize(new Dimension(250,50));
        p2.add(l22);

        
        JLabel labpass=new JLabel("Enter password");
        labpass.setFont(font);
        labpass.setPreferredSize(new Dimension(150,50));
        p2.add(labpass);

        JPasswordField  enter_password=new JPasswordField();
       // enter_password=new JTextField();
        enter_password.setPreferredSize(new Dimension(250,50));
        enter_password.setBackground(Color.white);
        enter_password.setEchoChar('*');
        enter_password.setFont(font2);
        p2.add(enter_password);
        
        JLabel l3=new JLabel();
        l3.setAlignmentX(Component.LEFT_ALIGNMENT);
        l3.setPreferredSize(new Dimension(250,50));
        p2.add(l3);
        JLabel l4=new JLabel();
        l4.setAlignmentX(Component.LEFT_ALIGNMENT);
        l4.setPreferredSize(new Dimension(400,50));
        p2.add(l4);
        JLabel l33=new JLabel();
        


//login button
      login_button=new JButton("LOGIN");
      login_button.addActionListener(new ActionListener() {
          @SuppressWarnings("deprecation")
		@Override
          public void actionPerformed(ActionEvent e) {
        	  if(!username.getText().isEmpty()&&!enter_password.getText().isEmpty()&&isexist(username.getText())) {
              try {
				user_interface us=new user_interface(username.getText());
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				
			}
             
              frame.dispose();
            
          }
        	  else
					JOptionPane.showMessageDialog(frame, "incorrect Password or username");
          }
      });
      
        login_button.setPreferredSize(new Dimension(250,40));
        login_button.setBackground(new Color(0,46,99));
        login_button.setForeground(Color.white);
      p2.add(login_button);
      JLabel l5=new JLabel();
      l5.setAlignmentX(Component.LEFT_ALIGNMENT);
      l5.setPreferredSize(new Dimension(300,50));
      p2.add(l5);

      JLabel l6=new JLabel();
      l6.setAlignmentX(Component.LEFT_ALIGNMENT);
      l6.setPreferredSize(new Dimension(400,50));
      p2.add(l6);
      
      

        create_button=new JButton("Have You Account? Create New");
        create_button.setPreferredSize(new Dimension(250,40));
        create_button.setBackground(new Color(0,46,99));
        create_button.setForeground(Color.white);
        create_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	frame.dispose();
					create_new_account();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        p2.add(create_button);
        JLabel l7=new JLabel();
        l7.setAlignmentX(Component.LEFT_ALIGNMENT);
        l7.setPreferredSize(new Dimension(300,50));
        p2.add(l7);
        
        
       
        forget_button=new JButton("Forget Password?");
        forget_button.setPreferredSize(new Dimension(400,40));
        forget_button.setBackground(new Color(0, 99, 40));
        forget_button.setForeground(Color.white);
        forget_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forget_password();
                frame.dispose();
               
            }
        });
        p2.add(forget_button);
//frame.getContentPane().setBackground(Color.GREEN);


        panel.add(p2);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        
    }
    public void forget_password(){
    	

    }
    public void create_new_account() throws IOException{
    	
            create_a cr=new create_a();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
