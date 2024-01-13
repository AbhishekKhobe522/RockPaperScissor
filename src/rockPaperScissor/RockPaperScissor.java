package rockPaperScissor;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] availableMoves = { "Rock", "Paper", "Scissors" };
			String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
			System.out.println("Computer has choosen his move\n");
			System.out.println("Now its your Turn\n");

			String userMove;

			while (true) {
				System.out.println("Choose your move :'Rock','Paper','Scissors'\n");
				System.out.println("Enter your Move");
				userMove = sc.next();
				if (userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")) {
					System.out.println();
					break;
				}
				System.out.println("\nInvalid Move");
				System.out.println("please enter move from available move\n ");
			}
			System.out.println("computer choose: " + computerMove);
			if (userMove.equals(computerMove)) {
				System.out.println("its a Tie!");
			} else if (userMove.equals("Rock")) {
				if (computerMove.equals("Paper")) {
					System.out.println("Computer Won");
					System.out.println("Better Luck next Time");
				} else if (computerMove.equals("Scissors")) {
					System.out.println("You Won!");
					System.out.println("Congratulation!");
				}
			} else if (userMove.equals("Paper")) {
				if (computerMove.equals("Rock")) {
					System.out.println("You Won!");
					System.out.println("Congratulation!");
				} else if (computerMove.equals("Scissors")) {
					System.out.println("Computer Won");
					System.out.println("Better Luck next Time");
				}
			} else if (userMove.equals("Scissors")) {
				if (computerMove.equals("Rock")) {
					System.out.println("Computer Won");
					System.out.println("Better Luck next Time");
				} else if (computerMove.equals("Paper")) {
					System.out.println("You Won!");
					System.out.println("Congratulation!");
				}
			}
			System.out.println("\n");
			String playAgain;
			while (true) {
				System.out.println("type 'yes' or 'no' ");
				playAgain = sc.next();
				if (playAgain.equals("no") || playAgain.equals("No") || playAgain.equals("yes")
						|| playAgain.equals("Yes")) {
					System.out.println("\n***********************************************\n");
				}
				break;

			}
			if (playAgain.equals("no") || playAgain.equals("No"))
				break;

		}
		sc.close();
	}
}
