import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class insert_item extends view_items{
     Font f1=new Font("dddd",Font.PLAIN,20);
     static JTextField text_item,text_model,text_price,text_amount;
     JLabel total_price;
    static JFrame item;
    insert_item(){
         item=new JFrame();
        JPanel pan=new JPanel();
        pan.setPreferredSize(new Dimension(1000,800));
        pan.setBackground(new Color(28, 133, 121));

        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout() );
        p1.setBackground(new Color(105, 234, 234));
        p1.setPreferredSize(new Dimension(250,800));
        pan.add(p1);

        JPanel p2=new JPanel();
        p2.setLayout(new FlowLayout() );
        p2.setBackground(new Color(153, 194, 194));
        p2.setPreferredSize(new Dimension(700,800));

        JLabel lab1=new JLabel("                         inserting item");
        lab1.setForeground(Color.BLUE);
        lab1.setPreferredSize(new Dimension(600,50));
        lab1.setFont(f1);
        p2.add(lab1);

        JLabel lab2=new JLabel("Item Name");
        lab2.setForeground(Color.BLUE);
        lab2.setFont(f1);
        lab2.setPreferredSize(new Dimension(150,40));
        p2.add(lab2);

        text_item=new JTextField();
        text_item.setPreferredSize(new Dimension(200,40));
        text_item.setFont(f1);
        p2.add(text_item);

        JLabel space1=new JLabel();
        space1.setPreferredSize(new Dimension(200,40));
        p2.add(space1);

        JLabel model=new JLabel("Model of Item");
        model.setForeground(Color.BLUE);
        model.setFont(f1);
        model.setPreferredSize(new Dimension(150,40));
        p2.add(model);

        text_model=new JTextField();
        text_model.setPreferredSize(new Dimension(200,40));
        text_model.setFont(f1);
        p2.add(text_model);

        JLabel space2=new JLabel();
        space2.setPreferredSize(new Dimension(200,40));
        p2.add(space2);

        JLabel price=new JLabel("Price of Each");
        price.setFont(f1);
        price.setPreferredSize(new Dimension(150,40));
        price.setForeground(Color.blue);
        p2.add(price);

        text_price =new JTextField();
        text_price.setFont(f1);
        text_price.setPreferredSize(new Dimension(200,40));
        p2.add(text_price);

        JLabel space3=new JLabel();
        space3.setPreferredSize(new Dimension(200,40));
        p2.add(space3);

        JLabel amount=new JLabel("Amount of Item");
        amount.setFont(f1);
       amount.setPreferredSize(new Dimension(150,40));
       amount.setForeground(Color.blue);
        p2.add(amount);

        text_amount =new JTextField();
        text_amount.setFont(f1);
        text_amount.setPreferredSize(new Dimension(200,40));
        p2.add(text_amount);

        JLabel space4=new JLabel();
        space4.setPreferredSize(new Dimension(200,40));
        p2.add(space4);

        JLabel space5=new JLabel();
        space5.setPreferredSize(new Dimension(600,100));
        p2.add(space5);

        JButton button=new JButton("Finish");
        button.setBackground(new Color(20,100,240));
        button.setForeground(Color.white);
        button.setPreferredSize(new Dimension(300,40));
        p2.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    adder();
                   // item.dispose();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        
        
        JButton back=new JButton("Back to Menu");
        back.setBackground(new Color(20,100,240));
        back.setForeground(Color.white);
        back.setPreferredSize(new Dimension(300,40));
        p2.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new manager_interface();
            	item.dispose();
            }
            });

        pan.add(p2);



        item.add(pan);

        item.pack();
        item.setVisible(true);
        }
        static void adder() throws IOException {
            FileWriter writer=new FileWriter("my item.txt",true) ;
            String temporal=text_item.getText()+"|"+text_model.getText()+"|"+text_price.getText()+"|"+text_amount.getText()+"\n";
            if(!checkItem(text_item.getText(), text_model.getText())) {
            writer.write(temporal);
            writer.close();
            JOptionPane.showMessageDialog(item,"succesfully added");
            }
            else
            	  JOptionPane.showMessageDialog(item,"items is already exist");
        }

}
