package april17;

public class Test {
	public static void main(String[] args) {
		Person p=new Student();
		System.out.println("---------�ָ���-------------");
		Student s=new Student("����","����","��",28,85,93);
		System.out.println("---------�ָ���-------------");
		p=new Student(31,45);
		
	}
}

class Person{
	String name;
	String addr;
	String sex;
	int age;
	
	public String talk() {
		return "������"+name+"\n��ַ��"+addr+"\n�Ա�"+sex+"\n���䣺"+age;
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
		return	super.talk()+"\n��ѧ�ɼ���"+math+"\nӢ��ɼ���"+english;
	}
	
	Student(int math,int english){
		super.name="����";
		super.addr="����";
		super.sex="��";
		super.age=25;
		this.math=math;
		this.english=english;
		System.out.println(talk());
	}
	
	Student(){
		super.name="����";
		super.addr="����";
		super.sex="��";
		super.age=25;
		this.math=100;
		this.english=99;
		System.out.println(talk());
	}
}