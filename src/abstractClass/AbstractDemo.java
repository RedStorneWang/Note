package abstractClass;

public class AbstractDemo {
	public static void main(String[] args) {
		Person1 p;
		Student1 s=new Student1("张三",24,"计算机");
		Worker1 w=new Worker1("李四",35,"生产");
		p=s;
		System.out.println(p.talk());
		p=w;
		System.out.println(p.talk())
		;
	}
}

abstract class Person1{
	String name;
	int age;
	String occ;//职业或专业
	Person1(String name,int age,String occ){
		this.name=name;
		this.age=age;
		this.occ=occ;
	}
	public abstract String talk();
}

class Student1 extends Person1{
	Student1(String name,int age,String occ){
		super(name,age,occ);
	}
	
	public String talk() {
		return "学生-->姓名："+name+"\t年龄："+age+"\t专业："+occ;
	}
}

class Worker1 extends Person1{
	Worker1(String name,int age,String occ){
		super(name,age,occ);
	}
	
	public String talk() {
		return "工人-->姓名："+name+"\t年龄："+age+"\t职业："+occ;
	}
}