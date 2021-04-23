package april17;

public class Test {
	public static void main(String[] args) {
		Person p=new Student();
		System.out.println("---------分隔线-------------");
		Student s=new Student("李四","广州","男",28,85,93);
		System.out.println("---------分隔线-------------");
		p=new Student(31,45);
		
	}
}

class Person{
	String name;
	String addr;
	String sex;
	int age;
	
	public String talk() {
		return "姓名："+name+"\n地址："+addr+"\n性别："+sex+"\n年龄："+age;
	}
}

class Student extends Person{
	int math;
	int english;
	
	Student(String name,String addr,String sex,int age,int math,int english){
		super.name=name;
		super.addr=addr;
		super.sex=sex;
		super.age=age;
		this.math=math;
		this.english=english;
		System.out.println(talk());
	}
	public String talk() {
		return	super.talk()+"\n数学成绩："+math+"\n英语成绩："+english;
	}
	
	Student(int math,int english){
		super.name="张三";
		super.addr="深圳";
		super.sex="男";
		super.age=25;
		this.math=math;
		this.english=english;
		System.out.println(talk());
	}
	
	Student(){
		super.name="张三";
		super.addr="深圳";
		super.sex="男";
		super.age=25;
		this.math=100;
		this.english=99;
		System.out.println(talk());
	}
}