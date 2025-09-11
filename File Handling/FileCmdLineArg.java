package project;

import java.io.*;
import java.util.*;
import java.lang.Exception;

public class FileCmdLineArg {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WordCounter <filename>");
            return;
        }

        String filename = args[0];
        File file = new File(filename);

        try {
            Scanner scanner = new Scanner(file);
            int wordCount = 0;

            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }

            scanner.close();
            System.out.println("Number of words in " + filename + ": " + wordCount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


