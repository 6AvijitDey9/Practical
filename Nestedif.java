package DecisionMaking;

public class Nestedif {

	public static void main(String[] args) {
		String address = "Kolkata, India";//Taking input
		if (address.endsWith("India")) {//check if the input approves this first condition
			if(address.contains("Dunlop")) {
				System.out.println("The city is Dunlop");// if the first & second condition approves print the statement
			}
			else if (address.contains("Newtown")) {
				System.out.println("The city is Newtown");// if the first & third condition approves print the statement
			}
			else {
				System.out.println(address.split(",")[0]);// if only the first condition approves print city name only
			}
		}
		else {
			System.out.println("You are not living in India");// if no condition approves with program logic
		}
	}

}
