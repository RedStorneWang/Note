
public class HideSubClass {
	public static void main(String[] args) {
		Father f=new Son();
		f.overWritting();
		Father.overWritting();
		Son.overWritting();
	}
}

class Father{
	public static void overWritting() {
		System.out.println("Father method");
	}
}

class Son extends Father{
	public static void overWritting() {
		System.out.println("Son method");
	}
}