package sub2;

public class Account {
	
	// 함수(method) < 클래스(class) < 라이브러리(libray) < 프레임위크(framework)
	
	// 특성(멤버 변수)(객체의 정보)
	// - 접근권한 private 선언으로 무조선 캡슐화 한다.
	private String bank;
	private String id;
	private String name;
	private int money;
	
	// 생성자 : 객체를 생성 할때 멤버변수를 초기화하는 메서드
	Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// 기능(메서드)(static 선언 안함)
	public void deposit(int money) {
		this.money += money;
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		System.out.println("===================");
		System.out.println("은 행 명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입 금 주 : "+name);
		System.out.println("현재잔액 : "+money);
	}
	
}
