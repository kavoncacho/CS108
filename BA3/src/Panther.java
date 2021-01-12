/*
 * Name: Kavon Cacho
 * RedID: 822794135
 */

//subclass of Cat. Declares new field
public class Panther extends Cat{
	
	int numWhiskers;
	
	//Panther parameterized constructor. Calls base class for fields declared in superclass, then declares new field.
	public Panther(int numLegs, boolean hasHindLegs, String colorOfFur, String voice, boolean isBetterThanDogs, int numWhiskers) {
		
		super(numLegs, hasHindLegs, colorOfFur, voice, isBetterThanDogs);
		this.numWhiskers = numWhiskers;
	
	}
	
	//Bunny default constructor. Calls base class for fields declared in superclass, then declares new field.
	public Panther() {
		
		super();
		numWhiskers = 0;
	
	}
	
	//sets numWhiskers
	public void setNumWhiskers (int numWhiskers) {
		this.numWhiskers = numWhiskers;
	}
	
	//gets numWhiskers
	public int getNumWhiskers() {
		return numWhiskers;
	}
	
	//Overrides Speak() in base class, which then overrides Speak() in the superclass
	@Override
	public void Speak() {
		super.Speak();
	}
}
