package main;

public class myThread extends Thread
{
	String name;
	int time;
	
	public myThread(String x)
	{
		name = x;
	}
	
	public void run()
	{
		System.out.printf("Started Thread : %s\n" , name );
		System.out.printf("Finish  Thread : %s\n" , name );
	}
}
