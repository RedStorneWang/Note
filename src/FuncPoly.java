
public class FuncPoly {
	void sum(int i) {
		System.out.println("���ֵĺ�Ϊ��"+i);
	}
	
	void sum(int i,int j) {
		System.out.println("���ֵĺ�Ϊ��"+(i+j));
	}
	public static void main(String[] args) {
		FuncPoly fp=new FuncPoly();
		fp.sum(5);
		fp.sum(5,6);
	}
}
