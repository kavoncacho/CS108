/*
 * Name: Kavon Cacho
 * RedID: 822794135
 */

//subclass of animal. Declares new field
public class Bunny extends Animal{
	
	double lengthOfEars; //in inches
	
	//Bunny parameterized constructor. Calls superclass for fields declared in superclass, then declares new field.
	public Bunny(int numLegs, boolean hasHindLegs, String colorOfFur, String voice, double lengthOfEars) {
		
		super(numLegs, hasHindLegs, colorOfFur, voice);
		this.lengthOfEars = lengthOfEars;
	
	}
	
	//Cat default constructor. Calls superclass for fields declared in superclass, then declares new field.
	public Bunny() {
		
		super();
		lengthOfEars = 2;
	
	}
	
	//sets lengthOfEars
	public void setLengthOfEars (double length) {
		lengthOfEars = length;
	}
	
	//gets lengthOfEars
	public double getLengthOfEars() {
		return lengthOfEars;
	}
	
	//Overrides Speak() in superclass. Simply calls super.
	@Override
	public void Speak() {
		super.Speak();
	}

}
