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
		
		System.out.println("------------分隔线--------------");
	}
}

interface A{
	//定义一个接口
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
		System.out.println("你好");
	}

	public void fun() {
		System.out.println("抽象类C实现接口A,B");
	}
	
	public void printD() {
		System.out.println("接口D继承两个接口A,B");
	}
}
