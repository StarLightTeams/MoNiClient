package mainContro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;


public class MainController {

	public static void main(String[] args) {
		try {
			Socket s =new Socket("127.0.0.1",10020);
			InputStream input =s.getInputStream();
			ByteBuffer byteBuf = ByteBuffer.allocate(10240); 
			int len = 0 ; int sum = 0 ;
			byte[] byt =new byte[10240];
			while(true){
				try {
					OutputStream output =s.getOutputStream();
					//
					
					String ss= "ok";
					//转为byte数组
					byte[] b =ss.getBytes();
					//写入outputstream
					output.write(b);
					//刷新流，发送
					output.flush();
					
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//sockets.remove(socket);
				}
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
