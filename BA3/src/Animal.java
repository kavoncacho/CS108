/*
 * Name: Kavon Cacho
 * RedID: 822794135
 */

//This is the superclass. It declares protected fields for the subclasses

public class Animal {
	
	protected int numLegs;
	protected boolean hasHindLegs;
	protected String colorOfFur;
	protected String voice;
	
	//Animal parameterized constructor
	public Animal(int numLegs, boolean hasHindLegs, String colorOfFur, String voice) {
		
		this.numLegs = numLegs;
		this.hasHindLegs = true;
		this.colorOfFur = colorOfFur;
		this.voice = voice;
	
	}
	
	//Animal default constructor
	public Animal() {
		
		numLegs = 4;
		hasHindLegs = true;
		colorOfFur = "Blank";
		voice = "Silence";
	}
	
	//Speak method. This is called with various objects in the main method. Used to print the animals' voice.
	public void Speak() {
		System.out.println(voice);
	}

}
