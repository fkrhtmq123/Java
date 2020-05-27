package sub2;

import java.util.Set;
import java.util.TreeSet;

/*
 * ��¥ : 2020/05/20
 * �̸� : �赿��
 * ���� : ���� p752 TreeSet �ǽ��ϱ�
 */

public class TreeSetTest {

	public static void main(String[] args) {
		
		// TreeSet ���� �� ���ڵ����� ����
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
		tree1.add("��");
		tree1.add("��");
		tree1.add("��");
		tree1.add("��");
		tree1.add("��");
		tree1.add("��");
		tree1.add("��");
		
		for(String str : tree1) {
			System.out.print(str+", ");
		}
		
	}
	
}
