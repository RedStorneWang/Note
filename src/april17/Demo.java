package april17;

public class Demo {
	public static void main(String[] args) {
		ClassA ca=new ClassB();
		ca.method1(1);
		ca.method2(2);
		ca.method3(3);
		ca.method4(4);
	}
}

class ClassA{
	void method1(int i) {
		System.out.println("ClassA:method1,i="+i);
	}
	void method2(int i) {
		System.out.println("ClassA:method2,i="+i);
	}
	static void method3(int i) {
		System.out.println("ClassA:method3,i="+i);
	}
	static void method4(int i) {
		System.out.println("ClassA:method4,i="+i);
	}
}

class ClassB extends ClassA{
//	static void method1(int i) {
//		System.out.println("ClassB:method1,i="+i);
//	}
	void method2(int i) {
		System.out.println("ClassB:method2,i="+i);
	}
//	void method3(int i) {
//		System.out.println("ClassB:methos3,i="+i);
//	}
	static void method4(int i) {
		System.out.println("ClassB:method4,i="+i);
	}
}