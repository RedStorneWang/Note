package Interface1;

public class AbstractInterface {
	public static void main(String[] args) {
		X x=new X();
		A a=x;
		B b=x;
		C c=x;
		D d=x;
		
		a.print();
		b.get();
		c.fun();
		d.printD();
		
		System.out.println("------------�ָ���--------------");
	}
}

interface A{
	//����һ���ӿ�
	String INFO="Hello World";
	void print();
	default void set() {
		System.out.println("A");
	}
}

interface B{
	public abstract void get();
}

abstract class C implements A,B{
	public abstract void fun();
}

interface D extends A,B{
	public void printD();
}

class X extends C implements D{
	public void print() {
		System.out.println(INFO);
	}
	
	public void get() {
		System.out.println("���");
	}

	public void fun() {
		System.out.println("������Cʵ�ֽӿ�A,B");
	}
	
	public void printD() {
		System.out.println("�ӿ�D�̳������ӿ�A,B");
	}
}
