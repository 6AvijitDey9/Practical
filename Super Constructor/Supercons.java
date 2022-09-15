package Core;

class shape{ //Parent class
	public shape() { //Constructor of parent class
	System.out.println("Hello"); // Print line	 
	}
}

class size extends shape{ //Child class
	size(){ // Constructor of child class
		super(); // Invoke immediate parent class constructor
		System.out.println("Hi"); // Print line
	}
}

public class Supercons {
	public static void main(String[] args) { // initializing the main method
		size obj = new size(); // Creating object of child class
	}

}
