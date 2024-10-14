package model;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return (base * height) / 2;
    }
    
    @Override
	public String format() {
		return String.format("Triângulo de base: %.2f e altura: %.2f", base, height);
	}
}
