package mainContro;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainController {

	public static void main(String[] args) {
		try {
			Socket s =new Socket("127.0.0.1",10020);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
