package Array_assignment;

import java.util.Scanner;

public class find_index {

      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to store: ");
		int arrsize = sc.nextInt();
		int i=0;
		int index=-1;
		int arr_ele;
		int in[] = new int[arrsize];
		System.out.println("Enter the array values: ");
		for(i=0;i<in.length;i++) {
			in[i]=sc.nextInt();
		}
		System.out.println("Enter the array element you want to find: ");
		arr_ele = sc.nextInt();
		while(i<in.length) {
			if(in[i]==arr_ele) {
				index = i;
				break;
			}
			i++;
		}
		System.out.println("Index of: " + arr_ele + " is " + index);
		}
	}
