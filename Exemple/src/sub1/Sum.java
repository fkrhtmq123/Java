package sub1;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 숫자를 입력해주세요.");
		int n1 = sc.nextInt();
		
		System.out.println("2번째 숫자를 입력해주세요.");
		int n2 = sc.nextInt();
		
		System.out.println("3번째 숫자를 입력해주세요.");
		int n3 = sc.nextInt();
		
		int result = n1 + n2 + n3;
		
		System.out.println("합 : "+result);
		
	}
	
}