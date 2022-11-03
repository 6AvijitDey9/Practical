package Wrapper;

import java.util.ArrayList;
//Primitive to Wrapper class 
public class Autoboxing {
	public static void main(String[] args) {
	int i = 20; //Primitive type
	Integer I = Integer.valueOf(i); //Converting Primitive type to Wrapper class object
	Integer I1 = I; //Storing the value of Integer I to I1
	int i1 = I; //Storing the value of Integer I to a primitive class variable
	System.out.println(i +" "+ I +" "+ I1 +" "+ i1); //Print Statement
	
	ArrayList<Integer> al = new ArrayList<>(); //ArrayList<Integer> al = new ArrayList<Integer>();
	//Creating an empty ArrayList of Integer type
     al.add(0); 
     al.add(i);
     al.add(I1); //Adding values on ArrayList
     al.add(i1);
     al.add(10);
     System.out.println("ArrayList: " + al); //Print Statement
	}
}
