package test08;

public class Television extends Product {

	public Television(String category, int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		System.out.println("力前 盒幅 : "+category);
		System.out.println("力前 啊拜 : "+price);
	}
}
