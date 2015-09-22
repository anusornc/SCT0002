class A {
	String data;
}

public class OutClass {
	class B {
		String data;
	}

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		A a = new A();
		outClass.createClass();
		
	}
	
	public void createClass() {
		B b = new B();
	}
}
