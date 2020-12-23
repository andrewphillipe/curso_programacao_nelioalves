package entities;


public class Rectangle {
	
	public double wigth;
	public double height;
	
	public double area() {
		return wigth * height;
		
	}
	public double perimeter() {
		return (2 * wigth) + (2* height);
		
	}
	
	public double diagonal() {
		return Math.sqrt(wigth * wigth + height * height);
	
			
	}
	
	public String toString() {
		return "Area = " + area()
				+ "\nPerimeter = " + perimeter()
				+ "\nDiagonal: " + String.format("%.0f", diagonal());
		
	}
}
