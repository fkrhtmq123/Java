package sub1;

public class Banana {

	private String county;
	private int price;
	
	//생성자
	public Banana(String county, int price) {
		this.county = county;
		this.price = price;
	}
	
	public void info() {
		System.out.println("원산지 : "+county);
		System.out.println("가   격 : "+price);
	}
	
}
