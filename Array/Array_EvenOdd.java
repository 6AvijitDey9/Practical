package Array_assignment;

import java.util.Arrays;

public class Array_EvenOdd {

	public static void main(String[] args) {
		int a[]= {3, 5, 7, 9, 0, 2, 8};
		System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println("Odd Numbers: ");
        for (int i=0; i<a.length; i++) {
        	if(a[i]%2!=0) {
        		System.out.print(a[i]+" ");
        	}
        }
        System.out.println();
        System.out.println("Even Numbers: ");
        for (int i=0; i<a.length; i++) {
        	if(a[i]%2==0) {
        		System.out.print(a[i]+" ");
        	}
        }
	}

}
