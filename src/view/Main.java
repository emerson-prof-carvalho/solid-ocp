package view;

import model.AreaCalculator;
import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;
import model.Triangle;

public class Main {

	public static void main(String[] args) {
		Shape rect = new Rectangle(5.0, 10.0);
		Shape circle = new Circle(8.5);
		Shape sqre = new Square(12.0);
		Shape tri = new Triangle(10, 5);
		
		AreaCalculator calculator = new AreaCalculator();
		
		calculator.calculateArea(rect);
		calculator.calculateArea(circle);
		calculator.calculateArea(sqre);
		calculator.calculateArea(tri);
		
		for (String shape : calculator.getAreas())
			System.out.println(shape);
	}
}
