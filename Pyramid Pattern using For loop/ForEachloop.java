package Default;

public class ForEachloop {

	public static void main(String[] args) {
		int sum = 0;
		int arr[]= {1, 2, 3, 4, 5};//declaring array
		for(int i:arr) {
			System.out.println(i);//printing the elements
			sum = sum + i;//getting sum of elements
		}
		System.out.println("The addition of array is: " + sum);//printing the sum of elements
	}

}
