package day1031.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public static void main(String[] args) {
		//try~resurces 구문으로 메모리 해제를 하지 않아도 된다.
		try(ServerSocket ss = new ServerSocket(8080);) {
			System.out.println("서버 대기 중...");
			
			//클라이언트의 요청 대기
			try {
				Socket socket = null;
				while(true) {
					//클라이언트의 요청을 대기하다가 클라이언트의 요청이 오면 접속됨.
					socket = ss.accept();
					
					//접속자 정보 출력
					System.out.println("접속자 정보:" + socket.toString());
					
					//접속자와 문자열을 읽을 수 있는 스트림을 생성
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					
					//한줄의 메세지 읽기
					String msg = br.readLine();
					System.out.println(msg);
					
					//메세지를 보낼 수 있는 스트림을 생성
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					//pw.print("서버가 보내는 메세지: ");
					//pw.println(msg);//echo
					if(msg.trim().equals("히히")) {
						pw.println("하하");
					}else if(msg.trim().equals("크크")){
						pw.println("키키");
					}else {
						pw.println(msg);
					}
					pw.flush();
					
					//정리
					pw.close();
					br.close();
					socket.close();
				}
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
