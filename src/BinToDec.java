import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinToDec {
    public void printAll() {
        try {
            File file = new File("src/BinToDecData.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
