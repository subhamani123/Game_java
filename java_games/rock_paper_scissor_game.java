import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor_game{
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        while (true) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String userChoice = sc.nextLine();
            if (userChoice.equalsIgnoreCase("quit")) {
                System.out.println("\nThanks for playing. Goodbye!");
                break;
            }
            if (!isValidChoice(userChoice)) {
                System.out.println("\nInvalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }
            Random random = new Random();
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];
            System.out.println("\nYour choice: " + userChoice);
            System.out.println("\nComputer's choice: " + computerChoice);
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }
    }
    private static boolean isValidChoice(String choice) {
        return choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors");
    }
    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
