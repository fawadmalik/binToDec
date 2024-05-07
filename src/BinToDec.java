import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinToDec {
    public void printAll() {
        List<String> lines = new ArrayList<>();
        try {

            File file = new File("src/BinToDecData.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                lines.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        ConvertAndPrint(lines);
    }

    private void ConvertAndPrint(List<String> lines) {

        for(String line : lines){
            List<Integer> decimals = new ArrayList<>();
            String[] nums = line.split(" ");
            for (String num : nums){
                decimals.add(convertBin2Dec(num));
            }
            System.out.println(decimals);
        }
    }

    private int convertBin2Dec(String num) {
        int sum = 0;
        int start = num.length() - 1;
        for(int i = start; i >= 0; i--){
            char aChar = num.charAt(i);
            if(aChar == '0'){ continue; }
            int exp = (num.length() - 1) - i;
            Double converted = Math.pow(2, exp);
            sum += converted.intValue();
        }
        return sum;
    }
}
