/**
 * TacoTuesday class
 * Student name: Kavon Cacho
 * RedID: 822794135
 * CS 108
 */
import java.util.ArrayList;
import java.util.Random;

public class TacoTuesday {

	public static void main(String[] args) {

		ArrayList<Taco> tacoPlatter = new ArrayList<Taco>();
		
		tacoPlatter.add(new Taco("Shrimp", 10, 2.99));
		tacoPlatter.add(new Taco("Mahi-Mahi", 12, 3.99));
		tacoPlatter.add(new Taco("Carne Asada", 11, 2.49));
		tacoPlatter.add(new Taco("Chicken", 14, 2.19));
		tacoPlatter.add(new Taco("Vegan", 4, 8.99));
		tacoPlatter.add(new Taco("Fish", 10, 2.99));
		tacoPlatter.add(new Taco("Calamari", 13, 3.49));
		
		Taco.sortArrayList(tacoPlatter); //sort array
		
		System.out.print("The sorted array list: ");
		for(int i = 0; i < tacoPlatter.size(); ++i) {
			if (i == tacoPlatter.size() - 1) {
				System.out.println(tacoPlatter.get(i).getPrice() + ".");
				System.out.println("");
			}
			else {
				System.out.print(tacoPlatter.get(i).getPrice() + ", ");
			}
		}
	
		
		System.out.println("Tacos that are $3.99 are located at index " + Taco.binarySearch(tacoPlatter, 3.99) + "."); //binary search
		System.out.println("");
		
		Random randgen = new Random();
		
		Taco.eatTaco(tacoPlatter.get(randgen.nextInt(7))); //recursive method
		
		

	}
	
	
}
