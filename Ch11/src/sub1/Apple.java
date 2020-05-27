package sub1;

public class Apple {
	
	private String county;
	private int price;
	
	//생성자
	public Apple(String county, int price) {
		this.county = county;
		this.price = price;
	}
	
	public void info() {
		System.out.println("원산지 : "+county);
		System.out.println("가   격 : "+price);
	}
	
	@Override
	public String toString() {
		
		System.out.println("원산지 : "+county);
		System.out.println("가   격 : "+price);
		
		return super.toString();
	}

}
