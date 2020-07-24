// Client
// Always run Server file first

import java.net.*;
class ClientSide
{
public static void main(String[] args)
{
try
{
	System.out.println("Client Started");
	
	//Creating Socket Object
	// it will take two parameters ip address and port number
	Socket soc = new Socket("localhost", 1900);
}
catch(Exception e)
{
	e.printStackTrace();
}

}
}
	
