import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreetStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); 

        List<String> students = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students.add(studentName);
        }

        greetStudents(students);

        scanner.close();
    }

    public static void greetStudents(List<String> students) {
        for (String student : students) {
            System.out.println("Hello, " + student + "!");
        }
    }
}