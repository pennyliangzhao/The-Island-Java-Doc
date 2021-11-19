package theisland;

import java.util.ArrayList;
import java.util.List;

/**
 * Super class for all animals that sets their common attributes and methods
 * common to them Parameters are name-animal name symbol-character symbol to
 * appear on output x,y-position on the island hungerLevel,thirstLevel-0 to
 * 10,10 full and not thirsty 1 animal dying of thirst or hunger size-creature
 * size from 1 to10,10 being the biggest.e.g.crocodile Boolean canFly-if the
 * animal can fly,input true or false.e.g.Kiwi can not fly so return false
 * 
 * @author Liang Zhao
 * @version 1.0
 * 
 */

public class Animal implements Entity, Comparable<Animal> {
	private String species;
	private String name;
	private char symbol;
	private int x, y;
	private int size;
	private int hungerLevel;
	private int thirstLevel;
	private Boolean canFly;

	/**
	 * Constructor for animals
	 * 
	 * @param species     animal 's species
	 * @param name        animal 's name
	 * @param symbol      animal 's symbol
	 * @param x           animal 's x position
	 * @param y           animal 's y position
	 * @param size        animal 's size
	 * @param hungerLevel animal 's hungerLevel
	 * @param thirstLevel animal 's hungerLevel
	 * @param canFly      if animal can fly
	 */

	public Animal(String species, String name, char symbol, int x, int y, int size, int hungerLevel, int thirstLevel,
			Boolean canFly) {
		this.species = species;
		this.name = name;
		this.symbol = symbol;
		this.x = x;
		this.y = y;
		this.setSize(size);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.setCanFly(canFly);
	}

	/**
	 * Return animal's species
	 * 
	 * @return get animal's species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * Set animal's species
	 * 
	 * @param species animal's species
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * Return name of animals
	 * 
	 * @return name of animals
	 */
	public String getName() {
		return name;
	}

	/**
	 * set the name of animals
	 * 
	 * @param name of animals
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return symbol of animals
	 * 
	 * @return symbol of animals
	 */

	public char getSymbol() {
		return symbol;
	}

	/**
	 * set the symbol of animals
	 * 
	 * @param symbol of animals
	 */
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	/**
	 * Return animal's X position
	 * 
	 * @return animal's X position
	 */
	public int getX() {
		return x;
	}

	/**
	 * set the animal's X position
	 * 
	 * @param x animal's X position
	 */

	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Return animal's Y position
	 * 
	 * @return y animal's Y position
	 */
	public int getY() {
		return y;
	}

	/**
	 * set the animal's Y position
	 * 
	 * @param y animal's Y position
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Return animal's hungerLevel
	 * 
	 * @return  hungerLevel animals's hungerLevel
	 */
	public int getHungerLevel() {
		return hungerLevel;
	}

