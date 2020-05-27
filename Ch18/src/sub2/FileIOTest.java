package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ��¥ : 2020/05/21
 * �̸� : �赿��
 * ���� : ���� p1018 �ڹ� ���� ����� �ǽ��ϱ�
 */

public class FileIOTest {
	
	public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg"; // ���� ����
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg"; // ���� �� ����
		
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int value = 0;
		
		while(true) {
			
			// InputStream���� ������ �о� ���̱�
			value = fis.read();
			if(value == -1) {
				break;
			}
			
			// OuputStream���� ������ ��������
			fos.write(value);			
			
		}
		
		// ��Ʈ�� ����(����� �ڿ� �ݳ�)
		fis.close();
		fos.close();
		
		System.out.println("���α׷� ����...");
		
	}

}
