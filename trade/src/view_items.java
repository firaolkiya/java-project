import java.io.*;
		import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;
		import java.util.ArrayList;
public class view_items extends ItemEditor{
		Border border=BorderFactory.createEtchedBorder(10,Color.yellow, Color.yellow);
            static int row=0;
		    public static String [][]readFile(String filePath) {
		        ArrayList<String> itemsInfomation = new ArrayList<>();

		        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
		            String items;
		            while ((items = reader.readLine()) != null) {
		                itemsInfomation.add(items);
		                
		            }
		        } catch (IOException e) {
		    
		        	
		        }
		        row = itemsInfomation.size();
		        int index = 0;
		        String[][] ReadedResult = new String[row][4];
		        for (String line : itemsInfomation) {
		            String[] values = line.split("\\|");
		            int col = 0;
		            for (String item : values){
		                ReadedResult[index][col] = item;
		                col++;
		            }
		            index++;
		        }
		        return ReadedResult;
		    }



		    static String [][] Items = readFile("my item.txt");
		    static String [] myItem = {"Item Name", "Item Model", "Item Price", "Amount"};

		  
		    
		    public static boolean checkItem(String name,String model) {
		    	    for(int i=0;i<row;i++) {
		    	    	if(Items[i][0].equals(name)&&Items[i][1].equals(model))
		    	    		return true;
		    	    }
		    	
		    	return false;
		    }

		   
		     


	}


