import java.util.Scanner;
public class quotaCalculator {
    public static void main(String[] args){
        int quota = 10;

        System.out.println("Enter the number of sales made:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Congrats! You've met your quoata");

        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota." + " You were " + salesShort + " sales short.");

        }
    }
}
