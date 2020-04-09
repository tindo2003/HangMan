
package Hangman;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wordmenu {
	private String[] animal;
	private String[] transportation;
	private String[] food;
	private List<String> menu;

	public Wordmenu() {

		this.animal = new String[] { "buffalo", "parrot", "lion", "goat " };
		this.transportation = new String[] { "plane", "train", "bikes", "boat" };
		this.food = new String[] { "egg", "steak", "noodles", "pizza" };
		this.setMenu(new ArrayList<String>());
	}

	public void addWords(int num) {
		switch (num) {
		case 0:

			Collections.addAll(getMenu(), animal);
			System.out.println("Your word is an animal. Click enter for hint");
			break;
		case 1:
			Collections.addAll(getMenu(), transportation);
			System.out.println("Your word is a type of transportation. Click enter for hint");
			break;
		case 2:
			Collections.addAll(getMenu(), food);
			System.out.println("Your word is a type of food. Click enter for hint");
			break;

		}

	}

	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}

}
