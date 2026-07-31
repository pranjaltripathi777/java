import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("output.txt");

            writer.write("Hello Java");
            writer.close();

            System.out.println("Data written successfully to output.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
