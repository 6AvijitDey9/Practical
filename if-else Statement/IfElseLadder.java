package DecisionMaking;

public class IfElseLadder {

	public static void main(String[] args) {
		String name = "Riya";
		if(name == "Meena"){//first decision making condition
			System.out.println("Name is Meena");
		} 
		else if(name == "Neha") {//if the first condition not approves program logic
			System.out.println("Name is Neha");
		} 
		else if(name == "Amit") {//if the first & Second condition not approves program logic
			System.out.println("Name is Amit");
		}
		else {//If no condition approves
			System.out.println("The name is= " + name);
		}
	}

}
