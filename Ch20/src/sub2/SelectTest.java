package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2020/05/26
 * 이름 : 김동욱
 * 내용 : JDBC Select 실습하기
 */

public class SelectTest {
	
	public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/kdw";
		String user = "kdw";
		String pass = "1234";
		
	    // 1단계 - JDBC 드라이버 동적로드
	    Class.forName("com.mysql.jdbc.Driver");
	    
	    // 2단계 - 데이터베이스 접속
	    Connection conn =  DriverManager.getConnection(host, user, pass);
	    
	    // 3단계 - SQL 실행객체 생성
	    Statement stmt = conn.createStatement();
	    
	    // 4단계 - SQL 실행
	    String sql = "SELECT * FROM `USER1`";
	    ResultSet rs =  stmt.executeQuery(sql);
	    	
	    // 5단계 - 결과셋(ResultSet) 처리(SELECT일 경우)
	    while(rs.next()) {
	    	System.out.println("===================");
	    	System.out.println("아이디 : "+rs.getString(1));
	    	System.out.println("이   름 : "+rs.getString(2));
	    	System.out.println("휴대폰 : "+rs.getString(3));
	    	System.out.println("나   이 : "+rs.getInt(4));
	    }
	    
	    // 6단계 - 데이터베이스 접속 종료
	    conn.close();
			
		System.out.println("SELECT 완료...");
		
	}

}
