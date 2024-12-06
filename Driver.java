import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);	
		int largeFishCount = 0;
		int mediumFishCount = 0;
		String UserInput = "Y";
		
		while (UserInput.equalsIgnoreCase("Y")) {
		System.out.println("Enter the size of the fish caught: 1 = large, "
				+ "2 = medium: ");
		int SizeOfFish = keyboard.nextInt();
		if (SizeOfFish == 1) {
			largeFishCount++;
		}
				else if (SizeOfFish == 2) {
			mediumFishCount++;
				}
			else {
			System.out.println("Please enter a number inbetween 1 and 2. No "
					+ "strings or non-integer characters.");
			}
			System.out.println("Would you like to input more fish?");
				UserInput = keyboard.next();
		}
		Fishnet fishnet = new Fishnet(largeFishCount, mediumFishCount);
		
		double ValueOfFish = fishnet.calculateTotalValue();
		
		System.out.println("The total value of your fishnet is: " + ValueOfFish);
		
		keyboard.close();
	}

}
