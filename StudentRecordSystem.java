import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks;
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n1. Add Student\n2. Display All Students\n3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.next();
                        System.out.print("Enter roll number: ");
                        int rollNumber = scanner.nextInt();
                        System.out.print("Enter marks: ");
                        double marks = scanner.nextDouble();

                        Student newStudent = new Student(name, rollNumber, marks);
                        studentList.add(newStudent);

                        System.out.println("Student added successfully!");
                        break;

                    case 2:
                        if (studentList.isEmpty()) {
                            System.out.println("No student records available.");
                        } else {
                            System.out.println("Student Records:");
                            for (Student student : studentList) {
                                System.out.println(student);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }
}