	/**
	 * set the animal's hungerLevel
	 * 
	 * @param hungerLevel animal's hungerLevel
	 */
	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}

	/**
	 * Return animal's ThirstLevel
	 * 
	 * @return ThirstLevel animals's ThirstLevel
	 */
	public int getThirstLevel() {
		return thirstLevel;
	}

	/**
	 * set the animal's ThirstLevel
	 * @param ThirstLevel  thirstLevel animal's ThirstLevel
	 */
	
	public void setThirstLevel(int ThirstLevel) {
		this.thirstLevel = ThirstLevel;
	}

	/**
	 * Return animal's size
	 * 
	 * @return size animals's size
	 */

	public int getSize() {
		return 0;
	}

	/**
	 * set the animal's size
	 * 
	 * @param size animal's size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Return boolean animal's canFly behavior
	 * @return canFly boolean animal's canFly behavior
	 */
	
	public Boolean getCanFly() {
		return canFly;
	}

	/**
	 * set boolean animal's canFly behavior
	 * @param canFly  boolean animal's canFly behavior
	 */
	
	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}

	/**
	 * Standard toString method to print out an animal's features
	 */
	@Override
	public String toString() {
		return "Animal [species=" + species + ", name=" + name + ", symbol=" + symbol + ", xPosition=" + x
				+ ", yPosition=" + y + ", hungerLevel=" + hungerLevel + ", thirstLevel=" + "]";
	}

	/**
	 * Standard toText method to print out an animal's features
	 * @return animal's features by Text
	 */
	
	public String toText() {
		return "Animal:\n species=" + species + ", name=" + name + ", symbol=" + symbol + ", xPosition=" + x
				+ ", yPosition=" + y + ", hungerLevel=" + hungerLevel;

	}

	/**
	 * Move method for the Animal class that specifies how the animals will move and
	 * in what direction.
	 * 
	 * @param direction 1 = north, 2 = east, 3 = south 4 = west
	 * @param distance  how far the animal will move
	 */
	public void move(int direction, int distance) {

		if (direction == 1) {
			this.y = this.y - distance;
		} else if (direction == 2) {
			this.x = this.x + distance;
		} else if (direction == 3) {
			this.y = this.y + distance;
		} else {
			this.x = this.x - distance;
		}

	}

	/**
	 * Move method for the Animal class that specifies how the animals will move and
	 * in what direction.
	 * 
	 * @param direction 1 = north, 2 = east, 3 = south 4 = west
	 * @param island    location of the animals
	 */
	public void move(int direction, Island island) {
		if (direction == 1 && this.y - 1 >= 0) {
			this.y = this.y - 1;
		} else if (direction == 2 && this.x + 1 <= island.getWidth()) {
			this.x = this.x + 1;
		} else if (direction == 3 && this.y + 1 <= island.getHeight()) {
			this.y = this.y + 1;
		} else if (direction == 4 && this.x - 1 >= 0) {
			this.x = this.x - 1;
		}
	}

	/**
	 * check is there an GeographicFeature generate new random direction and move
	 * the animals generate random number to move animals check if there is no
	 * GeographicFeature move the animal in the same direction
	 * 
	 * @param direction-animal moving direction
	 * @param island-animal    moving location
	 */
	public void checkGeographicFeature(int direction, Island island) {

		if (isNextGeographicFeature(direction, island)) {

			int randomDirection = (int) ((Math.random() * 4) + 1);
			move(randomDirection, island);
		} else {
			move(direction, island);
		}

	}

	/**
	 * gets next position of the GeographicFeature
	 * <p>
	 * check whether there is an GeographicFeature in the island next position
	 * before moving the animal into that position
	 * 
	 * @param direction- 1=north 2=east 3=south 4=west
	 * @param island-    the location of GeographicFeature
	 * @return GeographicFeature's direction
	 */
	public boolean isNextGeographicFeature(int direction, Island island) {
		double nextX = 0, nextY = 0;

		if (direction == 1) {
			nextY = this.y - 1;
			nextX = this.x;
		}
		if (direction == 2) {
			nextY = this.y;
			nextX = this.x + 1;
		}
		if (direction == 3) {
			nextY = this.y + 1;
			nextX = this.x;
		}
		if (direction == 4) {
			nextY = this.y;
			nextX = this.x + 1;
		}

		for (Entity e : island.getGeographicFeatures()) {
			if (e.getX() == nextX && e.getY() == nextY) {
				return true;
			}
		}
		return false;
	}

	/**
	 * search food in random direction in the island
	 * 
	 * @param island-animal search food 's location
	 */
	public void smellFood(Island island) {
		int randomDirection = (int) (Math.random() * 4) + 1;
		move(randomDirection, island);
	}

	/**
	 * loops through all the food objects in the list find the closest distance and
	 * the index of that food object
	 * 
	 * @param food in the island
	 * @return the closest food distance
	 */
	public Entity getClosestFoodItem(ArrayList<Entity> food) {
		double d = Double.POSITIVE_INFINITY;
		int index = -1;
		for (int i = 0; i < food.size(); i++) {
			Entity foodie = food.get(i);
			double gap = Math.sqrt(Math.pow(this.x - foodie.getX(), 2) + Math.pow(this.y - foodie.getY(), 2));

			if (gap < d) {
				d = gap;
				index = i;
			}
		}
		if (index != -1) {
			return food.get(index);
		}

		return null;

	}

	/**
	 * Return food 's direction Direction 1=north 2= east 3=south 4=west
	 * 
	 * @param food-animal's food
	 * @return food direction in the island
	 */
	public int getFoodDirection(Entity food) {
		if (this.x == food.getX()) {
			if (food.getY() < this.x) {
				return 1;
			} else {
				return 3;
			}
		} else if (this.y == food.getY()) {
			if (food.getX() < this.x) {
				return 4;
			} else {
				return 2;
			}
		}
		return 0;

	}

	/**
	 * sorts out animals based on hunger level e.g. it will first compare animal1
	 * and animal2 since animal1>animal2 it will move animal2 to first position
	 * until the end result will be from lowest to highest
	 */
	@Override
	public int compareTo(Animal o) {
		if (this.hungerLevel == o.getHungerLevel()) {
			return 0;
		} else if (this.hungerLevel > o.getHungerLevel()) {
			return 1;
		} else {
			return 0;
		}
	}

}
