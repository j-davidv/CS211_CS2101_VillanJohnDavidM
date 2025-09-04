import java.util.Scanner;

class Fibonacci {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of terms: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(" ");
            }

            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}