/*
 * Name: Kavon Cacho
 * Red ID: 822794135
 */

package SuperLotto;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
/*
 * This is a program where one can acquire SuperLotto tickets.
 * It asks the user how many ticket's they'd like 
 * as well as asking them if they'd like more.
 */
public class SuperLotto {
	
	/*
	 * The main method introduces the user. The amount of tickets the user wants is inputed into
	 * quickPick(). The main method uses a while-loop to keep the program running based on whether
	 * the user inputs 'yes' or 'no'.
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to 7-11! What is your name?");
		String name = scnr.nextLine();
		boolean wantToPlay = true;
		int numTickets = 0;
		int tryTickets = 0;
		while (wantToPlay) {
			
			System.out.println("Hi " + name + ", how many Super Lotto tickets would you like?");
			try {
				tryTickets = scnr.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("You a damn retard. That wasn't even a number."
						+ "Get the hell out of my store you tweek");
				System.exit(0);
			} 
			System.out.println("");
			numTickets = tryTickets;
			quickPick(numTickets);
			System.out.println("Good luck! Would you like to run the program again?");
			String answer = scnr.next();
			System.out.println("");
			
			if (answer.equalsIgnoreCase("Yes")) {
				wantToPlay = true;
			}
			
			else if (answer.equalsIgnoreCase("No")) {
				wantToPlay = false;
			}
			
			else {
				System.out.println("Bruh???? yes or no...Now get out my store fool");
				System.exit(0);
			}
		
		}
		
		System.out.println("Goodbye!");
	}														 
	
	/*
	 * Method quickPick() uses for-loops to print however many tickets the 
	 * user wants. It has a random number generator with seeds to meet the range's requirement.
	 * It also calls the checkDuplicate method if there are duplicates.
	 */
	public static int[] quickPick(int numTickets) {           
		
		int[] lotteryNumbers = new int[5];
		Random randGen = new Random();
		int megaNum;
		
		for (int i = 1; i <= numTickets; ++i) {
			
			for (int j = 0; j < lotteryNumbers.length; ++j) {
				
				lotteryNumbers[j] = randGen.nextInt(47) + 1;
				System.out.print(lotteryNumbers[j] + " ");
			}
			
			checkDuplicate(lotteryNumbers);
			while (checkDuplicate(lotteryNumbers) == true) {
				checkDuplicate(lotteryNumbers);
			}
			megaNum = randGen.nextInt(27) + 1;
			System.out.println("(MEGA: " + megaNum + ")");
		}
		System.out.println("");
		return lotteryNumbers;
	}
 
	/*
	 * This method is called automatically to check whether there are duplicates. If a duplicate is found,
	 * one of the two elements will be reassigned a new random variable. Then a true boolean is returned in
	 * order to check again. If there are no duplicates, then a false boolean is returned; in which case the 
	 * while loop that called checkDuplicate is exited. 
	 */
	public static boolean checkDuplicate(int[] lotteryNumbers) {
		
		Random randGen = new Random();
		int newNum = randGen.nextInt(47) + 1;
		for (int i = 0; i < lotteryNumbers.length; i++) {
            for (int j = 0; j < lotteryNumbers.length; j++) {
                if (lotteryNumbers[i] == lotteryNumbers[j] && j != i) {
                    lotteryNumbers[i] = randGen.nextInt(lotteryNumbers[j]) + 1;
                    lotteryNumbers[j] = randGen.nextInt(47) + 1;
                	for (int k = 0; k < lotteryNumbers.length; ++k) {
                		while (newNum == lotteryNumbers[k]) {
                			newNum = randGen.nextInt(47) + 1;
                		}
                	}
                	return true;
                }
            }
        }
        
		return false;
	}
	
}

//Name: Kavon Cacho
//Red ID: 822794135
