package Array_assignment;
import java.util.*;
public class Compare_Arraylist {

	public static void main(String[] args) {
		// Creating ArrayList
		ArrayList<String> als = new ArrayList<>();
		List<String> als1 = new ArrayList<String>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		// Adding values on ArrayList
		als.add("First"); als.add("Second"); als.add("Third"); als.add("fourth");
		als1.add("First"); als1.add("Second"); als1.add("Third"); als1.add("NoInput");
		al.add(12); al.add(21); al.add(32); al.add(23);	al.add(19);
		// Using different methods to get boolean outputs
		System.out.println(als.equals(als1));
		System.out.println(als.removeAll(als1));
		System.out.println(als.retainAll(als1));
		System.out.println(als.contains(als1));
		System.out.println(als.toString().contentEquals(als1.toString()));
		// Sorting and Traversing through ArrayList
		System.out.println(al); // Printing ArrayList
		Collections.sort(al); 
		for(int val : al) { // Traversing Through ArrayList
			System.out.print(val + " ");
		}}}
