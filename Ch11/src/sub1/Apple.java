package sub1;

public class Apple {
	
	private String county;
	private int price;
	
	//������
	public Apple(String county, int price) {
		this.county = county;
		this.price = price;
	}
	
	public void info() {
		System.out.println("������ : "+county);
		System.out.println("��   �� : "+price);
	}
	
	@Override
	public String toString() {
		
		System.out.println("������ : "+county);
		System.out.println("��   �� : "+price);
		
		return super.toString();
	}

}
