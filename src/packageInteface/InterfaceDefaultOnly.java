package packageInteface;

public class InterfaceDefaultOnly {
	public static void main(String[] args) {
		ClassB cb=new ClassB();
		cb.print();
	}
}

interface InterfaceB{
	default public void print() {
		System.out.println("InterfaceB default method");
	}
}

class ClassB implements InterfaceB{
	
}
