package sub2;

public class Count {
	
	private int num;

	public int getNum() {
		return num;
	} 

	// synchronized - ���� �ϳ��� �޼ҵ�θ� ������ �����ϰ� �����.
	//              - ������ ���´�.
	public synchronized void setNum() {
		
		num++;
		
		//synchronized(this) {
		//	  num++;
		//}	  
		
	}

}
