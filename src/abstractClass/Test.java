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
		System.out.println("机器人充电");
	}
	public void work() {
		System.out.println("机器人工作");
	}
	public void run() {
		
	}
	public void sleep() {
		
	}
}

class BeautifulGirl extends Action{
	public void eat() {
		System.out.println("美女要吃好的");
	}
	public void work() {
		
	}
	public void run() {
		System.out.println("美女要跑步健身，保持好身材");
	}
	public void sleep() {
		System.out.println("美女睡觉睡到自然醒");
	}
}

class BeautifulBoy extends Action{
	public void eat() {
		System.out.println("帅哥要吃饭了，吃饭才有力气工作");
	}
	public void work() {
		System.out.println("帅哥要工作赚钱养家");
	}
	public void run() {
		System.out.println("帅哥要跑步锻炼身体，身体是革命的本钱");
	}
	public void sleep() {
		System.out.println("忙了一天了，帅哥回家倒头就睡");
	}
}