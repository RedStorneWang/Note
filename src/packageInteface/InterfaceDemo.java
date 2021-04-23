package packageInteface;

public class InterfaceDemo {
	public static void main(String[] args) {
		ClassE ce=new ClassE();
		ce.print();
		ce.get();
		InterfaceC ic=ce;
		ic.print();
		InterfaceD id=ce;
		id.get();
	}
}

interface InterfaceC{
	public static final String INFO="Hello World";
	public abstract void print();
}

interface InterfaceD{
	public abstract void get();
}

class ClassE implements InterfaceC,InterfaceD{
	public void print() {
		System.out.println(INFO);
	}
	public void get() {
		System.out.println(INFO);
		System.out.println("实例了InterfaceD的方法");
	}
}