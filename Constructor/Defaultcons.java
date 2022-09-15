package CallBy;

public class Defaultcons {
	/*int age;
	String name;
	
	void display() { //method has return types
		System.out.println(age + " " + name);
	}

	public static void main(String[] args) {
		Defaultcons a=new Defaultcons();
		Defaultcons b=new Defaultcons();
		a.display();
		b.display();
	}*/
	
	
	Defaultcons(){ //Constractor don't have any return type
		System.out.println("Constractor is created");
	}
	public static void main(String... args) {
		Defaultcons q=new Defaultcons();
	}

}
