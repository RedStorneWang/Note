package abstractClass;

public class AbstractClassDemo {
	public static void main(String[] args) {
		Student s=new Student("����",24,"�����");
		Worker w=new Worker("����",35,"����");
		
		System.out.println(s.talk());
		System.out.println(w.talk());

	}
	
	
}

abstract class Person{
	String name;
	int age;
	String occ;//ְҵ/רҵ
	public abstract String talk();

}

class Student extends Person{
	Student(String name,int age,String occ){
		this.name=name;
		this.age=age;
		this.occ=occ;
	}
	public String talk() {
		return "ѧ��----������"+name+"\t���䣺"+age+"\tרҵ��"+occ;
	}
}

class Worker extends Person{
	Worker(String name,int age,String occ){
		this.name=name;
		this.age=age;
		this.occ=occ;
	}
	
	public String talk() {
		return "����----������"+name+"\t���䣺"+age+"\tְҵ��"+occ;
	}
}