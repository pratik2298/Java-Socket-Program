// Client

import java.net.*;
import java.io.*;
class EchoClient
{
public static void main(String[] args)
{
try
{ 	System.out.println("Client Started...");
	Socket soc = new Socket("localhost",1900);
	BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String ");
	String clientInput = userInput.readLine();
	
	//Sending String to the server
	// true indicate Autoflush is on
	PrintWriter send  = new PrintWriter(soc.getOutputStream(), true);
	send.println(clientInput);
	
	// reading String from server and printing the String
	BufferedReader recieve = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	String msg = recieve.readLine();
	System.out.println(msg);

}
	
catch(Exception e)
{
	e.printStackTrace();
}

}
}