package btoop1_2;

public class Rectangle {
	float length;
	float width;
	
	public Rectangle() {
		length = 1.0f; 
		width = 1.0f;
	}
	
	public Rectangle(float a, float b) {
		length = a;
		width = b;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float a) {
		length = a;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float b) {
		width = b;
	}
	
	public double getArea() {
		return this.length*width; 
	}
	
	public double getPerimeter() {
		return this.length+width*2;
	}
	public String toString() {
		return "Rectangle[length = " + length + "]" + ",width =" + width; 
	}
}
