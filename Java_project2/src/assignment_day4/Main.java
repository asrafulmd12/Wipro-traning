package assignment_day4;

public class Main {

	public static void main(String[] args) {
		//Rectangle
		Rectangle rect = new Rectangle(7,8);
		System.out.println("Rectangle Area: "+rect.getArea());
		System.out.println("Rectangle Perimeter: "+rect.getPerimeter(new int[]{3,4,6,8}));
		//Triangle
		Triangle t = new Triangle(9,8);
		System.out.println("Traingle Area: "+t.getArea());
		System.out.println("Traingle Perimeter: "+t.getPerimeter(new int[] {5,1,7,3}));
		//Static method from Interface
		System.out.println(Polygon.shapeInfo());
		


	}

}
