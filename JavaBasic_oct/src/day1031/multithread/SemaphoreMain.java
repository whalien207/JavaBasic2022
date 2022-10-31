package day1031.multithread;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
	
	public static void main(String[] args) {
		
		Semaphore sema = new Semaphore(2);
		
		Thread th1 = new Thread(new SemaphoreThread("민지", sema));
		Thread th2 = new Thread(new SemaphoreThread("해린", sema));
		Thread th3 = new Thread(new SemaphoreThread("다니엘", sema));
		Thread th4 = new Thread(new SemaphoreThread("혜인", sema));
		Thread th5 = new Thread(new SemaphoreThread("하니", sema));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}

}
