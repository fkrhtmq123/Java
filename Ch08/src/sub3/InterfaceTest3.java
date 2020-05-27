package sub3;

/*
 * 날짜 : 2020/05/13
 * 이름 : 김동욱
 * 내용 : 인터페이스 실습하기
 */

public class InterfaceTest3 {
	
	public static void main(String[] args) {
		
		// 인터페이스 역할 : 객체간의 결합도를 낮추는 역할
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		// Cable cable = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		// cable.switchOn();
		// cable.switchOff();	이렇시 강결합이므로 인터페이스로 인해 약결합으로 조절
		
	}

}
