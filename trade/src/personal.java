import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class personal extends ordered {
    public String user_name,first_name = "", last_name = "", email = "", password = "", gender = "male", phone = "",city="Addis ababa";
    int balance = 0;
    int row=0;
    
    String arr[][];
//fname,lastname,balance, email,phone,password,gender,city
    personal() throws IOException {
        String readers = "";
        FileReader myprofile = null;
            int a;

            myprofile = new FileReader("users information.txt");
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
            row=co/8;
            myprofile.close();
            StringTokenizer token = new StringTokenizer(readers, "|");
             arr = new String[row][8];
            int rows=0,colomn=0;
            while(token.hasMoreTokens()){
                arr[rows][colomn]=token.nextToken();
                colomn++;
                if(colomn==8) {
                    colomn = 0;
                    rows++;
                }

            }
        }
    	int index=-1;
        public boolean isexist(String first) {
            for (int k = 0; k < row; k++) {
                if (arr[k][3].equals(first)) {
                	index=k;
                        return true;         
            }
            }
          return  false;
        }
        
        public int getindex(String username) {
        	for (int k = 0; k < row; k++) {
                if (arr[k][3].equals(username)) {
                	index=k;
                               
                      }
            }
        	 return index; 
        }
        
        public static void Update(String email,int balance) throws IOException{
        	        // Read the existing file
        	        FileReader fileReader = new FileReader("users information.txt");
        	        BufferedReader bufferedReader = new BufferedReader(fileReader);
        	        String line;
        	        StringBuilder fileContent = new StringBuilder();

        	        // Iterate through each line of the file
        	        while ((line = bufferedReader.readLine()) != null) {
        	            // Split the line by "|" delimiter to extract email and other information
        	            String[] userDetails = line.split("\\|");
        	            String currentEmail = userDetails[3]; // Assuming email is stored at index 3

        	            // Check if the current line's email matches the provided email
        	            if (currentEmail.equals(email)) {
        	                // Update the balance in the line
        	                userDetails[2] = String.valueOf(balance);
        	                // Reconstruct the modified line
        	                line = String.join("|", userDetails);
        	            }

        	            // Append the line to the file content
        	            fileContent.append(line).append("\n");
        	        }

        	        bufferedReader.close();

        	        // Write the modified content back to the file
        	        FileWriter fileWriter = new FileWriter("users information.txt");
        	        fileWriter.write(fileContent.toString());
        	        fileWriter.close();
        	    
        	
        }
        	
        


    public static void main(String[] args) throws IOException {
        personal p=new personal();
    }
}
