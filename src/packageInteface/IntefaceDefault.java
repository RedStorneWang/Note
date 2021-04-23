package packageInteface;

public class IntefaceDefault {
	public static void main(String[] args) {
		ClassA ca=new ClassA();
		ca.print();
		ca.otherPrint();
		System.out.println(ClassA.INFO);
	}
}

interface InterfaceA{
	public static String INFO="static final";
	public void print();//³éÏó·½·¨
	default public void otherPrint() {
		System.out.println("InterfaceA otherPrint method");
	}
}

class ClassA implements InterfaceA{
	public void print() {
		System.out.println("ClassA print method");
		System.out.println(INFO);
	}
//	public void otherPrint() {
//		System.out.println("ClassA otherPrint");
//	}
}