package p210p211;

public class Car {
	//�ʵ�
	String company = "���� �ڵ���";
	String model;
	String color;
	int maxspeed;
	
	//������
	Car() {
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
}
