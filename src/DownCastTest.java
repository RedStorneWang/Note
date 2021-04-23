
public class DownCastTest {
	public static void main(String[] args) {
		Aa a=new Bb();
		a.print();
		//System.out.println(a.getClass());
		Bb b=(Bb)a;
		//b.print();
		b.getB();
		//System.out.println(b.getClass());

	}
}

class Aa{
	public void print() {
		System.out.println("类A的print方法");
	}
}

class Bb extends Aa{
	public void print() {
		System.out.println("类B的print方法");
	}
	
	public void getB() {
		System.out.println("类B的getB方法");
	}
}