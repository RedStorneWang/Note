
public class Test {
	public static void main(String[] args) {
		C c=new D();
		//c.move();
	}
}

class C{
	private void move() {
		System.out.println("C�ڶ�");
	}
	C(){
		move();
	}
}

class D extends C{
	private void move() {
		System.out.println("D�ڶ�");
	}
	D(){
		move();
	}
}