public class HelloWorld {
    public static void main(String[] args) {
        // Loop from 1 to 52
        for (int card = 1; card <= 52; card++) {
            if (card == 32) {
                System.out.println("An incorrect card was found in item 32.");
                break; // Stop the loop
            } else {
                System.out.println("Card " + card);
            }
        }
    }
}
