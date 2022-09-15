package Default;

public class Forloopnumpyramid3 {

	public static void main(String[] args) {
		int x=1;
		for(int i= 1; i<=4; i++) {//outer loop
			for(int j= 1; j<=i; j++) {//inner loop
				System.out.print(x);//print statement
				x++;
				if(x>9)
					break;
			}
			System.out.println();//new line
		}}}