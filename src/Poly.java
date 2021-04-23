
public class Poly {
	public static void main(String[] args) {
		Person p=new Student();
		p.fun1();
		p.fun2();
		
		System.out.println("------------分隔线-------------");
		Student s=new Student();
		s.fun1();
		s.fun2();
		s.fun3();
		
//		System.out.println("------------分隔线--------------");
//		Student st=(Student)new Person();
//		st.fun1();
//		st.fun2();
//		st.fun3();
	}
}

class Person{
	public void fun1() {
		System.out.println("我是父类Person中的fun1");
	}
	public void fun2() {
		System.out.println("我是父类Person中的fun2");
	}
}

class Student extends Person{
	public void fun1() {
		System.out.println("我是子类Student中的fun1");
	}
	public void fun3() {
		System.out.println("我是子类Student中的fun3");
	}
}