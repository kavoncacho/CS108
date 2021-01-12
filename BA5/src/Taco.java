import java.util.ArrayList;

/**
 * Taco class
 * Student name: Kavon Cacho
 * RedID: 822794135
 * CS 108
 */
public class Taco {

	private String type;
	private int ounces;
	private double price;
	
	

	/**
	 * @param type
	 * @param ounces
	 * @param price
	 */
	public Taco(String type, int ounces, double price) {
		super();
		this.type = type;
		this.ounces = ounces;
		this.price = price;
	}
	
	public Taco () {
		type = null;
		ounces = 0;
		price = 0;
	}
	
	/**
	 * @return the ounces
	 */
	public int getOunces() {
		return ounces;
	}
	/**
	 * @param ounces the ounces to set
	 */
	public void setOunces(int ounces) {
		this.ounces = ounces;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	} 
	
	/*
	 * I chose Insertion Sort. The reason why I chose it is because I wanted to get this
	 * lab done as soon as possible to prepare for finals early; and all we've learned up to now is 
	 * Selection and Insertion. So I just chose a random one.
	 */
	
	public static ArrayList<Taco> sortArrayList(ArrayList<Taco> platterTaco) {
		
	
		for (int i = 0; i < platterTaco.size(); i++)
		{
		    int j = i;

		    while (j > 0 && (platterTaco.get(j).getPrice() < platterTaco.get(j - 1).getPrice()))
		    {
		        Taco tempTaco = platterTaco.get(j);
		        platterTaco.set(j, platterTaco.get(j - 1));
		        platterTaco.set(j - 1, tempTaco);
		        j--;
		    }
		}
		return platterTaco;
		
		
	}
	
	public static int binarySearch(ArrayList<Taco> platterTaco, double price) {
		int mid = 0;
		int low = 0;
		int high = platterTaco.size() - 1;
		
		while (high >= low) {
			mid = (high + low) / 2;
			if (platterTaco.get(mid).getPrice() < price) {
				low = mid + 1;
			}
			else if (platterTaco.get(mid).getPrice() > price) {
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}
	
	public static void eatTaco (Taco t) {
		if (t.ounces == 0) {
			System.out.println("Done");
		}
		else {
			System.out.println("There are " + t.ounces + " ounces of " + t.type + " taco remaining.");
			-- t.ounces;
			eatTaco(t);
		}
	}
	
	
	
	
	
}
