package abstractClass;

public class AbstractClassDemo {
	public static void main(String[] args) {
		Student s=new Student("张三",24,"计算机");
		Worker w=new Worker("老张",35,"生产");
		
		System.out.println(s.talk());
		System.out.println(w.talk());

	}
	
	
}

abstract class Person{
	String name;
	int age;
	String occ;//职业/专业
	public abstract String talk();

}

class Student extends Person{
	Student(String name,int age,String occ){
		this.name=name;
		this.age=age;
		this.occ=occ;
	}
	public String talk() {
		return "学生----姓名："+name+"\t年龄："+age+"\t专业："+occ;
	}
}

class Worker extends Person{
	Worker(String name,int age,String occ){
		this.name=name;
		this.age=age;
		this.occ=occ;
	}
	
	public String talk() {
		return "工人----姓名："+name+"\t年龄："+age+"\t职业："+occ;
	}
}