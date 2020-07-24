// Server
// Always run Server file first

import java.net.*;

class ServerSide
{
public static void main(String[] args)
{
// always use try and catch block in socket programming

try
{
	System.out.println("waiting for a clients...");
	
	//Creating ServerSocket Object
	ServerSocket ss = new ServerSocket(1900);
	
	//now creating servers own object with accept()
	//it will wait and as soon as request accept come it pass Socket object to Socket reference 
	Socket soc = ss.accept();
	
	System.out.println("Connection Established");

}
catch(Exception e)
{
	e.printStackTrace();
}

}
}
	
	