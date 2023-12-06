import java.io.*;
import java.util.StringTokenizer;

import javax.swing.*;
import java.awt.*;
public class ordered {
	static int row=0;
	static String ord[][];
	public  ordered() throws IOException {
		String readers = "";
        FileReader myprofile = null;
            int a;

            myprofile = new FileReader("ordered items.txt");
            int co=0;
            while ((a = myprofile.read()) != -1) {
                if((char)a=='|')
                    co++;
                else if((char)a=='\n') {
                    readers += '|';
                    co++;
                    continue;
                }

                readers += (char) (a);

            }
            row=co/5;
            myprofile.close();
            StringTokenizer token = new StringTokenizer(readers, "|");
             ord = new String[row][5];
            int rows=0,colomn=0;
            while(token.hasMoreTokens()){
                ord[rows][colomn]=token.nextToken();
                colomn++;
                if(colomn==5) {
                    colomn = 0;
                    rows++;
                }

            }
         
	}
	
	
	static public JPanel orderOf(String f) {
		//JFrame po =new JFrame();
		Font f1=new Font("ncfgdnh",Font.PLAIN,15);
		//po.setSize(500,400);
		JPanel pp=new JPanel();
		 pp.setBackground(Color.GRAY);
		    pp.setLayout(new FlowLayout());
		    pp.setPreferredSize(new Dimension(600,400));
		for(int i=0;i<row;i++) {
			if(ord[i][0].equals(f)) {
				JPanel pani=new JPanel();
				pani.setPreferredSize(new Dimension(200,150));
				pani.setBackground(Color.green);
				JTextArea txti=new JTextArea();
				txti.setPreferredSize(new Dimension(190,100));
				txti.setBackground(Color.gray);
				txti.setFont(f1);
				txti.setForeground(Color.white);
				String ss="Item name: "+ord[i][1]+"\n"+"Model: "+ord[i][2]+"\nAmount: "+ord[i][3]+"\nPrice: "+ord[i][4];
				txti.setText(ss);
				pani.add(txti);
				pp.add(pani);
				
			}
			
			//po.add(pani);
		}
		return pp;
		//po.setVisible(true);
	}
	

}
