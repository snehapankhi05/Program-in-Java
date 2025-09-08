package project;

import java.io.File;
import java.io.*;
public class ExcepChecked {

	public static void main(String[] args) {
		

		
		        try {
		            File file = new File("example.txt");
		            FileReader reader = new FileReader(file);
		        } catch (FileNotFoundException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		

}
