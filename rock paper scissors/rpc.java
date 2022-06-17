package rockpapersciccors;

import java.util.Scanner;

public class rpc {
	
	private static int random;
	private static String token;
	private static int input;
	private static String token2;
	private static Scanner scanner;
	
	public static Scanner maakScanner() {
		scanner = new Scanner(System.in);
		return scanner;
	}

	public static int getRandom() {
		random = (int) (Math.random()*3+1);
		return random;
	}
	
	public static String randomToToken(int random) {
		switch (random) {
		case 1: 
			token = "rock";
			return token;
		case 2:
			token = "paper";
			return token;
		case 3:
			token = "scissors";
			return token;
		default:
			return "error";
		}
	}
	
	public static int getInput(Scanner scanner) {
		System.out.println("rock (1) paper (2) or scissors (3)?");
		input = scanner.nextInt();
		return input;
	}
	
	public static String inputToToken(int input) {
		switch (input) {
		case 1: 
			token2 = "rock";
			return token2;
		case 2:
			token2 = "paper";
			return token2;
		case 3:
			token2 = "scissors";
			return token2;
		default:
			return "error";
		}
	}
	
	public static void checkWinner(int input, int random) {
		if (input == 1) {
			if (random == 1) {
				System.out.println("draw");
			} else if (random == 2) {
				System.out.println("you lose");
			} else {
				System.out.println("you win");
			}
		} else if (input == 2) {
			if (random == 1) {
				System.out.println("you win");
			} else if (random == 2) {
				System.out.println("draw");
			} else {
				System.out.println("you lose");
			}
		} else if (input == 3) {
			if (random == 1) {
				System.out.println("you lose");
			} else if (random == 2) {
				System.out.println("you win");
			} else {
				System.out.println("draw");
			}
		}
	}
	
	public static void playAgain() {
		System.out.println();
		System.out.println("play again? y/n");
		String x = scanner.next();
		if (x.equals("y") || x.equals("Y")) {
			System.out.println("\r\n\r\n\r\n\r\n");
			main(null);
		} else if (x.contains("n") || x.contains("N")) {
			System.out.println("bye");
		}
	}
	
	public static void main(String[] args) {
		maakScanner();
		getInput(scanner);
		System.out.println(inputToToken(input));
		getRandom();
		System.out.println(randomToToken(random));
		checkWinner(input, random);
		playAgain();
	}

}
