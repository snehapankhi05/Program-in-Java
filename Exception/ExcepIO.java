package project;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExcepIO{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();

        System.out.println("Enter student roll number:");
        int rollNumber = scanner.nextInt();

        scanner.close();

        try (PrintWriter writer = new PrintWriter(new FileWriter("emp.txt"))) {
            writer.println("Student Name: " + name);
            writer.println("Student Age: " + age);
            writer.println("Student Roll Number: " + rollNumber);
            System.out.println("Student details written to emp.txt file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}


