import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class store {
    String item_name,item_model;
    Double item_price;
    int item_amount;
    public store() throws FileNotFoundException {
        try {
            FileReader filestore = new FileReader("my item.txt");
            StringTokenizer stt = new StringTokenizer(item_model, "|");
        }
        catch (FileNotFoundException e){
            System.out.println("wrong");
        }
    }
}
