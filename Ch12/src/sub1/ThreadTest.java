package sub1;

/*
 * 날짜 : 2020/05/19
 * 이름 : 김동욱
 * 내용 : 교재 p576 스레드(Thread) 실습하기
 */

/* 
 * Thread
 * - 하나의 프로세스 안에서 실행되는 실행 흐름
 * - 프로그램이 실행될때 생성되는 실행 흐름
 * - Thread 클래스를 상속받아 start() 메소드로 서브쓰레드 실행
 */

public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
		
		// 비동기(Asyncronize) 방식으로 실행
		sub1.start();
		sub2.start();
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);
			
			System.out.println("Main Thread 실행...");
			
		}
		
		System.out.println("Main Thread 종료...");
		
	}

}
