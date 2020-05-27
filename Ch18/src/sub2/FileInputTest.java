package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 날짜 : 2020/05/21
 * 이름 : 김동욱
 * 내용 : 교재 p1018 자바 파일 입출력 실습하기
 */

public class FileInputTest {
	
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		try {
			FileInputStream fis = new FileInputStream(file);	// 파일 연결
			
			int value = 0;
			
			while(true) {
				
				value = fis.read();
				
				if(value == -1) {
					// 더이상 읽을 데이터가 없을 경우
					break;
				}
				
				char c = (char) value;
				System.out.print(c);
				
			}
			
			// 입력 스트림 해제
			fis.close();										// 파일 해제
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("\n프로그램 종료...");
		
	}

}
