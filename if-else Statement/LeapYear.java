package DecisionMaking;

//Check whether a year is leap year or not
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		System.out.print("Enter a Year: ");
		Scanner ly=new Scanner(System.in);
		int Year = ly.nextInt(); //Taking a year to be checked
		boolean leap = false;
		
		if(Year%4==0) { //Checking if the year divisible by 4 
			if(Year%100==0) { //Checking if the year divisible by 100
				if(Year%400==0) //Checking if the year divisible by 400
					leap=true;
					else //Checking if the year is not divisible by 400
						leap=false;
				}
			else //Checking if the year is not divisible by 100
				leap=true;
		}
			else //Checking if the year is not divisible by 4 
				leap=false;
		
		if(leap)
			System.out.println("You have entered " + Year + ", It is a Leap Year."); // Print Statement
		else
			System.out.println("You have entered " + Year + ", It is not a Leap Year.");
			}}



