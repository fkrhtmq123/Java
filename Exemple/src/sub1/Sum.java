package sub1;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1��° ���ڸ� �Է����ּ���.");
		int n1 = sc.nextInt();
		
		System.out.println("2��° ���ڸ� �Է����ּ���.");
		int n2 = sc.nextInt();
		
		System.out.println("3��° ���ڸ� �Է����ּ���.");
		int n3 = sc.nextInt();
		
		int result = n1 + n2 + n3;
		
		System.out.println("�� : "+result);
		
	}
	
}