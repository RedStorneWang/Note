
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
		System.out.println("�����ƶ�");
	}
}

class Fish extends Animal{
	public void move() {
		System.out.println("�����");
	}
}

class Bird extends Animal{
	public void move() {
		System.out.println("�����");
	}
}

class Horse extends Animal{
	public void move() {
		System.out.println("�����");
	}
}