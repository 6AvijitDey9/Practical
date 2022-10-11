package String;

public class String_ChartoString {
	public void show() {
char[] arr= {'J', 'A', 'V', 'A'};
String S=new String(arr);
System.out.println("Value is: " + S);
System.out.println(arr);
	}
	public void function() {
		String m1="Avijit";
		String m2="Dey";
		String m3=new String("Dey");
	}
	public static void main(String[] args) {
		String_ChartoString SC=new String_ChartoString();
		SC.show();
		SC.function();
	}}
