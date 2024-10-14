package model;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public Double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String format() {
		return String.format("Círculo de raio: %.2f", radius);
	}
}