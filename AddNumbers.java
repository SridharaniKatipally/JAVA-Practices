import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("Enter the first Number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second Number");
            double num2 = scanner.nextDouble();

            System.out.println("Sum: "+(num1 + num2));
            System.out.println("Would you like to do it again? 0 for no, 1 for yes");
            again = scanner.nextBoolean();


        }while(again);



    }
    
}
