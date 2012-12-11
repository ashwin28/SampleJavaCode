package javaPractice;

import java.util.Date;
import java.net.*;
import java.io.*;

public class DateServer
{
	/*
	 * Sample date server that accepts incoming connections and returns the current date to clients
	 */
	public static void main(String[] args)
	{
		Date now = new Date();
		
		try
		{
			System.out.println("Waiting for a connection on port 7654.");
			ServerSocket serverSocket = new ServerSocket(7654);
			Socket connectionSocket = serverSocket.accept();
			
			BufferedReader clientInput = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream clientOutput = new DataOutputStream(connectionSocket.getOutputStream());
			
			System.out.println("Connection made, waiting for client to send their name.");
			String clientText = clientInput.readLine();
			
			String replyText = "Welcome, " + clientText + ", Today is " + now.toString() + ".\n";
			clientOutput.writeBytes(replyText);
			
			System.out.println("Sent: " + replyText);
			
			clientOutput.close();
			clientInput.close();
			connectionSocket.close();
			serverSocket.close();
		} 
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
