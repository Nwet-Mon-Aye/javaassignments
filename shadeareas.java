package javaoop;
import java.util.Scanner;

abstract class shape{
	
	String color="red";
	boolean filled=true;
	 shape(){
		 
	 }
	shape(String color,boolean filled){
		
		this.color=color;
		this.filled=filled;
	}

	public String getColor() {
		
		return color;
	}

	public void setColor(String color) {
		
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	abstract double getArea();
	abstract double getParameter();
}

class Circle extends shape{
	double radius=1.0;
	Circle(){
		
	}
	 Circle(double radius){
		
		this.radius=radius;
	}
	Circle(double radius,String color,boolean filled){
		super(color,filled);
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double area=3.14*radius*radius;
		return area;
	}
	@Override
	double getParameter() {
		// TODO Auto-generated method stub
//		Scanner cir=new Scanner(System.in);
//		System.out.println("Enter radius: ");
//		double radius=cir.nextDouble();
		double parameter=2*3.14*radius;
		return parameter;
	}
	
}
class Rectangle extends shape{
	double width=1.0;
	double length=1.0;
	Rectangle(){
		
	}
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
		
	}
	
	Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;
		
		
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double area=width*length;
		return area;
	}
	@Override
	double getParameter() {
		// TODO Auto-generated method stub
		double parameter=2*(width+length);
		return parameter;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
}
class Square extends Rectangle{
	double side=1.0;
	Square(){
		
	}
	Square(double side){
		this.side=side;
		
	}
	Square(double side,String color,boolean filled){
		super();
		this.side=side;
		
		
	}
	public void setWidth(double side) {
		this.side=side;
	}
	public void setLength(double side) {
		this.side=side;
	}
	double getArea() {
		
		double area=side*side;
		return area;
	}
	double getParameter() {
		
		double parameter=4*side;
		return parameter;
	}
}

public class shadeareas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape sh=new Circle();
		System.out.println("Shape Information: ");
		System.out.println("Color: "+sh.getColor()+"\t"+"Boolean: "+sh.isFilled());
		Circle c=new Circle();
		//System.out.println("Area of circle "+c.getArea());
		System.out.println("Circle Information: ");
		System.out.println("Radius: "+c.radius+"\n"+"Color: "+c.color+"\n"+"Filled: "+c.filled+"\n"
				+"Area: "+c.getArea()+"\n"+"Parameter: "+c.getParameter());
		Rectangle r=new Rectangle();
		System.out.println("Rectangle Information: ");
		System.out.println("Width: "+r.width+"\n"+"Length: "+r.length+"\n"+"Color: "+r.color+"\n"
		+"Filled: "+r.filled+"\n"+"Area: "+r.getArea()+"\n"+"Parameter: "+c.getParameter());
		Square sq=new Square();
		System.out.println("Square Information: ");
		System.out.println("Width: "+r.width+"\n"+"Length: "+r.length+"\n"+"Color: "+r.color+"\n"
				+"Filled: "+r.filled+"\n"+"Area: "+sq.getArea()+"\n"+"Parameter: "+sq.getParameter());

		
	}

}
