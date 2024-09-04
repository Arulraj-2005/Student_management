import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the scores of 5 students
        int[] scores = new int[5];

        // Step 1: Get the scores from the user
        System.out.println("Enter the scores of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Step 2: Calculate the average score
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        double averageScore = (double) totalScore / 5;

        // Step 3: Find the highest score
        int highestScore=scores[0];
        for (int score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }

        // Step 4: Find the lowest score
        int lowestScore = scores[0];
        for (int score : scores) {
            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        // Step 5: Print all the scores along with the calculated average, highest, and lowest scores
        System.out.println("Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Average Score: " + averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);

        scanner.close();
    }
}