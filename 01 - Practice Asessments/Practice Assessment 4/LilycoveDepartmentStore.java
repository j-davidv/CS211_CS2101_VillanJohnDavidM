import java.util.Scanner;

public class LilycoveDepartmentStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total: ");
        int total = sc.nextInt();

        System.out.print("Your payment: ");
        int payment = sc.nextInt();

        if (payment < total) {
            System.out.println("You don't have enough money.");
        } else if (payment == total) {
            System.out.println("Thank you for shopping!");
        } else {
            int change = payment - total;
            System.out.println("Your change is " + change + ". Here's your change: ");
            
            int[] changes = {1000, 500, 100, 50, 20, 10, 5, 1};
            String[] types = {"bill", "bill", "bill", "bill", "coin", "coin", "coin", "coin"};
            
            int finalChange = change;
            for (int i = 0; i < changes.length; i++) {
                int changeValue = changes[i];
                int count = finalChange / changeValue;

                if (count > 0) {
                    System.out.println(count + " " + changeValue + "-pesos " + types[i]);
                    finalChange = finalChange % changes[i];
                }
            }
        }
        sc.close();
    }
}
