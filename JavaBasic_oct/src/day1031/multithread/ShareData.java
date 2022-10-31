package day1031.multithread;

import java.util.concurrent.locks.ReentrantLock;

//자원을 가지고 연산을 하는 스레드에 사용할 클래스
public class ShareData implements Runnable{

	//연산 결과를 저장할 속성
	private int result;

	//연산에 사용할 인덱스
	private int idx;

	//공유 코드 영역을 설정하기 위한 객체
	static final ReentrantLock lock = new ReentrantLock();

	//result 의 getter
	public int getResult() {
		return result;
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i< 10; i++) {
				//synchronized (this) {
				/* 다른애가 못쓰도록 하는 것은 최소화 해야됨. (화장실 문을 잠그는게 아니라 칸 문만 잠그면 됨) */
				//자물쇠를 채워서 unlock을 만날때 까지는 이 영역의 자원을 수정할 수 없다.
				lock.lock();
					idx++;
					Thread.sleep(1);
					result = result + idx;
				lock.unlock();
			}
			//}

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
}
