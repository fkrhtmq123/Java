package p245p246;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-123467", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";	//final �ʵ�� �� ���� �Ұ�
		p1.name = "��������";
	}
}
