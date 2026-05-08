package assignment_day4;

public class Main1 {

	public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        MovableCircle circle = new MovableCircle(5, new MovablePoint(10, 10, 2, 2));
        MovableRectangle rectangle = new MovableRectangle(new MovablePoint(0, 0, 1, 1), new MovablePoint(5, 5, 1, 1));
        System.out.println("Initial positions:");
        System.out.println(point);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println("\nAfter moving right:");
        point.moveRight();
        circle.moveRight();
        rectangle.moveRight();
        System.out.println(point);
        System.out.println(circle);
        System.out.println(rectangle);

	}

}
