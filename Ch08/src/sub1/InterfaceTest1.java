package sub1;

/*
 * ��¥ : 2020/05/13
 * �̸� : �赿��
 * ���� : ���� p344 �������̽� �ǽ��ϱ�
 */

public class InterfaceTest1 {
	
	public static void main(String[] args) {
		
		// �������̽� ���� : Ŭ���� ������ ǥ�� ���̵� ����
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
		RemoteControl samsung  = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundUp();
		
	}

}