package sub1;

import java.util.Scanner;

public class GetJumsu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int arg = 0;
		int[]arJumsu = new int[3];
		
		for(int i=0; i<arJumsu.length; i++) {
			System.out.println(i+1+"��° ������ �Է� ���ּ���.");
			arJumsu[i] = sc.nextInt();
			result += arJumsu[i];
		}
		
		System.out.println("��� : "+result);
		
	}

}
