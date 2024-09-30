package Shapes.Circle;

import MainShape.Shape;
import MyInterface.Drawable;

public class Circle extends Shape implements Drawable{
	
	private double redius;
	private final float PI = 3.14F;
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.redius = r;
	}
	
	@Override
	public void draw() {
		System.out.println("No Need to Draw Real Circle");
	}
	
	@Override
	public double calculateArea() {
		return PI * (redius * redius);
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * PI * redius;
	}
}