package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2020/05/21
 * 이름 : 김동욱
 * 내용 : 교재 p1018 자바 파일 입출력 실습하기
 */

public class FileIOTest {
	
	public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg"; // 존재 파일
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg"; // 생성 전 파일
		
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int value = 0;
		
		while(true) {
			
			// InputStream으로 데이터 읽어 들이기
			value = fis.read();
			if(value == -1) {
				break;
			}
			
			// OuputStream으로 데이터 내보내기
			fos.write(value);			
			
		}
		
		// 스트림 해제(연결된 자원 반납)
		fis.close();
		fos.close();
		
		System.out.println("프로그램 종료...");
		
	}

}
