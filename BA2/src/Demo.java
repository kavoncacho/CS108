/*
 * Name: Kavon Cacho
 * RedID: 822794135
 */

import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) {
		
		Desk ikeaDesk = new Desk(4, 30.0, 60.0, "Lamp", 0);
		Desk walmartDesk = new Desk(5, 25.0, 50.5, "TV", 1);
		Desk staplesDesk = new Desk();
		Desk targetDesk = new Desk();
		ArrayList<Desk> Desks = new ArrayList<Desk>();
		
		Desks.add(ikeaDesk);
		Desks.add(walmartDesk);
		Desks.add(staplesDesk);
		Desks.add(targetDesk);
		
		staplesDesk.setNumLegs(4);
		staplesDesk.setLength(30.0);
		staplesDesk.setWidth(60.0);
		staplesDesk.setItemOnTable("Laptop");
		staplesDesk.setDistFromWall(0);
		
		targetDesk.setNumLegs(5);
		targetDesk.setLength(25.0);
		targetDesk.setWidth(50.5);
		targetDesk.setItemOnTable("Computer");
		targetDesk.setDistFromWall(1);
		
		//changes for Target Desk are entered below
		System.out.println("Target Desk - \n");
		targetDesk.addItemOnTable("monitor");
		targetDesk.moveDesk(7);
		
		//changes for Walmart Desk are entered below
		System.out.println("Walmart Desk - \n");
		walmartDesk.moveDesk(6);
		walmartDesk.addItemOnTable("fake plant");
		
		//changes for IKEA Desk are entered below
		System.out.println("IKEA Desk - \n");
		
		
		//changes for Staples Desk are entered below
		System.out.println("Staples Desk - \n");
		
		
		//final specifications loop below
		System.out.println("Final Specifications - \n");
		for(int i = 0; i < Desks.size(); ++i) {
			Desks.get(i).display();
		}
		

	}

}
