package Operator;

public class LogicalOp {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+b);//addition
		System.out.println(a-b);//substraction
		System.out.println(a*b);//multiplication
		System.out.println(a/b);//dividation
		System.out.println(a%b);//reminder
        System.out.println(a<b&&a>b);//and function
        System.out.println(a<b&&b>a);//if both the result is true then, the result is True
        System.out.println(a<b||a>b);//Or function
        System.out.println(a>b||a<b);//if any of the condition is true, the result is True
	}

}
