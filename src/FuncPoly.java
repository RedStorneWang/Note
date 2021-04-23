
public class FuncPoly {
	void sum(int i) {
		System.out.println("数字的和为："+i);
	}
	
	void sum(int i,int j) {
		System.out.println("数字的和为："+(i+j));
	}
	public static void main(String[] args) {
		FuncPoly fp=new FuncPoly();
		fp.sum(5);
		fp.sum(5,6);
	}
}
