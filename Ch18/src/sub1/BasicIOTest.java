package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2020/05/21
 * 이름 : 김동욱
 * 내용 : 교재 p994 자바 기본 입출력 실습하기
 */

public class BasicIOTest {
	
	public static void main(String[] args) {
		
		// 시스템 기본 입력 스트림
		Scanner sc = new Scanner(System.in);
		
		// 시스템 기본 출력 스트림
		System.out.print("이름 입력 : ");
		
		String name = sc.nextLine();
		
		System.out.println("이름 : "+name);
		
	}

}
