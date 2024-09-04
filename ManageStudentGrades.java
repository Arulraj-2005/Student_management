import java.util.Scanner;

public class ManageStudentGrades {

    public static void calculateStudentAverages(int[][] scores) {
        for (int i = 0; i < scores.length; i++) {
            double total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = total / scores[i].length;
            System.out.printf("Student %d: %.2f%n", i + 1, average);
        }
    }

    public static void calculateSubjectAverages(int[][] scores) {
        if (scores.length == 0) {
            return;
        }

        for (int j = 0; j < scores[0].length; j++) {
            double total = 0;
            for (int i = 0; i < scores.length; i++) {
                total += scores[i][j];
            }
            double average = total / scores.length;
            System.out.printf("%s: %.2f%n", getSubjectName(j), average);
        }
    }

    public static String getSubjectName(int index) {
        switch (index) {
            case 0: return "Math";
            case 1: return "Science";
            case 2: return "English";
            case 3: return "History";
            default: return "Subject " + (index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[][] scores = new int[numStudents][numSubjects];

        String[] subjects = new String[numSubjects];
        scanner.nextLine(); 

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the scores for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nAverage scores for each student:");
        calculateStudentAverages(scores);

        System.out.println("\nAverage scores for each subject:");
        calculateSubjectAverages(scores);

        scanner.close();
    }
}
