package sub1;

public class Banana {

	private String county;
	private int price;
	
	//������
	public Banana(String county, int price) {
		this.county = county;
		this.price = price;
	}
	
	public void info() {
		System.out.println("������ : "+county);
		System.out.println("��   �� : "+price);
	}
	
}
