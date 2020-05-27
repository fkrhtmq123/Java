package p397;

public class A {
	int field1;
	public void method1() {}
	
	public static int field2;
	public static void method2() {}
	
	class B {
		public void method() {
			field1 = 10;
			method();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		public void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
