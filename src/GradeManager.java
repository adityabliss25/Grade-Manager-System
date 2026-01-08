import java.util.Scanner;
import java.util.InputMismatchException;
public class GradeManager
{
    // Inside the GradeManager class, but outside any other method

    public double calculateAverage(int[] marks) {
        double totalSum = 0;

        // Using the 'for-each' loop for clean array iteration
        for (int mark : marks) {
            totalSum += mark;
        }

        // Check to prevent division by zero if the array is somehow empty
        if (marks.length == 0) {
            return 0.0;
        }

        return totalSum / marks.length;
    }
    // Inside the GradeManager class, but outside any other method

    public String getGradeCategory(double average) {
        String grade;

        // Logical control flow to assign grades based on ranges
        if (average >= 90) {
            grade = "A (Excellent)";
        } else if (average >= 80) {
            grade = "B (Very Good)";
        } else if (average >= 70) {
            grade = "C (Good)";
          else if (average >= 60) {
            grade = "D (Good)";
        } else {
            grade = "F (Failing)";
        }

        return grade;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMarks;

        // 1. Get the number of marks using basic error handling (try-catch)
        System.out.print("Enter the number of marks you will input: ");
        try {
            numMarks = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a whole number for the count.");
            return; // Exit program on error
        }

        // 2. Initialize the array
        int[] marks = new int[numMarks];

        // 3. Get individual marks using a loop
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + " (0-100): ");
            // We'll put another try-catch here for robustness, although often omitted in simple examples
            try {
                marks[i] = scanner.nextInt();
                // Simple validation
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Warning: Mark is outside the 0-100 range. Continuing...");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid mark entered. Using 0 for this mark.");
                marks[i] = 0; // Default to 0 to keep the array consistent
                scanner.nextLine(); // Clear the bad input from the buffer
            }
        }

        // 4. Calculate and Display Results
        GradeManager manager = new GradeManager(); // Create instance
        double average = manager.calculateAverage(marks);
        String finalGrade = manager.getGradeCategory(average);

        System.out.println("\n----------------------------------");
        System.out.printf("Calculated Average: %.2f\n", average);
        System.out.println("Grade Category: " + finalGrade);
        System.out.println("----------------------------------");

        scanner.close();
    }
}
