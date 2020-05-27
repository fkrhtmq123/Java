package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/*
 * ��¥ : 2020/05/26
 * �̸� : �赿��
 * ���� : PrepareStatement �ǽ��ϱ�
 */

public class PrepareStatementTest {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("����� ���(���� : 0, ��� : 1)");
			System.out.println("���� : ");
			
			int choice = sc.nextInt();
			
			if(choice ==0) {
				break;
			}
			
			System.out.println("���̵� �Է� : ");
			String uid = sc.next();
			
			System.out.println("�̸� �Է� : ");
			String name = sc.next();
			
			System.out.println("�޴��� �Է� : ");
			String hp = sc.next();
			
			System.out.println("���� �Է� : ");
			int age = sc.nextInt();
			
			insertUser(uid, name, hp, age);
			
		} while(true);
		
		System.out.println("���α׷� ����...");
		
	} // main end
	
	public static void insertUser(String uid, String name, String hp, int age) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/kdw";
		String user = "kdw";
		String pass = "1234";
		
	    // 1�ܰ� - JDBC ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
	    // 2�ܰ� - �����ͺ��̽� ����
		Connection conn =  DriverManager.getConnection(host, user, pass);
		
	    // 3�ܰ� - SQL ���ఴü ���� �� ������ ����
		String sql = "INSERT INTO `USER1` VALUES (?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uid);
		pstmt.setString(2, name);
		pstmt.setString(3, hp);
		pstmt.setInt(4, age);
		
	    // 4�ܰ� - SQL ����
		pstmt.executeUpdate(sql);
		
	    // 5�ܰ� - �����(ResultSet) ó��(SELECT�� ���)
	    // 6�ܰ� - �����ͺ��̽� ���� ����
		pstmt.close();
		conn.close();
	
		System.out.println("INSERT �Ϸ�...");
	}

}
