package sub2;

/*
 * ��¥ : 2020/04/29
 * �̸� : �赿��
 * ���� : ������ �ڷ���(������ Ÿ��) �ǽ��ϱ�
 */

public class DataTypeTest {

	public static void main(String[] args) {
		
		// ������(������ ������ ������ �� �ִ� ������ ���� Ŀ����)
		byte  var1 = 1;// �ִ� 127, 1 byte -> 8 bit
		short var2 = 2;
		int   var3 = 3;// �ִ� 2,147,483,647, 4 byte
		long  var4 = 4;
		
		System.out.println("va1 : "+var1);
		System.out.println("va2 : "+var2);
		System.out.println("va3 : "+var3);
		System.out.println("va4 : "+var4);
		System.out.println("");
		
		// �Ǽ���
		float  var5 = 1.123456789f;// �Ҽ��� �ڷ� 7�ڸ����� �׵ڷδ� �ݿø�
		double var6 = 1.23456789;// �Ҽ��� �ڷ� 16�ڸ����� �׵ڷδ� �ݿø�
		
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("");
		
		// ����
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("");
		
		// ������
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("");
		
		// ���ڿ�(�ܾ�)
		String str1 = "Appple";
		String str2 = "Hello";
		String str3 = "�ȳ�";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str2 : "+str3);
	}
}
