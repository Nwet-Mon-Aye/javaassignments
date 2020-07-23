package javaoop;
import java.util.Scanner;

abstract class areatypes{
	abstract void rectangle(double l,double b);
	abstract void triangle(double b,double h);
	abstract void square(double s);
	abstract void circle(double r);
}
class findarea extends areatypes{
	void rectangle(double l,double b) {
		double area=l*b;
		System.out.println("Area of Rectangle "+area);
	}
	void triangle(double b,double h) {
		double area=(b*h)/2;
		System.out.println("Area of Triangle "+area);
	}
	void square(double s) {
		double area=s*s;
	}
	void circle(double r) {
		double area=3.14*r*r;
	}
}

public class calculateareas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l,h,b,r,s;
		findarea area=new findarea();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle");
		l=s1.nextDouble();
		b=s1.nextDouble();
		area.rectangle(l, b);
		
		System.out.println("Enter base and height of triangle");
		b=s1.nextDouble();
		h=s1.nextDouble();
		area.triangle(b, h);
		
		System.out.println("Enter side of square");
		s=s1.nextDouble();
		area.square(s);
		
		System.out.println("Enter radius of circle");
		r=s1.nextDouble();
		area.square(r);
		
		

	}

}
