// server

import java.net.*;
import java.io.*;
class FactorialServer
{
public static void main(String[] args)
{
try
{	
	System.out.println("Waiting for the client");
	ServerSocket ss = new ServerSocket(1900);
	Socket soc = ss.accept();
	System.out.println("connection establish....");
	
	// reading input from client
	BufferedReader recieve = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	int num = Integer.parseInt(recieve.readLine());
	PrintWriter send = new PrintWriter(soc.getOutputStream(), true);
	send.println("Factorial of " + num + " is " + factorial(num));
}
catch(Exception e)
{
	e.printStackTrace();
}

}

static int factorial(int num)
{
	if(num == 0)
	return 1; 
	else
	{
		return num*factorial(num-1);
	}
}


}

	