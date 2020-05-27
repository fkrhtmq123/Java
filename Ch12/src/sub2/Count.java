package sub2;

public class Count {
	
	private int num;

	public int getNum() {
		return num;
	} 

	// synchronized - 오직 하나의 메소드로만 실행이 가능하게 만든다.
	//              - 경합을 막는다.
	public synchronized void setNum() {
		
		num++;
		
		//synchronized(this) {
		//	  num++;
		//}	  
		
	}

}
