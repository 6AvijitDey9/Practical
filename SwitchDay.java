package Default;


import java.util.Scanner;
public class SwitchDay {

	public static void main(String[] args) {
		String Daystring= "";
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose any number from 1-7 to check the Day of a Week");
		int Day= sc.nextInt();//Taking input from user
		//switch expression
		switch(Day){
		//case expression
		case 1: Daystring= "You have choosen Number 1, It is Sunday";
		break;
		case 2: Daystring= "You have choosen Number 2, It is Monday";
		break;
		case 3: Daystring= "You have choosen Number 3, It is Tuesday";
		break;
		case 4: Daystring= "You have choosen Number 4, It is Wednesday";
		break;
		case 5: Daystring= "You have choosen Number 5, It is Thursday";
		break;
		case 6: Daystring= "You have choosen Number 6, It is Friday";
		break;
		case 7: Daystring= "You have choosen Number 7, It is Saturday";
		break;
		//default case statement
		default: Daystring= "You have chosen an invalid number";
		}
System.out.println(Daystring);
	}

}
