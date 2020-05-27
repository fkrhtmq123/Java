package sub1;

/*
 * 날짜 : 2020/05/04
 * 이름 : 김동욱
 * 내용 : 자바 배열 기초 실습하기
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 변수
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 =5;
		
		// 배열(원소 번호를 index 번호, 배열의 갯수를 length)
		int nums[] = {1, 2, 3, 4, 5};
		
		// 배열의 길이
		System.out.println("배월 nums의 원소의 갯수 : "+nums.length);
		
		// 배열 원소 출력
		for(int i = 0; i<nums.length; i++) {
			
			System.out.println("배열 nums의"+(i+1)+"번째 원소 : "+nums[i]);
		}
		
		// 확인 문제
		String p1 = "김유신";
		String p2 = "김춘추";
		String p3 = "장보고";
		String p4 = "강감찬";
		String p5 = "이순신";
		
		String []people = {p1, p2, p3, p4, p5};
		
		// 배열의 반복문
		for(String person : people) {
			
			System.out.print(person+", ");
		}
	}	

}
