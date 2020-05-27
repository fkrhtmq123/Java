package sub2;

import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2020/05/20
 * 이름 : 김동욱
 * 내용 : 교재 p752 TreeSet 실습하기
 */

public class TreeSetTest {

	public static void main(String[] args) {
		
		// TreeSet 생성 및 숫자데이터 저장
		Set<Integer> tree = new TreeSet<>();
		tree.add(23);
		tree.add(10);
		tree.add(48);
		tree.add(15);
		tree.add(7);
		tree.add(22);
		tree.add(56);
		
		System.out.println("Tree : "+tree.size());
		
		for(int num : tree) {
			System.out.print(num+", ");
		}
		
		System.out.println();
		
		Set<String> tree1 = new TreeSet<>();
		tree1.add("가");
		tree1.add("바");
		tree1.add("사");
		tree1.add("나");
		tree1.add("다");
		tree1.add("마");
		tree1.add("라");
		
		for(String str : tree1) {
			System.out.print(str+", ");
		}
		
	}
	
}
