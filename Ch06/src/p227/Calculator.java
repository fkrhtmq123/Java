package p227;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		printIn("실행 결과 : "+result);
	}
	
	void printIn(String message) {
		System.out.println(message);
	}
}
