package sub1;

/*
 * 날짜 : 2020/05/06
 * 이름 : 김동욱
 * 내용 : 메서드 타입 실습하기
 */

public class MethodTypeTest {
	
	// 자바 프로그램 시작 메서드
	public static void main(String[] args) {
		
		// 메서드 호출(실행)
		double r1 = type1(1.1);
		System.out.println("r1 : "+r1);
		
		type2(true);
		
		boolean r2 = type3();
		System.out.println("r2 : "+r2);
		
		type4();
		
		// 연습 문제
        gugudan(2);
		gugudan(5);
		gugudan(7);
		
	}// main end
	
     public static void gugudan(int num) {
		
    	 System.out.println(num+"단");
    	 
		for(int i=1; i<=9; i++) {
			System.out.println(num+"x"+i+" = "+num*i);
		}
	}
	
	// type1 : 매개 변수 O, 리턴 값 O
	public static double type1(double a) {
		double result = a + 3.14;
		return result;
	}
	
	// type2 : 매개 변수 O, 리턴 값 X
	public static void type2(boolean isOk) {
		
		if(isOk) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	// type3 : 매개 변수 x, 리턴 값 O
	public static boolean type3() {
		
		int num1 = 1, num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	// type4 : 매개 변수 x, 리턴 값 X
	public static void type4() {
		System.out.println("type1(0.1) : "+type1(0.1));
	}
	
}
