
public class NewMethodTest {
	public static void main(String[] args) {
		A a=new B();
		a.print();
//		a.getBPrint();
	}
}

class A{
	public void print() {
		System.out.println("父类A的print方法");
	}
}

class B extends A{
	public void print() {
		System.out.println("子类B的print方法");
	}
	
	public void getBPrint() {
		System.out.println("子类B的getBPrint方法");
	}
}