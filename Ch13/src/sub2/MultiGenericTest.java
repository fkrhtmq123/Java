package sub2;

/*
 * ��¥ : 2020/05/20
 * �̸� : �赿��
 * ���� : ���� p654 ���׸� Ŭ���� �ǽ��ϱ�
 */

public class MultiGenericTest {
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 100);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		p1.show();
		p2.show();
		
	}

}