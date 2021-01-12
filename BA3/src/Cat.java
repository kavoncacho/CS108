/*
 * Name: Kavon Cacho
 * RedID: 822794135
 */

//subclass of animal. Declares one other protected field to be used in next subclass
public class Cat extends Animal{
	
	protected boolean isBetterThanDogs;
	
	//Cat parameterized constructor. Calls superclass for fields declared in superclass, then declares new field.
	public Cat(int numLegs, boolean hasHindLegs, String colorOfFur, String voice, boolean bool) {
		
		super(numLegs, hasHindLegs, colorOfFur, voice);
		isBetterThanDogs = bool;
	
	}
	
	//Cat default constructor. Calls superclass for fields declared in superclass, then declares new field.
	public Cat() {
		
		super();
		isBetterThanDogs = false;
	
	}
	
	//sets isBetterThanDogs
	public void setIsBetterThanDogs (boolean bool) {
		isBetterThanDogs = bool;
	}
	
	//gets isBetterThanDogs
	public boolean getIsBetterThanDogs() {
		return isBetterThanDogs;
	}

	//Overrides Speak() in superclass. Simply calls super
	@Override
	public void Speak() {
		super.Speak();
	}

}
