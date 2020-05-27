package sub3;

public class Calc {
	
	// �̱��� ��ü(instance �κ��� ���� ����)
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	// �ش� �޼���� ������ �߻��� �� �ִٴ� ���ɼ��� throws ������ ���� ȣ���ϴ� �ʿ� �˸�
	public int div(int x, int y) throws Exception {
		
		if(y<0) {
			// ������ �߻��Ҷ� �޼��带 ȣ���ϴ� ������ ������ ������.
			Exception e = new Exception("y�� ��� �̾�� �մϴ�.");
			throw e;
		} else if(y==1) {
			Exception e = new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ�.");
			throw e;
		}
		
		int z = x / y;
		return z;
	}

}