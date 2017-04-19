

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientRecieve implements Runnable {

	
	Socket client;//server
	clientGUI cg;
	public ClientRecieve(Socket client,clientGUI x) {
		
		this.client=client;
		this.cg=x;
	}
	
	
	
	@Override
	public void run() {
	
		
		
		try {
		Scanner s1 = new Scanner(client.getInputStream());
			while(s1.hasNext()){
				String s=s1.nextLine();
				cg.input(s);
			}
			
			

		} catch (IOException e) {
			System.out.println("done");
			
			
		}
		
	}

}
