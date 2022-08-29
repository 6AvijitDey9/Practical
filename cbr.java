package CallBy;

class Callbyref { //insert records 
	int age;
	String name;
}
	class cbr{
	public static void main(String[] args) {//initialized object by reference
		Callbyref inp = new Callbyref();
		Callbyref inp2 =  new Callbyref();
		
		inp.age = 23;
		inp2.age = 21;
		inp.name = "noName";
		inp2.name = "yesName";
		
		System.out.println(inp.age + " " + inp.name); //print statement 
		System.out.println(inp2.age + " " + inp2.name);
	}
}