package Operator;

public class OperatorExample {

	public static void main(String[] args) {
		int a=125;
		int b=25;
		System.out.println("The Sum is: " + (a+b));//addition
		System.out.println("The Substraction is: " + (a-b));//Subtraction
		System.out.println("The Multiplication is: " + a*b);//multiplication
		System.out.println("The Division is: " + a/b);//division
		System.out.println("The Reminder is: " + a%b);//reminder
		
		System.out.println(a<b);//Less Than
		System.out.println(a>b);//Greater Than
		
        System.out.println(a<b&&a>b);//and function
        System.out.println(a>b&&b<a);//if both the result is true then, the result is True
        System.out.println(a<b||a<b);//Or function
        System.out.println(a>b||a<b);//if any of the condition is true, the result is True
        
        System.out.println(a++ + ++a);//Increment operator
        System.out.println(a-- + --b);
        System.out.println(a++ - ++a);
        System.out.println(a-- - --b);//Decrement operator
	}

}
