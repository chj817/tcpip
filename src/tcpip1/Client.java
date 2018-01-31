package tcpip1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
   
public class Client {
  public static void main(String args[]){
	  String ip = "70.12.111.130";
	  int port = 7777;
	  Socket socket = null;
	  OutputStream outs = null;
	  OutputStreamWriter outw = null;
	  
	  InputStream in = null;
	  InputStreamReader inr = null;
	  BufferedReader br = null;
		
	  
	  
	  
	  
	  
	  
	  
	  
	  try {
		  System.out.println("Start Client ...");
		  socket = new Socket(ip,port);
		  System.out.println("Connected OK ...");
		
		  // Send Data ...
		  outs = socket.getOutputStream();
		  
		  outw = new OutputStreamWriter(outs);
		  outw.write("jmlee");
		  System.out.println("Send Completed..");
		  
		
		  
		  
	  } catch (UnknownHostException e) {
		  System.out.println("UnknownHostException ...");
		  e.printStackTrace();
	  } catch (IOException e) {
		  System.out.println("IOException ...");
		  e.printStackTrace();
	  } finally {
		try {
			outw.close();
		    outs.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	  }
  }  
}







