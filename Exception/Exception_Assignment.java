/* You will be given two integers x and y as input, you have to compute x/y. If x and y are 
not 32 bit signed integers or if y is zero, exception will occur and you have to report it. 
Read sample Input/Output to know what to report in case of exceptions.
Sample Input 1:
10
3
Sample Output 1:
3
Sample Input 2:
10
Hello
Sample Output 2:
java.util.InputMismatchException
Sample Input 3:
10
0
Sample Output 3:
java.lang.ArithmeticException: / by zero
Sample Input 4:
23.323
0
Sample Output 4:
java.util.InputMismatchException
*/

package Exception;
import java.util.InputMismatchException; 
import java.util.Scanner;
public class Exception_Assignment { //Main class
	public static void main(String[] args) { //Main Method
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers: "); //Calling scanner class to take inputs
        try {
        	int x = sc.nextInt(); //Taking integers
        	int y=sc.nextInt();
        	System.out.println(x/y); //This will be output if there is no exception
        }
        catch(InputMismatchException e) { //If there is input mismatch exception occurs
        	System.out.println(e); 
        }
        catch(Exception e) { //For all other exceptions this block will initiate
        	System.out.println(e);
        }}}
