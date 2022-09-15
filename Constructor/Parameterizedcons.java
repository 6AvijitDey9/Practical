package CallBy;

public class Parameterizedcons {
int age;
String name;

Parameterizedcons(int a, String n){
	age=a;
	name=n;
}
void display() {
	System.out.println(age + " " + name);
}
	public static void main(String[] args) {
		Parameterizedcons r=new Parameterizedcons(23, "Chulbul");
		Parameterizedcons w=new Parameterizedcons(25, "Chunnu");
		
		r.display();
		w.display();
	}

}
