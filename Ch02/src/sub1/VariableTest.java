package sub1;

/*
 * 날짜 : 2020/04/29
 * 이름 : 김동욱
 * 내용 : 자바 변수 실습하기
 */

public class VariableTest {

	public static void main(String[] args) {

		// 변수 : 데이터를 저장하는 메모리 공간
		int num1 = 1;
		int num2 = 2;

		int num3 = num1 + num2;
		int num4 = (num1 * num2) * num2 + num1;
		// 소수점이 나올려면 전부 double로 바꿔야 한다.

		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
	}
}
