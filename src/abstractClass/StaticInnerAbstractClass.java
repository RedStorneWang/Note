package abstractClass;

public class StaticInnerAbstractClass {
	public static void main(String[] args) {
		Book.CD bc=new JavaCD();
		bc.get();
	}
}

abstract class Book{
	public abstract void print();
	static abstract class CD{
		public abstract void get();
	}
}

class JavaCD extends Book.CD{
	public void get() {
		System.out.println("Javaѧϰ");
	}
}