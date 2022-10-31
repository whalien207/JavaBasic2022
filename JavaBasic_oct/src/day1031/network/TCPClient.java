package day1031.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);) {
			
			while(true) {
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8080);
				System.out.print("보낼 메세지: ");
				String msg = sc.nextLine();
				
				//메세지 보내기
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println(msg + "\n");
				pw.flush();
				
				//메세지 받기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String response = br.readLine();
				System.out.println(response);
				
				br.close();
				pw.close();
				socket.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
