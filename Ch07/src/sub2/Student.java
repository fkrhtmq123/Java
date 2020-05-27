package sub2;

public class Student extends Person {

	private String school;
	private String major;
	
	public Student(String name, int age, String school, String major) {
		super(name, age);
		this.school = school;
		this.major = major;
	}
	
	public void hello() {
		super.hello();
		System.out.println(school+" 학생 입니다.");
		System.out.println(major+" 을/를 공부하고 있습니다.");
	}
		
}
