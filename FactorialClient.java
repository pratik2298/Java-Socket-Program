// Client

import java.net.*;
import java.io.*;
class FactorialClient
{
public static void main(String[] args)
{
try
{
	System.out.println("client started....");
	Socket soc = new Socket("localhost", 1900);
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	System.out.println("Enter the number : ");
	int num = Integer.parseInt(in.readLine());
	
	PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
	out.println(num);
	
	BufferedReader recieve = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	System.out.println(recieve.readLine());
}
catch(Exception e)
{
	e.printStackTrace();
}


}
}
	
	