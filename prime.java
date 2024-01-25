import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");
        int frist = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int last = scanner.nextInt();

        System.out.println("Prime numbers between " + frist + " and " + last + " are:");
        for (int i = frist; i <= last; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
