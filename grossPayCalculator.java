import java.util.Scanner;
public class grossPayCalculator {
    public static void main(String[] args) {
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly payment?");
        double rate = scanner.nextDouble();
        scanner.close();

        double payRate = hours * rate;

        System.out.println("Gross Pay: " + payRate);
    }
}
