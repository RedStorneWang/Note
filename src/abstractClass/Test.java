package abstractClass;

public class Test {
	public static void main(String[] args) {
		Action a;
		ET e=new ET();
		BeautifulGirl bg=new BeautifulGirl();
		BeautifulBoy bb=new BeautifulBoy();
		a=bb;
		a.eat();
		a.run();
		a.work();
		a.sleep();
	}
}

abstract class Action{
	public abstract void eat();
	public abstract void work();
	public abstract void run();
	public abstract void sleep();
}

class ET extends Action{
	public void eat() {
		System.out.println("�����˳��");
	}
	public void work() {
		System.out.println("�����˹���");
	}
	public void run() {
		
	}
	public void sleep() {
		
	}
}

class BeautifulGirl extends Action{
	public void eat() {
		System.out.println("��ŮҪ�Ժõ�");
	}
	public void work() {
		
	}
	public void run() {
		System.out.println("��ŮҪ�ܲ��������ֺ����");
	}
	public void sleep() {
		System.out.println("��Ů˯��˯����Ȼ��");
	}
}

class BeautifulBoy extends Action{
	public void eat() {
		System.out.println("˧��Ҫ�Է��ˣ��Է�������������");
	}
	public void work() {
		System.out.println("˧��Ҫ����׬Ǯ����");
	}
	public void run() {
		System.out.println("˧��Ҫ�ܲ��������壬�����Ǹ����ı�Ǯ");
	}
	public void sleep() {
		System.out.println("æ��һ���ˣ�˧��ؼҵ�ͷ��˯");
	}
}