package Interface1;

public class Factory {
	public static void main(String[] args) {
		String[] args1= {"apple","orange"};
		Fruit1 f=Factory1.getInstandce(args1[0]);
		f.eat();
	}
}

interface Fruit1{
	public void eat();
}

class Apple1 implements Fruit1{
	public void eat() {
		System.out.println("��ƻ��");
	}
}

class Orange1 implements Fruit1{
	public void eat() {
		System.out.println("������");
	}
}

class Factory1{
	public static Fruit1 getInstandce(String className) {
		if("apple".equals(className)) {
			return new Apple1();
		}
		if("orange".equals(className)) {
			return new Orange1();
		}
		return null;
	}
}