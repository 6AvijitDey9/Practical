package String;
import java.util.Scanner;
public class String_equal {

	public static void main(String[] args) {
		String str1, str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string: ");
		str1=sc.next();
		System.out.println("Enter second string: ");
		str2= sc.next();
		if(str1.equals(str2)) {
			System.out.println("Equal Strings");
		}
		else if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal Strings not case sensitive");
		}
		else {
			System.out.println("Not equal");
		}}}
