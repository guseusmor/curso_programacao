package oo_Exercices;

public class Rectangle {

	public double width;
	public double height;
	
	
	
	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (this.width + this.height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}
