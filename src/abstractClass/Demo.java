package abstractClass;

public class Demo {
	public static void main(String[] args) {
		Action1 a=new Robort();
		a.action1Method(a.EAT+a.WORK);
		System.out.println("-----------�ָ���---------------");
		a=new Woman();
		a.action1Method(a.EAT+a.RUN+a.SLEEP);
		System.out.println("-----------�ָ���---------------");
		a=new Man();
		a.action1Method(Action1.EAT+Action1.RUN+Action1.SLEEP+Action1.WORK);
	}
}

abstract class Action1{
	public static final int EAT=1;
	public static final int WORK=10;
	public static final int RUN=100;
	public static final int SLEEP=1000;
	
	public abstract void eat();
	public abstract void work();
	public abstract void run();
	public abstract void sleep();
	
	public void action1Method(int i) {
		switch(i) {
		case EAT:eat();
		break;
		case WORK:work();
		break;
		case RUN:run();
		break;
		case SLEEP:sleep();
		break;
		case EAT+WORK:
			eat();
			work();
		break;
		case EAT+RUN+SLEEP:
			eat();
			run();
			sleep();
		break;
		case EAT+RUN+SLEEP+WORK:
			eat();
			run();
			sleep();
			work();
		break;
		}
	}
}

class Robort extends Action1{
	public void eat() {
		System.out.println("�����˳��");
	}
	public void work() {
		System.out.println("�����˹���");
	}
	public void sleep() {
		
	}
	public void run() {
		
	}
}

class Woman extends Action1{
	public void eat() {
		System.out.println("��ŮҪ�Ժõ�");
	}
	public void run() {
		System.out.println("��ŮҪ�ܲ�����");
	}
	public void sleep() {
		System.out.println("��ŮҪ˯���ݾ�");
	}
	public void work() {
		
	}
}

class Man extends Action1{
	public void eat() {
		System.out.println("˧��Ҫ�Ա���������������");
	}
	public void work() {
		System.out.println("˧��ҪŬ��������׬Ǯ����");
	}
	public void run() {
		System.out.println("˧��Ҫ�ܲ���������");
	}
	public void sleep() {
		System.out.println("æ��һ�죬˧��ؼҵ�ͷ��˯");
	}
}