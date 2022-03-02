  
package assignment5.main;
import java.util.Arrays;
import java.util.List;

public class Fruit {
	
	String name;
	int price;
	int calories;
	String color;
	
	public Fruit() {
		
	}
	
	public Fruit(String name, int price, int calories, String color) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static final List<Fruit> fruitslist = 
	Arrays.asList(
	new Fruit("Apple", 100, 520, "Red"),
	new Fruit("Banana", 60, 120, "Yellow"),
	new Fruit("Pineapple", 80, 500, "Olive"),
	new Fruit("Strawberry", 120, 200, "Red"),
	new Fruit("Blueberry", 200, 120, "Blue"),
	new Fruit("Mango", 40, 500, "Yellow"),
	new Fruit("Orange", 50, 400, "Orange"),
	new Fruit("Grapes", 80, 60, "Green"),
	new Fruit("Pomegranate", 120, 100, "Red"));

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", calories=" + calories + ", color=" + color + "]";
	} 
	
	
}