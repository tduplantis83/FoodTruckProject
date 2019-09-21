## Food Trucks Project

### Second week homework for Skill Distillery
Course Began: 9/9/19

Assigned: 9/20/19

Completed: 9/20/19


### Overview
Users input and rate a list of food trucks, then view the average rating and the highest-rated truck.

This is accomplished through the use of a FoodTruck class, and a separate FoodTruckApp class. The FoodTruck class stores all information about the Food Trucks.

First, the FoodTruckApp class asks the user how many Food Trucks they'd like to input. It then holds that information in an array of Food Trucks of that size; if the user decides to create fewer Trucks than originally requested, they type "Quit" as the Truck name; doing so, will move the data into a new array and nullify the old, in order to prevent problems further on.

Next the FoodTruckApp presents a Menu of choices for the user, including, Printing a list of all of the Food Truck information, finding the average Food Truck rating, finding the highest-rated Food Truck, or Quit the App; these are all self-explanatory.


### How to run
This is a console app:
1. Compile and run it in Terminal, an IDE, etc.
2. Enter data as requested, & make the appropriate menu choices.

### Technologies/Topics Used
1. java.util.Scanner
2. Arrays
3. Objects/Classes
4. Encapsulation
5. data types:

  *double

  *boolean

  *int

  *String

6. conversions:

  *implicit

  *explicit

  *promotions

7. loops:

  *do while

  *break

  *for

8. conditionals:

  *if/else

7. arithmetic/calculations
8. Methods (with parameters & return values)

### Lessons Learned
I learned that if you don't force Scanner to take a nextLine() after taking nextInt(),that it will skip your input completely because nextInt() doesn't take the carriage return.

I learned that it is much easier to complete the program by first deciding exactly what needs to be done, and then stubbing out methods to do those things, and finally filling in the methods with the appropriate logic one at a time.
