package Array_assignment;
import java.util.*;
public class ArrayListConvert {
	public static void main(String[] args) {
	List<String> ai = new ArrayList<String>();	
	ArrayList<String> all = new ArrayList<>();
    ai.add("You");
    all.add("This");
    ai.add("are");
    all.add("is");
    ai.add("creating");
    all.add("new");
    ai.add("ArrayList");
    all.add("ArrayList");
    System.out.println("Converting ArrayList to Array...."); //Converting ArrayList to Array
    System.out.println("The Array is: ");
    String arr[] = ai.toArray(new String[ai.size()]);
    for(String i : arr) {
    	System.out.println(i);
    }
    System.out.println("Converting Array to ArrayList...."); //Converting Array to ArrayList
    List<String> arl = new ArrayList<>();
    arl = Arrays.asList(arr);
    System.out.println("The first ArrayList: "+arl);
    System.out.println("The second ArrayList: "+all);
    boolean b = ai.equals(all); //Comparing two ArrayList
    System.out.println("The result of comparing two ArrayList is: "+b);
    }
	}
