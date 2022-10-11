//Write a java Program to reverse the array contents.


package Array_assignment;

public class Array_reverse {

	static int[] reversearray() {
		return new int[] {19,28,37,46,55};
	}
	
	public static void main(String[] args) {
		int rev[]=reversearray();
		for(int i=4; i>=0; i--) {
			System.out.print(rev[i]+" ");
		}
	}
}
