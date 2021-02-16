package SPL;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double area() {
		double area = width * height;
		
		return area;
	}
	
	public void draw() {
		System.out.println("(" + getX() + ", " + getY() + ") 위치에 가로 : " + 
							getWidth() + " 세로 : " + getHeight()); 
	}
}
