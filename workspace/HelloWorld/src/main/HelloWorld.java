package main;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.print("Hello World");
		
		// Create 3 Threads
		myThread thread1 = new myThread("A");
		myThread thread2 = new myThread("B");	
		myThread thread3 = new myThread("C");
		
		// Start Thread
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
