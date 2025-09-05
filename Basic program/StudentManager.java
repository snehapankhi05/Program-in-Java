package project;

/*
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<StudentFile> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void saveStudentsToFile(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(students);
            System.out.println("Students saved to file successfully!");
            out.close();
            fileOut.close();
        } catch (IOException e) {
            System.err.println("Error saving students to file: " + e.getMessage());
        }
    }

    public void loadStudentsFromFile(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            students = (List<Student>) in.readObject();
            System.out.println("Students loaded from file successfully!");
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading students from file: " + e.getMessage());
        }
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("John Doe", 20, "A"));
        manager.addStudent(new Student("Jane Doe", 22, "B"));

        manager.saveStudentsToFile("students.dat");

        manager.loadStudentsFromFile("students.dat");

        manager.printStudents();
    }
}

class StudentFile {
    String name;
    int age;
    String grade;

    public StudentFile(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
/*

