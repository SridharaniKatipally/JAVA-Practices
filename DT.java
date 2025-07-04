import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer
        int i = scanner.nextInt();

        // Read double
        double d = scanner.nextDouble();

        // Clear the newline after double input
        scanner.nextLine();

        // Read string (entire line)
        String s = scanner.nextLine();

        // Print in required format
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scanner.close();
    }
}
