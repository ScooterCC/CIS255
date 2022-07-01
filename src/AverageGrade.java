import java.util.Scanner;

public class AverageGrade {
    public static void main (String[] args) {

        // Variables
        Scanner input = new Scanner(System.in);
        System.out.print("Enter test grade for student 1:");
        double testGrade1 = input.nextInt();
        System.out.print(" Enter test grade for student 2:");
        double testGrade2 = input.nextInt();
        System.out.print(" Enter test grade for student 3:");
        double testGrade3 = input.nextInt();
        System.out.print(" Enter test grade for student 4:");
        double testGrade4 = input.nextInt();
        System.out.print(" Enter test grade for student 5:");
        double testGrade5 = input.nextInt();
        System.out.println(" The letter grades are as follows:");
        System.out.println("Student 1: " + determineGrade(testGrade1));
        System.out.println("Student 2: " + determineGrade(testGrade2));
        System.out.println("Student 3: " + determineGrade(testGrade3));
        System.out.println("Student 4: " + determineGrade(testGrade4));
        System.out.println("Student 5: " + determineGrade(testGrade5));
        System.out.printf("The average grade was: %.2f", (calcAverage(testGrade1, testGrade2,testGrade3,testGrade4,testGrade5)));
        }
        // Determine average.
        public static double calcAverage(double testGrade1, double testGrade2, double testGrade3, double testGrade4, double testGrade5) {
            double sum = (testGrade1+testGrade2+testGrade3+testGrade4+testGrade5);
            double averageScore = sum/5.0;
            return averageScore;
        }
        // Assign letter grade.
        public static String determineGrade (double score) {
            String letterGrade;
            if (score >=90 && score<= 100) {
                letterGrade= "A";
            }
            else if (score >= 80 && score<= 89) {
                letterGrade= "B";
            }
            else if (score >=70 && score<= 79) {
                letterGrade= "C";
            }
            else if (score >=60 && score<= 69) {
                letterGrade= "D";
            }
            else {
                letterGrade= "F";
            }
            return letterGrade;
        }
}
