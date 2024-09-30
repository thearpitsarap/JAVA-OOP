package Shapes.Rectangle;

import MainShape.Shape;
import MyInterface.Drawable;

public class Rectangle extends Shape implements Drawable{
	
	private double length;
	private double width;
	
	public Rectangle() {}
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	@Override
	public void draw() {
		System.out.println("No ned to draw real Rectangle");
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
