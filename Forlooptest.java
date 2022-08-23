package Default;

public class Forlooptest {

	public static void main(String[] args) {
		for(int i= 1; i<=5; i++) {//outer loop
			for(int j= 1; j<=i; j++) {//inner loop
				System.out.print("x");//print statement
			}
			System.out.println();//new line
		}
	}

}
