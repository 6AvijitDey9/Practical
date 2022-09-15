package CallBy;

import java.util.Scanner;

public class UserdefineMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		Oddevencheck(num);
	}

	private static void Oddevencheck(int num) {
		if(num%2==0)
			System.out.println("You have entered " + num + ", It is an even number");
		else
			System.out.println("You have entered " + num + ", It is an odd number");
		
	}

}
