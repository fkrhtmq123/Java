package test10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2020/05/22
 * 이름 : 김동욱
 * 내용 : 스트림 연습문제
 */
/*
 * 객체의 직렬화
 * - 자바의 객체를 스트림을 통해 외부 파일을 생성하기 위한 작업이다.
 * - 스트림 으로 전송될 객체는 Serializable 인터페이스를 구현한다.
 * - 외부의 객체파일을 다시 자바 객첼 복원하는 것을 역직렬화라고 한다.
 */

public class JavaTest10 {
	
	public static void main(String[] args) throws Exception {
		
		Apple apple1 = new Apple("한국", 3000);
		Apple apple2 = new Apple("미국", 3000);
		
		FileOutputStream   fos = new FileOutputStream("./apple.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 현재 프로젝트 폴더 하위에 apple.txt 객체 파일 생성(직렬화)
		oos.writeObject(apple1);
		oos.writeObject(apple2);
		
		// 스트림 해제
		oos.close();
		fos.close();
		
		System.out.println("현재 폴더에 apple.txt 객체 파일 생성 완료!");
		
	}

}
