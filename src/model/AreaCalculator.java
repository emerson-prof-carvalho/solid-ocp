package model;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {
	
	private List<String> areas = new ArrayList<String>();
	
	// Não precisamos mais modificar este método 
	// para adicionar novas formas geométricas
	public double calculateArea(Shape shape) {
		
		double area = shape.calculateArea();
		
		areas.add(String.format("%s = %.2f", shape.format(), area));
		
		return area;
	}
	
	public List<String> getAreas() {
		return new ArrayList<String>(areas);
	}
}
