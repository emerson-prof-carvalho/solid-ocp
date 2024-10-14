package model;

public class Square implements Shape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public Double calculateArea() {
		return side * side;
	}
	
	@Override
	public String format() {
		return String.format("Quadrado de lado: %.2f", side);
	}
}
