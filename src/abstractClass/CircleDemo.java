package abstractClass;

public class CircleDemo {
	public static void main(String[] args) {
		Circle cr=new Circle(10);
		cr.printArea();
		cr.printGirth();
		System.out.println("----------�ָ���----------------");
		Cylinder cy=new Cylinder(5,10);
		cy.printArea();
		cy.printGirth();
		cy.printVolume();
	}
}

abstract class CircleShape{
	public final double PI=Math.PI;
	public double r;
	public abstract double area();
}

class Circle extends CircleShape{
	
	Circle(double r){
		this.r=r;
	}
	//����Բ�����
	public double area() {
		return PI*Math.pow(r, 2);
	}
	//��ӡԲ�����
	public void printArea() {
		System.out.println("Բ�����Ϊ��"+area());
	}
	//����Բ���ܳ�
	public double girth() {
		return 2*PI*r;
	}
	//��ӡԲ���ܳ�
	public void printGirth() {
		System.out.println("Բ���ܳ�Ϊ��"+girth());
	}
}

class Cylinder extends Circle{
	private double h;
	Cylinder(double r,double h){
		super(r);
		this.h=h;
	}
	
	//����Բ���ı����
	public double area() {
		return super.area()*2+super.girth()*h;
	}
	//��ӡԲ�����
	public void printArea() {
		System.out.println("Բ���ı����Ϊ��"+area());
	}
	
	//����Բ�����
	public double volume() {
		return super.area()*h;
	}
	//��ӡԲ�����
	public void printVolume() {
		System.out.println("Բ�������Ϊ��"+volume());
	}
	//��дprintGirth����
	public void printGirth() {
		//System.out.println("Բ���ܳ�Ϊ��"+girth());
	}
	
}