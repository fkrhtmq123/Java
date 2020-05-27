package sub1;

/*
 * ��¥ : 2020/05/19
 * �̸� : �赿��
 * ���� : ���� p576 ������(Thread) �ǽ��ϱ�
 */

/* 
 * Thread
 * - �ϳ��� ���μ��� �ȿ��� ����Ǵ� ���� �帧
 * - ���α׷��� ����ɶ� �����Ǵ� ���� �帧
 * - Thread Ŭ������ ��ӹ޾� start() �޼ҵ�� ���꾲���� ����
 */

public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
		
		// �񵿱�(Asyncronize) ������� ����
		sub1.start();
		sub2.start();
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);
			
			System.out.println("Main Thread ����...");
			
		}
		
		System.out.println("Main Thread ����...");
		
	}

}
