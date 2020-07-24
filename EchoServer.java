// Server

import java.net.*;
import java.io.*;
class EchoServer
{
public static void main(String[] args)
{
try
{
	System.out.println("Waiting for client....");
	ServerSocket ss = new ServerSocket(1900);
	Socket soc = ss.accept();
	System.out.println("Connection establish...");
	
	//reading String from Client
	BufferedReader recieve = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	
	String str = recieve.readLine();
	System.out.println(str);
	
	// Sending String to client which is recieve
	PrintWriter send = new PrintWriter(soc.getOutputStream(),true);
	send.println("Server Says " +str);
}
catch(Exception e)
{
	e.printStackTrace();
}

}
}