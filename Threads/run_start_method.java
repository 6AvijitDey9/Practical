package Threads;
//Using Thread Class........
class threadpriority extends Thread{ //we can't use extends and throws together, so we need to use try-catch block
	public void run() {
		for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(800);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());//After completing the loop the thread will be the last thread
	}
}
public class run_start_method extends Thread {
	public void run() {
		System.out.println("Thread activated");
		System.out.println(Thread.currentThread().getName()); //It will print Thread 0 because it is the first thread we have created
	}
	public static void main(String[] args) {
		Thread tr = new run_start_method(); //or, run_start_method tr = new run_start_method();
		tr.start();
		Thread t1=new Thread("Avijit"); //Using the constructor thread initializing thread name;
		String str=t1.getName(); //Thread name by invoking getname method
		System.out.println(str);
		t1.start(); //Activating the t1 Thread
		threadpriority tr1 = new threadpriority();
		Thread tr2 = new threadpriority();
		threadpriority tr3 = new threadpriority();
		tr3.setName("Last thread");
		tr3.setPriority(MAX_PRIORITY);
		System.out.println(tr3.getPriority() + " " + tr3.getName());
		System.out.println(Thread.currentThread().getName()); //Here it will print as a main thread
		tr1.start(); //Three same Thread starts together and will end together
		tr2.start();
		tr3.start();
	}}

//Using runnable interface........
/*public class run_start_method implements Runnable{
	public void run() {
		System.out.println("Thread activated");
	}
public static void main(String[] args) {
	Runnable run = new run_start_method(); //or, run_start_method run = new run_start_method();
	Thread t2 = new Thread(run, "Avijit");
	t2.start();
	String str = t2.getName();
	System.out.println(str);
}}*/