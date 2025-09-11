package project;

import java.io.*;
public class FileReadStudent {
    public static void main(String[] args) {
        try {
            // Specify the file path
            File f1 = new File("E:\\abc.txt");

            // Check if the file exists
            if (f1.exists()) 
            {
                // Create a FileInputStream object
                FileInputStream input = new FileInputStream(f1);

                // Read the file content
                int byteRead;
                while ((byteRead = input.read()) != -1) {
                    System.out.print((char) byteRead); // Print the character
              }

                // Close the input stream
                input.close();
            } 
            else 
            {
                System.out.println("File not found!");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

