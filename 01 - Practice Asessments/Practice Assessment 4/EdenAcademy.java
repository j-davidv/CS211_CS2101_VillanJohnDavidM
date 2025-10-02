import java.util.Scanner;

public class EdenAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();
        int[] grades = new int[n];

        System.out.print("Enter grades: ");
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }
        System.out.println();

        int[] sortedGrades = new int[n]; 
        for (int i = 0; i < n; i++) {
            int grade = grades[i];
            int finalGrade = grade;

            if (grade >= 78) {
            int gradeMultiple = ((grade / 5) + 1) * 5;
                if (gradeMultiple - grade < 3) {
                    finalGrade = gradeMultiple;
                }
            }
            sortedGrades[i] = finalGrade;
        }

        System.out.print("Passed: ");
        boolean passed = true;
        int passCount = 0;
        for (int score : sortedGrades) {
            if (score >= 80) {
                passCount++;
                if (passed) {
                    System.out.print(score);
                    passed = false;
                } else {
                    System.out.print(" " + score);
                }
            }
        }
        System.out.println();

        System.out.print("Failed: ");
        boolean failed = true;
        int failCount = 0;
        for (int score : sortedGrades) {
            if (score < 80) {
                failCount++;
                if (failed) {
                    System.out.print(score);
                    failed = false;
                } else {
                    System.out.print(" " + score);
                }
            }
        }
        System.out.println();
        System.out.println();

        int stellaStars = passCount / 3;
        int tonitrusBolts = failCount;

        System.out.println("Stella Stars: " + stellaStars);
        System.out.println("Tonitrus Bolts: " + tonitrusBolts);

        sc.close();
    }
}