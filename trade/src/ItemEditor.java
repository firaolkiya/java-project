import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ItemEditor {
    public static void deleteItem(String item) throws IOException {
        FileReader fileReader = new FileReader("ordered items.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        StringBuilder fileContent = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            String[] itemDetails = line.split("\\|");
            String currentItem = itemDetails[1]; // Assuming item name is stored at index 1

            if (!currentItem.equals(item)) {
                fileContent.append(line).append("\n");
            }
        }

        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("ordered items.txt");
        fileWriter.write(fileContent.toString());
        fileWriter.close();
    }

    public static void updatePrice(String item, int newPrice) throws IOException {
        FileReader fileReader = new FileReader("ordered items.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        StringBuilder fileContent = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            String[] itemDetails = line.split("\\|");
            String currentItem = itemDetails[1]; // Assuming item name is stored at index 1

            if (currentItem.equals(item)) {
                itemDetails[4] = String.valueOf(newPrice); // Assuming price is stored at index 4
                line = String.join("|", itemDetails);
            }

            fileContent.append(line).append("\n");
        }

        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("ordered items.txt");
        fileWriter.write(fileContent.toString());
        fileWriter.close();
    }

    public static void updateAmount(String item, int soldAmount) throws IOException {
        FileReader fileReader = new FileReader("ordered items.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        StringBuilder fileContent = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            String[] itemDetails = line.split("\\|");
            String currentItem = itemDetails[1]; // Assuming item name is stored at index 1

            if (currentItem.equals(item)) {
                int currentAmount = Integer.parseInt(itemDetails[3]); // Assuming amount is stored at index 3
                int newAmount = currentAmount - soldAmount;
                if (newAmount < 0) {
                    newAmount = 0;
                }
                itemDetails[3] = String.valueOf(newAmount);
                line = String.join("|", itemDetails);
            }

            fileContent.append(line).append("\n");
        }

        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("ordered_items.txt");
        fileWriter.write(fileContent.toString());
        fileWriter.close();
    }

    public static void main(String[] args) {
        try {
            // Example usage: delete item "pc", update price of item "laptop" to 1500, and update amount of item "mouse" after selling 2 items
            deleteItem("pc");
            updatePrice("laptop", 1500);
            updateAmount("mouse", 2);
            System.out.println("Item editing completed successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while editing the items: " + e.getMessage());
        }
    }
}