package Operator;

public class OperatorExample {

	public static void main(String[] args) {
		int a=125;
		int b=25;
		int divide=a-b; int sum=a+b;
		System.out.println("The Sum is: " + sum);//addition
		System.out.println("The dividation is: " + divide);//substraction
		System.out.println("The Multiplication is: " + a*b);//multiplication
		System.out.println("The Dividation is: " + a/b);//dividation
		System.out.println("The Reminder is: " + a%b);//reminder
        System.out.println(a<b&&a>b);//and function
        System.out.println(a>b&&b<a);//if both the result is true then, the result is True
        System.out.println(a<b||a<b);//Or function
        System.out.println(a>b||a<b);//if any of the condition is true, the result is True

	}

}
