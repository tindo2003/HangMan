package Hangman;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
	private Wordmenu wordMenu;
	private String chosenWord;
	private PrintMan printMan;

	public Test() {
		this.wordMenu = new Wordmenu();
		this.chosenWord = "";
		this.printMan = new PrintMan();

	}

	public void hang() {

		Random y = new Random();
		int ranNum = y.nextInt(3);
		int ranNum1 = y.nextInt(4);
		wordMenu.addWords(ranNum);
		chosenWord += wordMenu.getMenu().get(ranNum1);

	}

	public void getHint() {
		System.out.println("The word has " + chosenWord.length() + " letters ");
	}

	public String getchosenWord() {
		return chosenWord;
	}

	public void play() {
		int count = 5;
		String copyOfchosenWord = "";
		for (int i = 0; i < chosenWord.length(); i++) {
			copyOfchosenWord += "_";
			copyOfchosenWord += " ";
		}
		System.out.println(copyOfchosenWord);

		StringBuilder myName = new StringBuilder(copyOfchosenWord);
		boolean falseTrue = false;
		while (myName.toString().contains("_") && count >= 0) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a character of the word");
			String data = input.next();
			char userInput = data.charAt(0);
			boolean trueFalse = false;
			for (int i = 0; i < chosenWord.length(); i++) {
				if (userInput == chosenWord.charAt(i)) {
					myName.setCharAt((i * 2), userInput);
					trueFalse = true;
					System.out.println("The character matches the word at position " + (i + 1));
				}

			}
			if (trueFalse == false) {
				System.out.println("Does not match. Please reenter.");
				printMan.printMan(count);
				count--;

			}
			System.out.println(myName);
			falseTrue = true;
		}
		if (!myName.toString().contains("_"))
			System.out.println("You have won");
		else {
			System.out.println("You have lost. The word is " + chosenWord);
			System.out.println("_________");
			System.out.println("|\t|");
			System.out.println("|\to");
			System.out.println("|      \\|/");
			System.out.println("|\t|");
			System.out.println("|      / \\");
			System.out.println("|________");
			System.out.println("|\t |");
		}
	}
}
