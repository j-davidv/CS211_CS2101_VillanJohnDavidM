import java.util.Scanner;

class FizzBuzz {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an upper bound: ");
        int upper_bound = scanner.nextInt();

        for (int i = 1; i <= upper_bound; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}