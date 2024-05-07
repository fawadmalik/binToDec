import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.reverse;

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
            List<Integer> decimalsWithRev = new ArrayList<>();
            String[] nums = line.split(" ");
            for (String num : nums){
                decimals.add(convertBin2Dec(num));
                decimalsWithRev.add(convertBin2DecWithReverse(num));
            }
            System.out.println("conv " + decimals);
            System.out.println("revNconv " + decimalsWithRev);
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
    private int convertBin2DecWithReverse(String num) {
        String reverseNum = reverseString(num);
        int sum = 0;
        for(int i = 0; i < reverseNum.length(); i++){
            if(reverseNum.charAt(i) == '0'){continue;}
            Double doubleVal = Math.pow(2, i);
            sum += doubleVal.intValue();
        }
        return sum;

//        int sum = 0;
//        int start = num.length() - 1;
//        for(int i = start; i >= 0; i--){
//            char aChar = num.charAt(i);
//            if(aChar == '0'){ continue; }
//            int exp = (num.length() - 1) - i;
//            Double converted = Math.pow(2, exp);
//            sum += converted.intValue();
//        }
//        return sum;
    }

    private String reverseString(String num) {
        String rev = "";
        for(int i = num.length() - 1; i >= 0; i--){
            rev += num.charAt(i);
        }
        return rev;
    }
}
