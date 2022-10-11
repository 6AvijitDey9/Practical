// Write a java program to take the input from user and print the average of the given numbers;

package Array_assignment;

import java.util.Scanner;

public class Array_Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to store: ");
		int arrsize = sc.nextInt();
		int Av[] = new int[arrsize];
		
		for(int i=0;i<arrsize;i++) {
			System.out.println("Enter the value of index number " + (i+1) + ": ");
			Av[i]=sc.nextInt();
		}
       int add=0;
       for(int i=0; i<Av.length; i++) {
    	   add = add + Av[i];
    	   int ave = add/Av.length;
    	   System.out.println("The Average is: " + ave);
    	   sc.close();
       }
	}
}
