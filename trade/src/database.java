import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class database {
    public database(String first_name,String last_name,int balance,String email,String gender,String phone,String password,String city) throws IOException {
        try {
        FileWriter file=new FileWriter("users information.txt",true);
            file.append(first_name).append("|").append(last_name).append("|").append(String.valueOf(balance)).append("|").append(email).append("|").append(phone).append("|").append(password).append("|").append(gender).append("|").append(city).append("\n");
             file.close();
        } catch (IOException e) {
           // JOptionPane.showMessageDialog(create_aco,"unable to create account");
            throw new RuntimeException(e);
        }
    }
    
    public database(String name,String item,String model,int amount,int price) throws IOException {
    	try {
			FileWriter write=new FileWriter("ordered items.txt",true);
			write.write(name+"|"+item+"|"+model+"|"+amount+"|"+price+"\n");
			write.close();
		} catch (IOException e) {
            System.out.println("something is wrong");
		}

    }
    public static void main(String []argv) throws IOException {
     new database("fira","pc","hp",23,21);
    }
}
