package Assignment;
import java.util.ArrayList;

public class ListLoader { //Creating user define class
void loadList(int startNumber, int lastNumber) { //User define method
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=startNumber; i<=lastNumber; i++) {
		al.add(i);
	}}
	public static void main(String[] args) throws Exception {
		long starttime = System.currentTimeMillis(); //Time in Millis
		ListLoader ll = new ListLoader(); //Calling user define class and method
		ll.loadList(0, 10000000);
		System.out.println("The response time is: " + (System.currentTimeMillis() - starttime)+"ms"); //Calculating total response time to run the program
		long Enhancedstarttime = System.currentTimeMillis();
		first_thread ft = new first_thread(); //Calling Threads
		second_thread st = new second_thread();
		ft.start(); //Thread is in runnable state now
		st.join(); //second_thread will wait till first thread completes
		st.start();
		System.out.println("After multi threading the new response time is: " + (System.currentTimeMillis() - Enhancedstarttime)+"ms"); //After using thread concept the response time is decreased
	}}
class first_thread extends Thread{ //first_thread extending thread 
	public void run() { //Run method
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=0; i<=5000000; i++) {
		al.add(i);
	}}}
class second_thread extends Thread{
	public void run() {
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=5000000; i<=10000000; i++) {
		al.add(i);
	}}}
