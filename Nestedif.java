import java.util.Scanner;
public class Nestedif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        int requiredSalary = scanner.nextInt();
        int years = scanner.nextInt();
        int requiredYearsEmployed = scanner.nextInt();

        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("You qualify for the loan.");
            } else {
                System.out.println("Sorry, you do not qualify.");
            }
        }
    }
    
}
