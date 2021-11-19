package theisland;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This is a program to simulate the ecosystem on an island for theoretical biologists. 
 * The island has various geographic features, animals, and foliage. 
 * The simulation will be turn-based: each "turn" of the world, 
 * all of the entities on the island update themselves simultaneously in response to the passage of time,
 * their needs (such as food or water), and what they detect around them (such as predators).
 *<P> 
 * Main class for all entities of the island that adds their different attributes and methods
 * adds different entities of island with their features
 * and moves two islands randomly for 10 times
 * 
 * Parameters are
 * scanner-use text scanner which gets user's input.
 * width- set the 2D island width to 18
 * height-set the 2D island width to 10
 *
 * @author Liang Zhao
 * @version 1.0
 */

public class Island {
	private Scanner scan = new Scanner(System.in);
	private int width = 18;
	private int height = 10;

	/**
	 * Creates the Island with default animals and geographic conditions.
	 */

	private ArrayList<Animal> animals = new ArrayList<>();
	private ArrayList<Entity> foliages = new ArrayList<>();
	private ArrayList<Entity> geographicFeatures = new ArrayList<>();

	/**
	 * The constructor initialize,load and line data from different methods.
	 * 
	 */
	public Island() {
		defaultAnimals();
		addFoliages();
		menu();

	}

	/**
	 * Menu of the program. Displays the text menu to the user and takes the user
	 * input as a character.
	 */
	public void showMenu() {
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("A. Add Animals");
		System.out.println("B. List Animals");
		System.out.println("C. Move Animals");
		System.out.println("D. Randomly move Animals");
		System.out.println("E. Draw island of Animals with Random Animals, Foliages & GeographicFeatures");
		System.out.println("F. Island of animals with Random Movement");
		System.out.println("G. Exit Program");
	}

	/**
	 * This is the main starting point of the Island.
	 * Displays the text menu to the user and takes the user input as a character. 
	 * Executes the different features of the program based on the user input.
	 */
	public void menu() {
		char option = '\0';
		do {
			showMenu();
			System.out.println("Enter an option: ");
			char option1 = scan.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();

			switch (option) {
			case 'A':
				createCustomAnimals();
				break;

			case 'B':
				printAnimals();
				break;

			case 'C':
				moveAnimal();
				break;

			case 'D':
				randomMovement();
				break;

			case 'E':
				drawIsland();
				break;

			case 'F':
				simulateIsland();
				break;

			case 'G':
				System.out.println();
				break;

			default:
				System.out.println("Please enter a valid letter of choice");
				break;
			}
		} while (option != 'G');
		System.out.println("End of the program");
	}

	/**
	 * Return island's width
	 * 
	 * @return width get island's width 
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Set island's width
	 * 
	 * @param width island's width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Return island's height
	 * 
	 * @return height get island's height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Set island's height
	 * 
	 * @param height island's height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 *  text-only visualisation of the 2D map using drawIsland method
	 *  uses the symbol of each animal to show where the animal is in the island
	 *  Print the island as text in the format below:
	 */
	public void drawIsland() {
		Collections.sort(animals);
		for (double y = -1; y <= height + 1; y++) {
			System.out.print('|');
			for (double x = -1; x <= width + 1; x++) {
				if (y == -1 || y == height + 1) {
					System.out.print('-');
				} else {
					Entity islandEntity = getEntityByPosition(x, y);
					if (islandEntity != null) {
						System.out.print(islandEntity.getSymbol());
					} else {
						System.out.print(' ');
					}
				}
			}
			System.out.print('|');
			System.out.println();

		}
	}

	/**
	 * 
	 * Update all the animals randomly moving in the island.
	 */
	public void updateIsland() {
		for (Animal animal : animals) {
			int direction = (int) (Math.random() * 4) + 1;
			animal.checkGeographicFeature(direction, this);
			animal.smellFood(this);
		}
	}

	/**
	 * To reference island entity from the island move direction
	 * 
	 * @param x the position x of the island entities
	 * @param y the position y of the island entities
	 * @return entities position
	 */
	private Entity getEntityByPosition(double x, double y) {
		for (Animal animal : animals) {
			if (x == animal.getX() && y == animal.getY()) {
				return animal;
			}
		}
		for (Entity aObjF : foliages) {
			if (x == aObjF.getX() && y == aObjF.getY()) {
				return aObjF;
			}
		}

		for (Entity aObjG : geographicFeatures) {
			if (x == aObjG.getX() && y == aObjG.getY()) {
				return aObjG;
			}
		}

		return null;
	}

	/**
	 * 
	 * adds two default foliages(apple tree and grass) in entity and will show on the island
	 * 
	 */
	private void addFoliages() {
		AppleTree appleTrees = new AppleTree("PineTree", 'p', 8, 5, 2);

		Grass grass = new Grass("Grass", '@', 6, 2, 10);

		foliages.add((Entity) appleTrees);

		foliages.add((Entity) grass);

	}

	/**
	 * adds few default animals to the island 
	 * and stored them in an ArrayList
	 * that stores an unspecified number of animals in a 2D island. 
	 * set the the animals features and print out
	 */
	private void defaultAnimals() {
		Rabbit rabbit1 = new Rabbit("Jo", 'R', 1, 1, 100, 5, 5, 6, false);
		Rabbit rabbit2 = new Rabbit("Jerry", 'Y', 2, 3, 100, 5, 5, 6, false);
		Sparrow sparrow1 = new Sparrow("Mary", 'M', 10, 10, 80, 2, 3);
		Wolf wolf1 = new Wolf("Jack", 'J', 6, 5, 80, 6, 4, 4, false);
		Cat cat1 = new Cat("Alice", 'A', 8, 7, 100, 8, 8, 6, false);
		Kiwi kiwi1 = new Kiwi("Kai", 'K', 8, 9, 80, 2, 2, 1);
		Rat rat1 = new Rat("Berry", 'B', 5, 12, 40, 3, 5, 7, false);

		animals.add(rabbit1);
		animals.add(rabbit2);
		animals.add(sparrow1);
		animals.add(wolf1);
		animals.add(cat1);
		animals.add(kiwi1);
		animals.add(rat1);

	}


