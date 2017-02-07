import java.util.Scanner;

class Food {
	int calories;
	String name;

	int calculateCaloriesLeft() {

		int caloriesLeft = 2000 - calories;
		return caloriesLeft;
	}

	public Food(int maxCalorie) {

		calories = maxCalorie;
		System.out.println("The max calorie for desert is: " + maxCalorie);
	}

	public void strawberry(int calories) {
		this.calories = calories;
		System.out.println("Strawberry cheesecake is: " + calories);
	}

	public void blueberry(String name, int calories) {
		System.out.println("Bluebery " + "cheesecake is: " + calories);
	}

	public void caramel(String name, int calories) {
		System.out.println(name + " cheesecake is: " + calories);
	}
	
	public void value(int value){
		
	}
	
}
public class Cheesecake {
	public static void main(String[] args) {

		Food deserts = new Food(500);

		deserts.strawberry(350);
		deserts.blueberry("Blueberry",400);
		deserts.caramel("Caramel", 250);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter calorie of food: ");
		int value = 0;
		value = input.nextInt();
		
		value = deserts.calculateCaloriesLeft();
		System.out.println("calories left: " + value);

		/*if (value > 500) {
			System.out.println("invalid calorie entry");
		}
		else if (value <= 500){
			System.out.println("You are close to your weight loss goal");
			
		} */

	}
	


}
