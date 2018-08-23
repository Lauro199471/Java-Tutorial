// One Way Client

package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocSever 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Server is started");
		ServerSocket ss = new ServerSocket(1020);
		
		System.out.println("Server is now waiting for client response");
		Socket s = ss.accept();
		
		System.out.println("Client Connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		
		System.out.println("Client Data : " + str);
		
	}

}
