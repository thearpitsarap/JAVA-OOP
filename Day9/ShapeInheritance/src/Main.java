import java.util.Scanner;

import MainShape.Shape;
import Shapes.Circle.Circle;
import Shapes.Rectangle.Rectangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape shape = null;
		
		int choice = 0;
		do {
			System.out.println("Enter your Choice ");
			System.out.println("1 - Calculate Area of Rectangle ");
			System.out.println("2- Calculate Perimeter of Rectangle ");
			System.out.println("3 - Calculate Area of Circle ");
			System.out.println("4 - Calculate Perimeter of Circle ");
			System.out.println("5 - Call the draw method of  circle with specific circle reference");
			
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:{
					
					System.out.println("Enter length ");
					double l = sc.nextDouble();
					
					System.out.println("Enter breadth ");
					double b = sc.nextDouble();
					
					shape = new Rectangle(l,b);
					System.out.println("Area of Rectangle is " + shape.calculateArea());
					
				}break;
				case 2:{
					
					System.out.println("Enter length ");
					double l = sc.nextDouble();
					
					System.out.println("Enter breadth ");
					double b = sc.nextDouble();
					
					shape = new Rectangle(l,b);
					System.out.println("Perimeter of Rectangle is " + shape.calculatePerimeter());
					
				}break;
				case 3:{
					
					System.out.println("Enter Redius ");
					double r = sc.nextDouble();
					
					shape = new Circle(r);
					System.out.println("Area of Circle is " + shape.calculateArea());
					
				}break;
				case 4:{
					
					System.out.println("Enter Redius ");
					double r = sc.nextDouble();
					
					shape = new Circle(r);
					System.out.println("Perimeter of Circle is " + shape.calculatePerimeter());
					
				}break;
				case 5:{
					Shape shape1 = new Circle();
					System.out.println("Enter Redius ");
					double r = sc.nextDouble();
					
					if(shape1 instanceof Circle) {
						Circle c = (Circle) shape1;
						c.draw();
					}
					
				}break;
			}
		} while (choice != 0);
	}

}
