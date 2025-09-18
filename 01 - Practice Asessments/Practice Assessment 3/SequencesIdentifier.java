import java.util.Scanner;
public class SequencesIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 5 elements of the sequence: ");
        int[] sequence = new int[5];
        for (int i = 0; i < 5; i++) {
            sequence[i] = scanner.nextInt();
        }

        boolean isArithmetic = arithmetic(sequence);
        boolean isGeometric = geometric(sequence);

        if (isArithmetic) {
            System.out.print("Find which element: ");
            int n = scanner.nextInt();
            int _1stTerm = sequence[0];
            int commonDifference = sequence[1] - sequence[0];
            int nthTerm = _1stTerm + (n - 1) * commonDifference;
            System.out.println("Element " + n + " is " + nthTerm);
        } else if (isGeometric) {
            System.out.print("Find which element: ");
            int n = scanner.nextInt();
            if (sequence[0] == 0) {
                System.out.println("Element " + n + " is 0");
            } else {
                int _1stTerm = sequence[0];
                int commonRatio = sequence[1] / sequence[0];
                int nthTerm = _1stTerm;
                for (int i = 1; i < n; i++) {
                    nthTerm *= commonRatio;
                }
                System.out.println("Element " + n + " is " + nthTerm);
            }
        } else {
            System.out.println("The sequence is neither arithmetic nor geometric.");
        }

        scanner.close();
    }

    public static boolean arithmetic(int[] seq) {
        int commonDifference = seq[1] - seq[0];
        for (int i = 2; i < seq.length; i++) {
            if (seq[i] - seq[i - 1] != commonDifference) {
                return false;
            }
        }
        return true;
    }

    public static boolean geometric(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            if (seq[i] == 0) {
                if (seq[i + 1] != 0) {
                    return false;
                }
            }
        }
        if (seq[0] == 0) {
            return true; // All terms are zero
        }
        if (seq[1] % seq[0] != 0) {
            return false; // Not an integer ratio
        }
        int commonRatio = seq[1] / seq[0];
        for (int i = 2; i < seq.length; i++) {
            if (seq[i - 1] == 0 || seq[i] % seq[i - 1] != 0 || seq[i] / seq[i - 1] != commonRatio) {
                return false;
            }
        }
        return true;
    }
}