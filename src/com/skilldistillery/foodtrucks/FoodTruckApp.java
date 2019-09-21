package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodTruckApp fta = new FoodTruckApp();

		fta.run(input, fta);

		// done - close scanner & exit
		input.close();
		System.exit(0);

	}

	private void run(Scanner input, FoodTruckApp fta) {
		FoodTruck[] trucks = new FoodTruck[100];
		boolean loop = false;

		// enter food truck info method
		// if QUIT is entered as truck name - stop entering trucks
		trucks = fta.enterTruckInfo(input);

		do {
			// print Menu method
			fta.printMenu();

			// take user input for Menu
			// call appropriate method from menuSelection() method
			loop = fta.menuSelection(input, fta, trucks);
		} while (loop);

	}

	private FoodTruck[] enterTruckInfo(Scanner input) {
		FoodTruck[] ft;
		String nameQuit = "";
		System.out.print("How many food trucks would you like to enter: ");
		ft = new FoodTruck[input.nextInt()];
		
		for(int i = 0; i < ft.length; i++) {
			System.out.println("**Create " + ft.length + " Food Trucks**");
			System.out.println("Food Truck #" + (i + 1) + "'s Info...");
			System.out.print("Enter Name or QUIT: ");
			nameQuit = input.nextLine();
			
			//if quit was entered as the Truck Name
			//resize the array and stop entering info
			if(nameQuit.equalsIgnoreCase("Quit")) {
				FoodTruck[] shortenedFTArr = new FoodTruck[ i + 1];
				for(int j = 0; j < i; j++) {
					shortenedFTArr[i] = ft[i];
				}
				return shortenedFTArr;
			}
			else {
				ft[i].setName(nameQuit);
				System.out.print("Enter Food Type: ");
				ft[i].setFoodType(input.nextLine());
				System.out.print("Enter User Rating: ");
				ft[i].setUserRating(input.nextDouble());
			}
		}
		
		return ft;
		
	}
	
	private void printMenu() {
		System.out.println("\n********Food Truck Menu********");
		System.out.println(" Please Make a Selection (1-4) ");
		System.out.println("1. List existing Food Trucks");
		System.out.println("2. Get Average User Rating for ALL Food Trucks");
		System.out.println("3. Get Highest Rated Food Truck");
		System.out.println("4. Quit the App");
	}
	
	private boolean menuSelection(Scanner input, FoodTruckApp fta, FoodTruck[] ft) {
		int choice = input.nextInt();
		
		switch(choice) {
		case 1: 
			// list food trucks method
			fta.listTrucks(fta, ft);
			break;
		case 2:
			// get average user rating for trucks method
			fta.getAvgRating(fta, ft);			
			break;
		case 3:
			// get highest rated food truck method
			fta.getHighestRated(fta, ft);
			break;
		case 4:
			return false;
		default:
			System.err.println("\nERROR - Invalid Menu Selection. Try again.\n");
			break;
		}

		//return true to continue printing menu and taking user selection
		return true;
	}



	private void listTrucks(FoodTruckApp fta, FoodTruck[] ft) {
		
	}

	private void getAvgRating(FoodTruckApp fta, FoodTruck[] ft) {
		
	}

	private void getHighestRated(FoodTruckApp fta, FoodTruck[] ft) {
		
	}

}
