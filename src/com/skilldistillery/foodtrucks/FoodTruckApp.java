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
		input.nextLine();
						
		for(int i = 0; i < ft.length; i++) {
			ft[i] = new FoodTruck();
			System.out.println("\n**Create " + (ft.length - i) + " More Food Trucks**");
			System.out.print("Please Enter Truck #" + (i + 1) + "'s Info...");
			System.out.print("\nEnter Truck Name/QUIT: ");
			nameQuit = input.nextLine();
			
			//if quit was entered as the Truck Name
			//resize the array and stop entering info
			if(nameQuit.equalsIgnoreCase("Quit")) {
				FoodTruck[] shortenedFTArr = new FoodTruck[i];
				for(int j = 0; j < shortenedFTArr.length; j++) {
					shortenedFTArr[j] = ft[j];
				}
				return shortenedFTArr;
			}
			else {
				ft[i].setName(nameQuit);
				System.out.print("Enter Food Type: ");
				ft[i].setFoodType(input.nextLine());
				System.out.print("Enter User Rating: ");
				ft[i].setUserRating(input.nextDouble());
				input.nextLine();
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
		char choice = input.next().charAt(0);
		
		switch(choice) {
		case '1': 
			// list food trucks method
			fta.listTrucks(ft);
			break;
		case '2':
			// get average user rating for trucks method
			fta.getAvgRating(ft);			
			break;
		case '3':
			// get highest rated food truck method
			fta.getHighestRated(ft);
			break;
		case '4':
			System.out.println("Happy Food-Trucking! Goodbye!");
			return false;
		default:
			System.err.println("\nERROR - Invalid Menu Selection. Try again.\n");
			break;
		}

		//return true to continue printing menu and taking user selection
		return true;
	}



	private void listTrucks(FoodTruck[] ft) {
		//print out trucks
		for(int i = 0; i < ft.length; i++) {
			System.out.println(ft[i].toString());
		}
	}

	private void getAvgRating(FoodTruck[] ft) {
		//get average of all truck ratings
		int count = ft.length;
		double sum = 0;
		
		for(int i = 0; i < ft.length; i++) {
			sum += ft[i].getUserRating();
		}
		
		System.out.println("Average Food Truck Rating: " + (double)sum / count);
		
	}

	private void getHighestRated(FoodTruck[] ft) {
		//find highest rated truck
		double maxRating = ft[0].getUserRating();
		FoodTruck[] hRFTArray = new FoodTruck[ft.length];
		int count = 0;
		
		for(int i = 0; i < ft.length; i++) {
			if(ft[i].getUserRating() >= maxRating) {
				maxRating = ft[i].getUserRating();
				hRFTArray[count] = ft[i];
				count++;
			}
		}
		
		//copy hRFTArray to new array to trim to right size
		FoodTruck[] highestRated = new FoodTruck[count];
		for(int i = 0; i < highestRated.length; i++) {
			highestRated[i] = hRFTArray[i];
		}
		
		
		System.out.println("The Highest Rated Food Truck(s):");
		for(int i = 0; i < highestRated.length; i++) {
			System.out.println(highestRated[i].toString());
		}
	}

}
