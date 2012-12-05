package javaPractice;

import java.io.IOException;
import java.net.URL;

public class URLDemo
{

	/*The following URLDemo demonstrates the various parts of a URL.
	 *A URL is entered as a string, and the URLDemo program outputs
	 *each part of the given URL. 
	 */
	public static void main(String[] args)
	{
		try
		{
			URL url = new URL("http://www.perspecsys.com/resources/introduction-to-tokenization/");
			System.out.println("URL: \t\t" + url.toString());
			System.out.println("protocol: \t" + url.getProtocol());
			System.out.println("authority: \t" + url.getAuthority());
			System.out.println("file name: \t" + url.getFile());
			System.out.println("host: \t\t" + url.getHost());
			System.out.println("path: \t\t" + url.getPath());
			System.out.println("port: \t\t" + url.getPort());
			System.out.println("default port: \t" + url.getDefaultPort());
			System.out.println("query: \t\t" + url.getQuery());
			System.out.println("ref: \t\t" + url.getRef());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
