package sub1;

/*
 * 날짜 : 2020/05/04
 * 이름 : 김동욱
 * 내용 : 자바 다차원 배열 실습하기
 */

public class MultiArrayTest {
	
	public static void main(String[] args) {
		
		// 1차원 배열(배열 시 이름을 단수가 아닌 복수로 할 것)
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			
			sum += scores[i];
		}
		
		//for(int score : scores) {
			//sum += score;
		//}
		
		System.out.println("배열 scores의 총 합 "+sum);
		
		// 2차원 배열               0열    1열   2열    3열
		int arr2d[][] = {{1,  2,  3,  4}, // 0행
				         {5,  6,  7,  8}, // 1행
				         {9, 10, 11, 12}};// 2행
		
		for(int a=0; a<arr2d.length; a++) {
			
			for(int b=0; b<arr2d[a].length; b++) {
				
				System.out.println("배열 arr2d의 "+(a+1)+"행"+(b+1)+"열 원소 : "+arr2d[a][b]);
			}
		}
	
		// 3차원 배열
		int arr3d[][][] = {{{ 1,  2,  3}, 
			                { 4,  5,  6}, 
			                { 7,  8,  9},
			                {10, 11, 12}}, 
				           {{13, 14, 15}, 
				            {16, 17, 18}, 
				            {19, 20, 21},
				            {22, 23, 24}}, 
				           {{25, 26, 27}, 
					        {28, 29, 30}, 
					        {31, 32, 33},
					        {34, 35, 36}}};
		
		for(int c=0; c<arr3d.length; c++) {
			
			for(int d=0; d<arr3d[c].length; d++) {
				
				for(int f=0; f<arr3d[c][d].length; f++) {
					
					System.out.println("배열 arr3d의 "+(c+1)+"면"+(d+1)+"행"+(f+1)+"열 원소 : "+arr3d[c][d][f]);
				}
					
			}
		}
		System.out.println();
		
		
		int Arr3d[][][] = new int [3][4][3];
		int q, w, e, count = 1;
		
		for(q=0; q<Arr3d.length; q++) {
			
			for(w=0; w<Arr3d[q].length; w++) {
				
				for(e=0; e<Arr3d[q][w].length; e++) {
					
					Arr3d[q][w][e] = count;
					count++;
				}
			}
		}
		
		for(q=0; q<Arr3d.length; q++) {
			
			System.out.println((q+1)+"번째 2차원 배열");
			
			for(w=0; w<Arr3d[q].length; w++) {
				
				for(int val:Arr3d[q][w]) 
					System.out.print(val+" ");
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
