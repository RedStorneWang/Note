package abstractClass;

public class AbstractDemo {
	public static void main(String[] args) {
		Person1 p;
		Student1 s=new Student1("����",24,"�����");
		Worker1 w=new Worker1("����",35,"����");
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
	String occ;//ְҵ��רҵ
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
		return "ѧ��-->������"+name+"\t���䣺"+age+"\tרҵ��"+occ;
	}
}

class Worker1 extends Person1{
	Worker1(String name,int age,String occ){
		super(name,age,occ);
	}
	
	public String talk() {
		return "����-->������"+name+"\t���䣺"+age+"\tְҵ��"+occ;
	}
}