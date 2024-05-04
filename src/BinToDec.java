import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Bin2Dec{
	public static void main(String[] args) throws FileNotFoundException {
		List<String> lines = new ArrayList();
		Scanner sc = new Scanner(new File("src/bindata.txt"));
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			lines.add(line);
		}
		
		for(String line : lines){
			System.out.println(line);
		}
	}
}