import java.util.Scanner;

class PerfectNumber {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num && num > 0) {
            System.out.println(num + " is a perfect number.");
        }
        else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}