import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public interface Recycleable {
	
	final double Aluminum = 1.60; //per pound
	final double Plastic = 0.58; //per pound
	final double Glass = 0.10; //per pound
	
	double total = 0.0;
	
	public static void main(String[] args) {
		
		ArrayList<Recycleable> recycleableItems = new ArrayList<Recycleable>();
		
		Electronics computer = new Electronics ("HP Desktop", "aluminum", 27.7, 0);
		Electronics cellularDevice = new Electronics ("iPhone", "aluminium", 0.30, 0);
		Plastics LEGOS = new Plastics ("Millennium Falcon", "plastic", 3, 0);
		Plastics greenArmyMan = new Plastics ("Lieutenant", "plastic", 0.01, 0);
		
		recycleableItems.add(computer);
		recycleableItems.add(cellularDevice);
		recycleableItems.add(LEGOS);
		recycleableItems.add(greenArmyMan);
		
		FileOutputStream weirdLab = null;
		
		try {
			weirdLab = new FileOutputStream("recycle.csv");
			
		} catch (FileNotFoundException e) {
			System.out.println("The file has not been found. Error is below.");
			e.getMessage();
		}
		
		PrintWriter pw = new PrintWriter(weirdLab);
		pw.println("Item,Material,Weight,Recycle amount");
		for (int i = 0; i < recycleableItems.size(); ++i) {
			recycleableItems.get(i).createSpreadsheet(pw);
		}
		pw.println("Total" + "," + "," + "," + total);
		pw.close();
		
	}
	
	public void reuse();
	
	public void recycle(double weight, double recycleAmount, double t0tal);
	
	public void createSpreadsheet(PrintWriter pw);

}