	/**
	 * Displays the text menu to the user and takes the user input as a character. 
	 * Executes the different features of the program based on the user input.
	 */
	public void createCustomAnimals() {

		boolean input = false;
		do {
			System.out.println("Enter species(rabbit/wolf/cat/kiwi/rat): ");
			String species = scan.next();
			System.out.println("Enter Animal name: ");
			String name = scan.next();
			System.out.println("Enter symbol (only one character): ");
			char symbol = scan.next().charAt(0);
			System.out.println("Enter x position: ");
			int xPos = scan.nextInt();
			System.out.println("Enter y position: ");
			int yPos = scan.nextInt();
			System.out.println("Enter initial hunger level: ");
			int hungerLevel = scan.nextInt();
			System.out.println("Enter initial thirst level: ");
			int thirstLevel = scan.nextInt();
			System.out.println("Enter size: ");
			int size = scan.nextInt();
			System.out.println("Enter speed: ");
			int speed = scan.nextInt();
			System.out.println("Enter whether the animnal is female: ");
			boolean isFemale = scan.nextBoolean();

			switch (species) {
			case "rabbit":
				Rabbit rabbit = new Rabbit(name, symbol, xPos, yPos, size, hungerLevel, thirstLevel, speed, isFemale);

				animals.add(rabbit);
				break;
			case "wolf":
				Animal wolf = new Wolf(name, symbol, xPos, yPos, size, hungerLevel, thirstLevel, speed, isFemale);

				animals.add(wolf);
				break;
			case "cat":
				Cat cat = new Cat(name, symbol, xPos, yPos, size, hungerLevel, thirstLevel, speed, isFemale);

				animals.add(cat);
				break;
			case "kiwi":

				Kiwi kiwi = new Kiwi(name, symbol, xPos, yPos, size, hungerLevel, thirstLevel, speed);

				animals.add(kiwi);
				break;
			case "rat":
				Rat rat = new Rat(name, symbol, xPos, yPos, size, hungerLevel, thirstLevel, speed, isFemale);

				animals.add(rat);
				break;
			default:
				System.out.println("Invalid species");
				return;
			}
			System.out.println("Do you want to add more animals? \n Type True if yes False if not");
			input = scan.nextBoolean();
		} while (input == true);
	}

	/**
	 * print the user input
	 */
	public void printAnimals() {
		for (Animal a : animals) {
			System.out.println(a.toText());
		}
	}

	/**
	 * Move method for the Animal class that specifies how the animals will move and
	 * in what direction.
	 * 
	 * direction  1=north 2=east 3=south 4=west
	 * steps      specifies how many pixels of movement animals make
	 * animalName ask user to choose
	 */
	public void moveAnimal() {
		System.out.println("Enter name of animal to move: ");
		String animalName = scan.next();
		System.out.println(
				"Which way do you want the animal to move?:" + "\n 1: north, 2: east," + " 3 : for south, 4 for west ");
		int direction = scan.nextInt();
		System.out.println("Enter number of steps: ");
		int steps = scan.nextInt();
		Animal a = getAnimalByName(animalName);
		if (a != null) {
			a.move(direction, steps);
			System.out.println(a.getName() + " moved to the position x: " + a.getX() + " y:  " + a.getY());
		} else {
			System.out.println("Enter a animal on the list");
		}
	}

	/**
	 * ask user to choose particular animal's name to move randomly 
	 * the animal will move randomly within the island
	 * the new location will be printed out 
	 */
	public void randomMovement() {
		System.out.println("Enter name of animal to move: ");
		String animalName = scan.next();
		Animal a = getAnimalByName(animalName);
		if (a != null) {
			for (int i = 0; i < 100; i++) {
				int direction = (int) ((Math.random() * 4) + 1);
				int distance = (int) ((Math.random() * 10) + 1);
				a.move(direction, distance);
			}
			System.out.println(a.getName() + " moved to the position x: " + a.getX() + " y:  " + a.getY());
		} else {
			System.out.println("Enter a animal on the list");
		}
	}

	/**
	 * returns animal by name
	 * @param animalName
	 * @return animal's name
	 */
	private Animal getAnimalByName(String animalName) {
		for (Animal animal : animals) {
			if (animal.getName().equalsIgnoreCase(animalName)) {
				return animal;
			}
		}
		return null;
	}

	/**
	 * Updates island and loops for 10 times to simulate ten times allowed to move
	 * inside the island.
	 */
	public void simulateIsland() {
		for (int i = 0; i < 10; i++) {
			updateIsland();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			drawIsland();
		}

		System.out.printf("There are %d animals on the lsland.", animals.size());

	}

	/**
	 * returns geographicFeatures of island's entity
	 * @return geographicFeatures
	 */
	public ArrayList<Entity> getGeographicFeatures() {
		return this.geographicFeatures;
	}

	/**
	 * supplies command-line arguments as an array of String objects
	 * @param args  command-line arguments as an array of String objects
	 */
	public static void main(String[] args) {
		new Island();
	}
}
