package Array_assignment;

import java.util.Arrays;

public class Remove_element {

	public static void main(String[] args) {
		int[] my_array= {12, 23, 34, 45, 56, 67, 78, 89};
		System.out.println("Original Array: " + Arrays.toString(my_array));
		int removeindex=3;
		for(int i = removeindex; i<my_array.length-1; i++) {
			my_array[i]=my_array[i+1];
		}
		System.out.println("After removing the Array is: " + Arrays.toString(my_array));
 
//Another process		

int[] ar = new int[]{1,2,3,4,5};
int[] ar_new = new int[ar.length-1];
int j=3;
for(int i=0, k=0;i<ar.length;i++){
    if(i!=j){
        ar_new[k]=ar[i];
        k++;
    }
}
System.out.println("Before deletion :" + Arrays.toString(ar));
System.out.println("After deletion :" + Arrays.toString(ar_new));
}}