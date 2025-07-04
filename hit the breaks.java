public class HelloWorld {
    public static void main(String[] args) {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Check if number is divisible by both 2 and 3
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Break at " + i);
                break; // Exit the loop
            } else {
                System.out.println("i = " + i);
            }
        }

        System.out.println("Loop ended.");
    }
}
