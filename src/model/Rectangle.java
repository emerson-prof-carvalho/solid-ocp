package model;

public class Rectangle implements Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
    public Double calculateArea() {
        return width * height;
    }
	
	@Override
	public String format() {
		return String.format("Retângulo de largura: %.2f e altura: %.2f", width, height);
	}
}
