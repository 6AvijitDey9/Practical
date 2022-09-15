package CallBy;

class Callbymethod {
	int age; String name;
	void input(int n, String S) { //insert records method 1
		age = n;
		name = S;
	}
	void display() { //display records method 2
		System.out.println(age + " " + name);
	}
}
	class cbm{
	public static void main(String[] args) { //initialized object by reference
		Callbymethod inp = new Callbymethod();
		Callbymethod inp1 = new Callbymethod();
		Callbymethod inp2 = new Callbymethod();
		inp.input(12, "Ram"); //initialized object by method
		inp.display();
		inp1.input(13, "Rahim");
		inp1.display();
		inp2.input(14, "Antony");
		inp2.display(); //print statement 
	}
}