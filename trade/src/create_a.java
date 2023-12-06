import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class create_a extends personal{
   JFrame create_aco;

    JTextField fname,lname,emailt,phones;
    JPasswordField p1b,p2b;
   Font f1=new Font("ittt",Font.TRUETYPE_FONT,20);


    public create_a()throws IOException{
        
        create_aco=new JFrame();
        create_aco.setDefaultCloseOperation(create_aco.DISPOSE_ON_CLOSE);
        create_aco.setBackground(new Color(250,250,250));
        create_aco.setLayout(new FlowLayout());
        JPanel main_panel=new JPanel();
        main_panel.setLayout(new GridLayout(1,2));
        main_panel.setPreferredSize(new Dimension(1000,800));
        main_panel.setBackground(new Color(250,250,250));

        JPanel panel0=new JPanel();
        panel0.setLayout(new FlowLayout());
        panel0.setPreferredSize(new Dimension(400,800));
        panel0.setBackground(new Color(47, 100, 178));

        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(600,800));
        panel.setBackground(new Color(250,250,250));

       JLabel space1=new JLabel("                 welcome to online trading");
       space1.setFont(f1);
       space1.setAlignmentX(800);
        space1.setPreferredSize(new Dimension(500,100));
        space1.setForeground(Color.BLUE);
        panel.add(space1);

        //create for first name

        JLabel fnam=new JLabel("First Name");
        fnam.setPreferredSize(new Dimension(150,40));
        fnam.setFont(f1);
        fnam.setForeground(new Color(10,30,230));
        panel.add(fnam);

        fname=new JTextField();
        fname.setFont(f1);
        fname.setPreferredSize(new Dimension(250,40));
        panel.add(fname);

        JLabel space2=new JLabel();
        space2.setPreferredSize(new Dimension(50,40));
        panel.add(space2);

       /* JLabel space3=new JLabel();
        space3.setPreferredSize(new Dimension(250,40));
        panel.add(space3);*/

        JLabel last=new JLabel("Last Name");
        last.setFont(f1);
        last.setPreferredSize(new Dimension(150,40));
        last.setForeground(new Color(10,30,230));
        panel.add(last);

        //create for first name
       lname=new JTextField();
        lname.setFont(f1);
        lname.setPreferredSize(new Dimension(250,40));
        panel.add(lname);

        JLabel space4=new JLabel();
        space4.setPreferredSize(new Dimension(50,40));
        panel.add(space4);

        //email
        JLabel em=new JLabel("Personal Email");
        em.setForeground(new Color(10,30,230));
        em.setPreferredSize(new Dimension(150,40));
        em.setFont(f1);
        panel.add(em);

         emailt=new JTextField();
        emailt.setPreferredSize(new Dimension(250,40));
        emailt.setFont(f1);
        panel.add(emailt);

        JLabel space5=new JLabel();
        space5.setPreferredSize(new Dimension(50,40));
        panel.add(space5);

       /* JLabel space3=new JLabel();
        space3.setPreferredSize(new Dimension(250,40));
        panel.add(space3);*/

        JLabel phon=new JLabel("Phone Number");
       phon.setForeground(new Color(10,30,230));
        phon.setFont(f1);
        phon.setPreferredSize(new Dimension(150,40));
        panel.add(phon);

        //create for first name
        phones=new JTextField();
        phones.setPreferredSize(new Dimension(250,40));
        phones.setFont(f1);
        panel.add(phones);

        JLabel space6=new JLabel();
        space6.setPreferredSize(new Dimension(50,40));
        panel.add(space6);

        JLabel label_gender=new JLabel("Gender");
        label_gender.setFont(f1);
        label_gender.setForeground(new Color(10,30,230));
        label_gender.setPreferredSize(new Dimension(100,40));
        panel.add(label_gender);
//gender radio button

        JRadioButton male_button=new JRadioButton("Male");
        male_button.setFont(f1);
        male_button.setPreferredSize(new Dimension(100,40));
        male_button.setForeground(Color.BLUE);
        male_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gender="male";
            }
        });
        JRadioButton female_button=new JRadioButton("Female");
        female_button.setFont(f1);
        female_button.setPreferredSize(new Dimension(100,40));
        female_button.setForeground(Color.BLUE);
        female_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gender="female";
            }
        });
        panel.add(male_button);
        panel.add(female_button);


        ButtonGroup gender_group=new ButtonGroup();
        gender_group.add(male_button);
        gender_group.add(female_button);


        //create password

        JLabel space7=new JLabel();
        space7.setPreferredSize(new Dimension(500,40));
        panel.add(space7);


        JLabel p1=new JLabel("Create Password");
        p1.setForeground(new Color(10,30,230));
        p1.setPreferredSize(new Dimension(200,40));
        p1.setFont(f1);
        panel.add(p1);

        p1b=new JPasswordField();
        p1b.setPreferredSize(new Dimension(250,40));
        p1b.setFont(f1);
        p1b.setEchoChar('*');
        panel.add(p1b);


       /* JLabel space3=new JLabel();
        space3.setPreferredSize(new Dimension(250,40));
        panel.add(space3);*/

        JLabel p2=new JLabel("Conform Password");
        p2.setForeground(new Color(10,30,230));
        p2.setFont(f1);
        p2.setPreferredSize(new Dimension(200,40));
        panel.add(p2);

        //create for first name
        p2b=new JPasswordField();
        p2b.setPreferredSize(new Dimension(250,40));
        p2b.setFont(f1);
        p2b.setEchoChar('*');
        panel.add(p2b);

        JLabel space8=new JLabel();
        space8.setPreferredSize(new Dimension(500,60));
        panel.add(space8);
        
        
        JButton bback=new JButton("Back to home");
        bback.setBackground(new Color(49, 126, 241));
        bback.setForeground(Color.white);
        bback.setPreferredSize(new Dimension(400,40));
        bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   new login();
                   create_aco.dispose();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        panel.add(bback);


        JButton bcreate=new JButton("Finish");
        bcreate.setBackground(new Color(49, 126, 241));
        bcreate.setForeground(Color.white);
        bcreate.setPreferredSize(new Dimension(400,40));
        bcreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    coniformer();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        panel.add(bcreate);
        
        


        main_panel.add(panel0);
        main_panel.add(panel);
        create_aco.add(main_panel);
        create_aco.pack();
        create_aco.setVisible(true);
    }

    @SuppressWarnings("deprecation")
	public void coniformer() throws IOException {
        String passtemp="";
        boolean regestered=false;

       first_name+=fname.getText();
       last_name=lname.getText();
        email+=emailt.getText();
       
        password+=p1b.getText();
        phone=phones.getText();
        passtemp+=p2b.getText();
        if(new personal().isexist(email)||regestered){
            JOptionPane.showMessageDialog(create_aco,"account is already exist");
        }
        else {
            database d1 = new database(first_name, last_name, balance, email, gender, phone, password, city);
            JOptionPane.showMessageDialog(create_aco, "successfully registered");
            regestered=true;
        }
    }

    public static void main(String[] args) throws IOException {
        create_a a=new create_a();
    }

}
