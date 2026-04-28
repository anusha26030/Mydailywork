import java.util.*;
public class game {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        int score = 0;
	        String playAgain;

	        do {
	            int number = rand.nextInt(100) + 1;
	            int attempts = 4;
	            boolean guessedCorrectly = false;

	            System.out.println("\n--- New START ---");
	            System.out.println("GUESS WHERE THE ICE CREAM IS AT 1 and 100");
	            System.out.println("YOU HAVE 4 ATTEMPTS TO GET A ICE CREAM");
	            System.out.println("WINNERS WILL HAVE A FREE ICE CREAM");
	            System.out.println("RUNNERS GET ANOTHER CHANCE TO WIN");

	            for (int i = 1; i <= attempts; i++) {
	                System.out.print("Attempt " + i + ": ");
	                int guess = sc.nextInt();

	                if (guess == number) {
	                    System.out.println("Correct! You win!");
	                    score++;
	                    guessedCorrectly = true;
	                    break;
	                } else if (guess > number) {
	                    System.out.println("VERY NEAR TO  GET A ICE CREAM!");
	                } else {
	                    System.out.println("NOT FAR ALSO");
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println(" BUT ICREAM HIDDENT UNDER : " + number);
	                System.out.println(" ONE MORE ICE CEAM IS MELTING FOR YOU");
	            }

	            System.out.println(" Current Score: " + score);

	            System.out.print("Do you want to GRAB THAT ICE CREAM WHICH IS MELTHNG FOR YOU NOW? (yes/no): ");
	            playAgain = sc.next();

	        } while (playAgain.equalsIgnoreCase("yes"));

	        System.out.println("\n🎮 Final Score: " + score);
	        System.out.println("Thanks for playing!");

	        sc.close();
	    }
	}


