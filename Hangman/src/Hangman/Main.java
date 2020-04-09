package Hangman;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Test test = new Test();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to hangman!");
		System.out.println ("You only have 5 tries. Think before you enter!");
		System.out.println("-------------------");
		input.nextLine();
		test.hang();
		input.nextLine();
		test.getHint();
		test.play();
		
		
		

	}
}
