package Array_assignment;

import java.util.Scanner;

public class Duplicate_value {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the array length: ");
     int leng=sc.nextInt();
     int[] arr=new int[leng];
     System.out.println("Enter the array elements: ");
     for(int i = 0;i < leng;i++) {
    	 arr[i]=sc.nextInt();
     }
      for (int i = 0;i < arr.length; i++) {
    	 for (int j = i + 1; j < arr.length; j++) {
    		 if ((arr[i] == arr[j])) {
    			 System.out.println("Duplicate element: " + arr[j]);
    		 }}}}}