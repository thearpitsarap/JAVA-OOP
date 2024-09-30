package Shapes.Circle;

import MainShape.Shape;

public class Circle extends Shape{
	
	private double redius;
	private final float PI = 3.14F;
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.redius = r;
	}
	
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