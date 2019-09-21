package com.skilldistillery.foodtrucks;

public class FoodTruck {
	//for a count of food trucks - to be used for TruckID
	private static int truckCount = 0;
	private int truckID;
	private String name;
	private String foodType;
	private double userRating;
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String name, String foodType, double userRating) {
		//increment count of trucks
		truckCount++;
		
		//assign count of trucks to truck id
		this.truckID = truckCount;
		this.name = name;
		this.foodType = foodType;
		this.userRating = userRating;
	}

	public int getTruckID() {
		return truckID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getUserRating() {
		return userRating;
	}

	public void setUserRating(double userRating) {
		this.userRating = userRating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck ID: ");
		builder.append(truckID);
		builder.append(", Name: ");
		builder.append(name);
		builder.append(", Food Type: ");
		builder.append(foodType);
		builder.append(", User Rating: ");
		builder.append(userRating);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
