package Core;

class exam{ //parent class
	int marks() { //method
	return 0;	
	}
}
class comp extends exam{ //child class extends parent class
	int marks() {
		return 80;
	}
}
class math extends exam{ //child class extends parent class
	int marks() {
		return 70;
	}
}
class phys extends exam{ //child class extends parent class
	int marks() {
		return 60;
	}
}
class chem extends exam{ //child class extends parent class
	int marks() {
		return 50;
	}
}
public class Overridding { //Main class
	public static void main(String[] args) { //Main Method
	comp c = new comp();
	math d = new math();
	phys e = new phys();
	chem f = new chem();
	System.out.println("Computer marks is: " + c.marks());
	System.out.println("Mathmetics marks is: " + d.marks());
	System.out.println("Physics marks is: " + e.marks());
	System.out.println("Chemistry marks is: " + f.marks());
	}
}
