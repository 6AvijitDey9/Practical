package Array_assignment;
import java.util.ArrayList;
import java.util.Iterator;
//ArrayList using user define class
class customers{
	long accountno; String CustomerName; double Balance; int CustomerAge;
	public customers(long no, String name, double bal, int age) { //Creating constructor
		this.accountno=no; this.Balance=bal; this.CustomerAge=age; this.CustomerName=name;
	}}
public class Bank { //Main class
	public static void main(String[] args) { //Main method
		customers A = new customers(12345, "Ayoddyha", 5000.45, 34); //calling class and constructor
		customers B = new customers(12365, "Anuj", 6000.55, 44);
		customers C = new customers(12455, "Angad", 7000.65, 84);
		customers D = new customers(12235, "Anusuya", 8000.75, 38);
		customers E = new customers(12785, "Ashram", 9000.85, 33);
		
		ArrayList<customers> bcd = new ArrayList<>(); //User define type ArrayList
		bcd.add(A); bcd.add(B); bcd.add(C); bcd.add(D); bcd.add(E); 
		System.out.println(bcd); //This will print the address 
		
        Iterator itr = bcd.iterator(); //Using List Iterator 
        while (itr.hasNext()) {
        	customers obj = (customers) itr.next(); //Storing each iterator data in customers type object
        	System.out.println(obj.accountno+" "+obj.CustomerName+" "+obj.Balance+" "+obj.CustomerAge); //PRint 
        }
	}
}
