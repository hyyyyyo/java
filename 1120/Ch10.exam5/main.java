package exam5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;


public class main {

	public static void main(String[] args) {
		File file = new File("Temp.txt");
		
		try {
			FileReader reader = new FileReader("Temp.txt");
			ch = reader.read();
		} catch (FileNotFoundException e) {
			System.out.println("Error!!!");
		}
		try {
			FileOutputStream os = new FileOutputStream("Temp.txt");
			os.write(123);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
