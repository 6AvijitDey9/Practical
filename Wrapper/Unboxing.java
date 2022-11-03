package Wrapper;

import java.util.ArrayList;

public class Unboxing {
	public static void main(String[] args) {
		Integer In = new Integer(198); //Creating a wrapper class variable
		int i = In.intValue(); //Converting Wrapper class to Primitive class
		Integer In2 =  i; //Storing a int value to Integer
		System.out.println(In +" "+ i +" "+ In2); //Print Statement
		
		ArrayList<Integer> al = new ArrayList<>(); //ArrayList<Integer> al = new ArrayList<Integer>();
		//Creating an empty ArrayList of Integer type
	     al.add(0); 
	     al.add(i);
	     al.add(In); //Adding values on ArrayList
	     al.add(In2);
	     al.add(10);
	     int position = al.get(3); //Getting the value of 3rd index
	     System.out.println("Value of index 3 is: " + al.get(3) + " or, " + position);
	}
}
