package sub5;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��¥ : 2020/05/19
 * �̸� : �赿��
 * ���� : ���� p538 Date Ŭ���� �ǽ��ϱ�
 */

public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		String now = sdf.format(date);
		System.out.println("now : "+now);
		
	}
	
}
