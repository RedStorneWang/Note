package april17;

public class Test1 {
	public static void main(String[] args) {
		Instrment ins;
		Wind w=new Wind();
		Percussion p=new Percussion();
		Stringed s=new Stringed();
		
		ins=w;
		ins.play();
		ins=p;
		ins.play();
		ins=s;
		ins.play();
	}

}

class Instrment{
	public void play() {
		System.out.println("����");
	}
}

class Wind extends Instrment{
	public void play() {
		System.out.println("����");
	}
}

class Percussion extends Instrment{
	public void play() {
		System.out.println("����");
	}
}

class Stringed extends Instrment{
	public void play() {
		System.out.println("����");
	}
}

