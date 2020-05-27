package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2020/05/01
 * 이름 : 김동욱
 * 내용 : 반복문 for 실습하기
 */

public class ForTest {
	
	public static void main(String[] args) {
		
		// for(초기식; 조건식; 증감식)
		for( int i=1; i<=3; i++ ) {
			
			System.out.println("Hello Java!");
			
		}
				
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			sum += k;
		}
		
		System.out.println("1부터 10까지의 합 : "+sum);
		
		// 1부터 10까지 짝수합
		int eSum = 0;
		
		for(int k=1; k<=10; k++) {
			if(k%2==0) {
				eSum += k;
			}
		}
		
		System.out.println("1부터 10까지의 짝수 합 : "+eSum);
		
		// 이중 for 문
		for(int a=1; a<=3; a++) {
			
			System.out.println("a : "+a);
			for(int b=1; b<=5; b++) {
				
				System.out.println("b : "+b);
			}
		}
				
		// 구구단
		for(int x=2; x<=9; x++) {
			
			System.out.println(x+"단");
			for(int y=1; y<=9; y++) {
				
				int z = x * y;
				System.out.println(x+" x "+y+" = "+z);
			}
		}
				
		// 별 삼각형 I
		for(int start=1; start<=10; start++) {
			
			for(int end=1; end<=start; end++) {
				
				System.out.print("☆");
			}

			System.out.print("\n");
		}
		
		System.out.print("\n");
		
        for(int start=10; start>=1; start--) {
			
			for(int end=1; end<=start; end++) {
				
				System.out.print("☆");
			}

			System.out.print("\n");
		}
		
		// 별 삼각형 II
        for(int a=1; a<=5; a++) {
        	
        	for(int b=1; b<=5-a; b++) {
        		
        		System.out.print("☆");
        	}
        	
        	for(int c=1; c<=a; c++) {
        		
        		System.out.print("★");
        	}
        	
        	System.out.print("\n");
        }
        
        
        
        
        // 입력한 숫자 만큼 반복
        Scanner sc = new Scanner(System.in);
        
        System.out.print("입력 : ");
        int i = sc.nextInt();
        
        for(int r=1; r<=i; r++) {
        	System.out.println("Hell Java!");
        }

        
        
        
        
        
	}

}
