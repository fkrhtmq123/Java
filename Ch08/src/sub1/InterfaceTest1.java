package sub1;

/*
 * 날짜 : 2020/05/13
 * 이름 : 김동욱
 * 내용 : 교재 p344 인터페이스 실습하기
 */

public class InterfaceTest1 {
	
	public static void main(String[] args) {
		
		// 인터페이스 역할 : 클래스 설계의 표준 가이드 역할
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
		RemoteControl samsung  = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundUp();
		
	}

}
