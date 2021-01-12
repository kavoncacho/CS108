/*
 * Name: Kavon Cacho
 * RedID: 822794135
 */

import java.util.ArrayList;

/*
 * Main method. Declares objects, adds them to an array list, and then loops through 
 * it, calling speak().
 */

public class BA3 {

	public static void main(String[] args) {
	
		Animal uglyDog = new Animal(4, true, "Golden", "Ruff");
		Cat houseCat = new Cat(4, true, "Orange", "Meow", true);
		Bunny childsPet = new Bunny(4, true, "White", "Squeak", 2.3);
		Panther wildAnimal = new Panther(4, true, "Black", "ROAR!", true, 30);
		
		ArrayList<Animal> Animals = new ArrayList<Animal>();
		Animals.add(uglyDog);
		Animals.add(houseCat);
		Animals.add(childsPet);
		Animals.add(wildAnimal);
		
		for (int i = 0; i < Animals.size(); ++i) {
			Animals.get(i).Speak();
		}

	}

}
