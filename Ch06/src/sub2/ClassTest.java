package sub2;
//Objected Oriented Programing
/*
 * ��¥ : 2020/05/07
 * �̸� : �赿��
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */

public class ClassTest {
	
	public static void main(String[] args) {
		
		// �������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-12-1234", "������", 10000);
		
		// �Ա�, ���, ��ȸ�ϱ�
		kb.deposit(10000);
		kb.withdraw(5000);
		//kb.money--; // ��ü�� ��������� ĸ��ȭ�� ���� ����ڵ� ����
		kb.info();
		
		// �������� ��ü����
		Account sh = new Account("��������", "121-11-1234", "������", 30000);
		
		// �Ա�, ���, ��ȸ�ϱ�
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
		
	}

}
