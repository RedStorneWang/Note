
public class NewMethodTest {
	public static void main(String[] args) {
		A a=new B();
		a.print();
//		a.getBPrint();
	}
}

class A{
	public void print() {
		System.out.println("����A��print����");
	}
}

class B extends A{
	public void print() {
		System.out.println("����B��print����");
	}
	
	public void getBPrint() {
		System.out.println("����B��getBPrint����");
	}
}