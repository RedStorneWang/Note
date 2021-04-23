package abstractClass;

public class CircleDemo {
	public static void main(String[] args) {
		Circle cr=new Circle(10);
		cr.printArea();
		cr.printGirth();
		System.out.println("----------分隔线----------------");
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
	//计算圆的面积
	public double area() {
		return PI*Math.pow(r, 2);
	}
	//打印圆的面积
	public void printArea() {
		System.out.println("圆的面积为："+area());
	}
	//计算圆的周长
	public double girth() {
		return 2*PI*r;
	}
	//打印圆的周长
	public void printGirth() {
		System.out.println("圆的周长为："+girth());
	}
}

class Cylinder extends Circle{
	private double h;
	Cylinder(double r,double h){
		super(r);
		this.h=h;
	}
	
	//计算圆柱的表面积
	public double area() {
		return super.area()*2+super.girth()*h;
	}
	//打印圆柱面积
	public void printArea() {
		System.out.println("圆柱的表面积为："+area());
	}
	
	//计算圆柱体积
	public double volume() {
		return super.area()*h;
	}
	//打印圆柱体积
	public void printVolume() {
		System.out.println("圆柱的体积为："+volume());
	}
	//重写printGirth方法
	public void printGirth() {
		//System.out.println("圆的周长为："+girth());
	}
	
}