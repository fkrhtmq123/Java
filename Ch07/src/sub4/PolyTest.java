package sub4;

/*
 * 날짜 : 2020/05/12
 * 이름 : 김동욱
 * 내용 : 교재 p305 다형성(Polymorphism) 실습하기
 */
/*
 * 오버라이드(Override)
 * - 부모 클래스의 멤버 메서드를 자식 클래스에서 다시 정의하는 것(재 정의)
 * - 자식 클래스의 다시 정의한 메서드로 부모 클래스의 메서드를 덮어쓴다.(가려진다.)
 * 
 * 다형성(Polymorphism)
 * - 상속관계에 있는 부모 클래스의 구체적인 내용이 상속받는 자식 클래스로 변하는 성질
 * - 부모 클래스의 타입으로 객체를 선언하는 것
 */

public class PolyTest {
	
	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		// 다형성 활용
		Tiger ani1 = new Tiger();
		Eagle ani2 = new Eagle();
		Shark ani3 = new Shark();
		
		// 객체 배열
		Animal arr[] = {ani1, ani2, ani3};
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
	}

}
