package test08;

public class Television extends Product {

	public Television(String category, int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		System.out.println("제품 분류 : "+category);
		System.out.println("제품 가격 : "+price);
	}
}
