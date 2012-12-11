package javaPractice;

import java.io.*;
import java.net.*;

public class EchoClient
{
	/*EchoClient creates a socket thereby getting a connection to the Echo server.
	 *It reads input from the user on the standard input stream, and then forwards
	 *that text to the Echo server by writing the text to the socket. The server 
	 *echoes the input back through the socket to the client.
	 */
	public static void main(String[] args) throws IOException
	{
		Socket echoSocket = null;
		BufferedReader input = null;
		DataOutputStream output = null;

		try
		{
			echoSocket = new Socket("localhost", 7655);			
			input = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
			output = new DataOutputStream(echoSocket.getOutputStream());
			
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			String userInput;

			while ((userInput = stdIn.readLine()) != null)
			{
				output.writeBytes(userInput);
				System.out.println("echo: " + input.readLine());
			}

			output.close();
			input.close();
			stdIn.close();
			echoSocket.close();
		} 
		catch (UnknownHostException e)
		{
			System.err.println("Unknown host.");
			System.exit(1);
		} 
		catch (IOException e)
		{
			System.err.println("Couldn't get I/O for the connection to.");
			System.exit(1);
		}		
	}
}