package javaPractice;

import java.net.*;
import java.io.*;

public class DateClient
{

	public static void main(String[] args)
	{
		try
		{
			String hostname = "localhost";
			int port = 7654;
			
			System.out.println("Connecting to server on port " + port);
			Socket connectionSocket = new Socket(hostname, port);
			
			BufferedReader serverInput = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream serverOutput = new DataOutputStream(connectionSocket.getOutputStream());
			
			System.out.println("Connection made, sending name.");
			serverOutput.writeBytes("Ashwin Dey\n");
			
			System.out.println("Waiting for reply.");
			String serverData = serverInput.readLine();
			System.out.println("Received: " + serverData);
			
			serverOutput.close();
			serverInput.close();
			connectionSocket.close();
		} 
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
