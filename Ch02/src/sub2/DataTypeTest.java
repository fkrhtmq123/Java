package sub2;

/*
 * 날짜 : 2020/04/29
 * 이름 : 김동욱
 * 내용 : 변수의 자료형(데이터 타입) 실습하기
 */

public class DataTypeTest {

	public static void main(String[] args) {
		
		// 정수형(밑으로 갈수록 저장할 수 있는 공간의 차가 커진다)
		byte  var1 = 1;// 최대 127, 1 byte -> 8 bit
		short var2 = 2;
		int   var3 = 3;// 최대 2,147,483,647, 4 byte
		long  var4 = 4;
		
		System.out.println("va1 : "+var1);
		System.out.println("va2 : "+var2);
		System.out.println("va3 : "+var3);
		System.out.println("va4 : "+var4);
		System.out.println("");
		
		// 실수형
		float  var5 = 1.123456789f;// 소수점 뒤로 7자리까지 그뒤로는 반올림
		double var6 = 1.23456789;// 소수점 뒤로 16자리까지 그뒤로는 반올림
		
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("");
		
		// 논리형
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("");
		
		// 문자형
		char ch1 = 'A';
		char ch2 = '가';
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("");
		
		// 문자열(단어)
		String str1 = "Appple";
		String str2 = "Hello";
		String str3 = "안녕";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str2 : "+str3);
	}
}
