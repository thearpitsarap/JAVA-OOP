package Shapes.Rectangle;

import MainShape.Shape;

public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	public Rectangle() {}
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	@Override
	public double calculateArea() {
		return 2 * (length + width);
	}
	
	@Override
	public double calculatePerimeter() {
		return length * width;
	}
}
