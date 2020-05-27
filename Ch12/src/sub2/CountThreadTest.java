package sub2;

/*
 * ��¥ : 2020/05/19
 * �̸� : �赿��
 * ���� : ���� p576 ������ Ȱ�� �ǽ��ϱ�
 */

public class CountThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count(); 
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		// ���� �����忡�� �Ļ��� ���� �������� �۾��� �Ϸ�� �� �ٽ� ���� ������� �շ��Ǵ°��� ����
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("��� : "+count.getNum());
		
	}

}
