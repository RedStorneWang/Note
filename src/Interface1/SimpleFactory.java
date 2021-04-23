package Interface1;

public class SimpleFactory {
	public static void main(String[] args) {
		Fruit f=new Orange();
		f.eat();
	}
}

interface Fruit{
	public void eat();
}

class Apple implements Fruit{
	public void eat() {
		System.out.println("³ÔÆ»¹û");
	}
}

class Orange implements Fruit{
	public void eat() {
		System.out.println("³ÔéÙ×Ó");
	}
}