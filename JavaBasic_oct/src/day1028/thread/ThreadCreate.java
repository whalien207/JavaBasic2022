package day1028.thread;

//Thread 클래스로 부터 상속받는 클래스를 생성 (class 상속받기 extends)
class ThreadEx extends Thread{
	@Override //요거는 어노테이션이라고 부른다 : 상위 클래스나 인터페이스에서 제공하는 메서드가 아닌 경우 에러를 발생시켜 주는 어노테이션이다.
	public void run() {
		//Thread로 수행할 내용
		//1초마다 Thread 클래스라는 문장을 10번 출력
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread Class");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}

	}
}

//Runnable 인터페이스를 구현한 클래스를 생성 (인터페이스 상속받기 implements)
class RunnableImpl implements Runnable{ 
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Runnable Interface");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}	
}


public class ThreadCreate{

	public static void main(String[] args) {
		//Thread 클래스로부터 상속받은 클래스를 이용해서 스레드를 생성하고 실행
		Thread th1 = new ThreadEx();
		//start를 호출하면 run 메서드의 내용을 수행
		th1.start();

		//Runnable 인터페이스를 implements 클래스를 이용해서 스레드를 생성하고 실행
		Thread th2 = new Thread(new RunnableImpl());
		th2.start();

		//Runnable 인터페이스를 Anonymous Class를 이용해서 사용
		Thread th3 = new Thread(new RunnableImpl() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Anonymous 활용");
					} catch (Exception e) {
						System.out.println(e.getLocalizedMessage());
					}
				}
			}
		});
		th3.start();

		//Runnable 인터페이스를 Public void run 메서드 1개만 소유 즉, 람다로 가능
		//람다를 이용해서 작성하는 것도 가능
		Thread th4 = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Lambda 활용");
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		th4.start();
		
	}
}
