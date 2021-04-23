
public class ObjectPoly {
	public static void main(String[] args) {
		Animal a;
		Fish f=new Fish();
		Bird b=new Bird();
		Horse h=new Horse();
		
		a=f;a.move();
		a=b;a.move();
		a=h;a.move();
	}
}

class Animal{
	public void move() {
		System.out.println("动物移动");
	}
}

class Fish extends Animal{
	public void move() {
		System.out.println("鱼儿游");
	}
}

class Bird extends Animal{
	public void move() {
		System.out.println("鸟儿飞");
	}
}

class Horse extends Animal{
	public void move() {
		System.out.println("马儿跑");
	}
}