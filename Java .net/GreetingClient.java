package javaPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class GreetingClient
{
	/*The following GreetingClient is a client program that connects to a server
	 *by using a socket and sends a greeting, and then waits for a response.
	 *Server name nad port number are given as command line arguments
	 */
	public static void main(String[] args)
	{
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		
		try
		{
			System.out.println("Connecting to: " + serverName + ", on port: " + port);
			Socket client = new Socket(serverName, port);
			
			System.out.println("Just connected to: " + client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			
			DataOutputStream out = new DataOutputStream(outToServer);			
			out.writeUTF("Hello from " + client.getLocalSocketAddress());
			
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Server says: " + in.readUTF());
			
			client.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
