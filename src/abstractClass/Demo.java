package abstractClass;

public class Demo {
	public static void main(String[] args) {
		Action1 a=new Robort();
		a.action1Method(a.EAT+a.WORK);
		System.out.println("-----------分隔线---------------");
		a=new Woman();
		a.action1Method(a.EAT+a.RUN+a.SLEEP);
		System.out.println("-----------分隔线---------------");
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
		System.out.println("机器人充电");
	}
	public void work() {
		System.out.println("机器人工作");
	}
	public void sleep() {
		
	}
	public void run() {
		
	}
}

class Woman extends Action1{
	public void eat() {
		System.out.println("美女要吃好的");
	}
	public void run() {
		System.out.println("美女要跑步健身");
	}
	public void sleep() {
		System.out.println("美女要睡美容觉");
	}
	public void work() {
		
	}
}

class Man extends Action1{
	public void eat() {
		System.out.println("帅哥要吃饱饭才有力气工作");
	}
	public void work() {
		System.out.println("帅哥要努力工作，赚钱养家");
	}
	public void run() {
		System.out.println("帅哥要跑步锻炼身体");
	}
	public void sleep() {
		System.out.println("忙了一天，帅哥回家倒头就睡");
	}
}