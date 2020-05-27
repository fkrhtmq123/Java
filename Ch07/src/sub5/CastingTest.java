package sub5;

import sub4.Animal;
import sub4.Eagle;
import sub4.Shark;
import sub4.Tiger;

/*
 * 날짜 : 2020/05/13
 * 이름 : 김동욱
 * 내용 : 교재 p306 캐스팅 실습하기
 */

public class CastingTest {
	
	public static void main(String[] args) {
		
		// 캐스팅(형 변환)
		int    num1 = 1;
		double num2 = num1;
		
		double var1 = 1.12;
		int    var2 = (int)var1;
		
		// 업캐스팅(다형성 적용)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		// 다운캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		// intstanceof : 참조변수(객체)의 실제 인스턴스를 조사하는 연산자
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1은 Eagle입니다.");
		}else if(a1 instanceof Shark) {
			System.out.println("a1은 Shark입니다.");
		}
		
	}
}
