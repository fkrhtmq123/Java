package sub1;

public class SubThread extends Thread {
	 
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	// 오버라이드 메소드여서 throw 선언 불가
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name+" 쓰레드 실행...");
			
		}
		
		System.out.println(name+" 쓰레드 종료");
		
	}

}
