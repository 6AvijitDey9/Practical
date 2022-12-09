// Method overloading: Changing data type of argument 
package Core;

public class addition{ //Class 
	static int add(int a, int b) { //no of argument 1, add is a method
		return (a+b);
	}
	static double add(double a, double b) { //no of argument 2, add is a method
		return (a+b);
	}
}

 class OverLoading { //main class
	public static void main(String[] args) {
       System.out.println("Addition of two int type numbers is: " + addition.add(12, 34));
       System.out.println("Addition of two double type numbers is: " + addition.add(23.567, 34.789));
	}

}
