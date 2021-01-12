/*
 * Name: Kavon Cacho
 * RedID: 822794135
 */

public class Desk {

	private int numLegs;
	private double length; //in inches
	private double width; //in inches
	private String itemOnTable;
	private String[] itemsOnTable = new String[10]; //10 being max that desk can fit
	int itemSlot = 0; //item number
	private int distFromWall; //in inches
	
	public Desk() {
		numLegs = 0;
		length = 0;
		width = 0;
		itemOnTable = "Nothing";
		itemsOnTable[0] = itemOnTable;
		distFromWall = 0;
	}
	
	public Desk(int numLegs, double length, double width, String itemOnTable, int distFromWall) {
		this.numLegs = numLegs;
		this.length = length;
		this.width = width;
		this.itemOnTable = itemOnTable;
		itemsOnTable[0] = this.itemOnTable;
		++itemSlot;
		this.distFromWall = distFromWall;
	}
	
	
	public void setNumLegs(int num) {
		numLegs = num;
	}
	public int getNumLegs() {
		return numLegs;
	}
	
	
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	
	
	public void setDistFromWall(int dist) {
		distFromWall = dist;
	}
	public int getDistFromWall() {
		return distFromWall;
	}
	
	
	public void setItemOnTable(String onTable) {
		itemOnTable = onTable;
		itemsOnTable[itemSlot] = itemOnTable;
		++itemSlot;
	}
	public String getItemOnTable() {
		return itemOnTable;
	}
	
	
	public void addItemOnTable(String onTable) {
		itemsOnTable[itemSlot] = onTable;
		++itemSlot;
		System.out.println("A " + onTable + " has just been put on the desk.");
		System.out.println("");
	}
	
	
	public void moveDesk(int moveDistance) {
		distFromWall = moveDistance;
		System.out.println("The desk is now " + distFromWall + " inches from the wall.");
		System.out.println("");
	}

	
	public void display() {
		System.out.println("Number of Legs: " + numLegs);
		System.out.println("Length: " + length + " in.");
		System.out.println("Width: " + width + " in.");
		System.out.println("Distance from wall: " + distFromWall + " in.");
		System.out.print("Item(s) on table: ");
		for (int i = 0; i < itemSlot; ++i) {
			if (i == itemSlot - 1) {
				System.out.print(itemsOnTable[i] + ".");
			}
			else {
				System.out.print(itemsOnTable[i] + ", ");
			}
		}
		System.out.println("");
		System.out.println("");
	}
}
