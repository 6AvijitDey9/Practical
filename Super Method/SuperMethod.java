package Core;

class shape1{ //Parent class
	void print() { //Parent class method
		System.out.println("Print Circle"); //Print line
	}
}

class size1 extends shape1{ //Child class extends parent class
	void print() { //child class method
		System.out.println("print Circle size");
	}
	void display() { //child class method
		System.out.println("Print Circle Display");
	}
	void show() { //child class method
		super.print(); //Invoke immediate parent class constructor
		print(); //print line of child class method
		display(); //child class method print line
	}
}

public class SuperMethod {
	public static void main(String[] args) { //main method
		size1 obj = new size1(); //creating object of child class
		obj.show();
	}

}
