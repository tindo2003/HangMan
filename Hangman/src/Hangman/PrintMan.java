package Hangman;

public class PrintMan {

	public void printMan(int num) {
		switch (num) {
		case 5:

			System.out.println("_________");
			System.out.println("|");
			System.out.println("| ");
			System.out.println("|       ");
			System.out.println("|		");
			System.out.println("|      	");
			System.out.println("|________");
			System.out.println("|\t |");
			break;
		case 4:
			System.out.println("_________");
			System.out.println("|\t|");
			System.out.println("|\to");
			System.out.println("|      ");
			System.out.println("|");
			System.out.println("|      ");
			System.out.println("|________");
			System.out.println("|\t |");
			break;
		case 3:
			System.out.println("_________");
			System.out.println("|\t|");
			System.out.println("|\to");
			System.out.println("|\t|");
			System.out.println("|\t|");
			System.out.println("|      ");
			System.out.println("|________");
			System.out.println("|\t |");
			break;
		case 2:
			System.out.println("_________");
			System.out.println("|\t|");
			System.out.println("|\to");
			System.out.println("|    \t|/");
			System.out.println("|\t|");
			System.out.println("|      ");
			System.out.println("|________");
			System.out.println("|\t |");
			break;
		case 1: 
			System.out.println("_________");
			System.out.println("|\t|");
			System.out.println("|\to");
			System.out.println("|      \\|/");
			System.out.println("|\t|");
			System.out.println("|      ");
			System.out.println("|________");
			System.out.println("|\t |");
			break;
		case 0:
			System.out.println("_________");
			System.out.println("|\t|");
			System.out.println("|\to");
			System.out.println("|      \\|/");
			System.out.println("|\t|");
			System.out.println("|      \t \\");
			System.out.println("|________");
			System.out.println("|\t |");
			break;
			
			
			

		}
	}

}
