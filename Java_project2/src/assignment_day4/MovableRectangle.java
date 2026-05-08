package assignment_day4;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        // Ensure same speed
        if (topLeft.xSpeed != bottomRight.xSpeed || 
            topLeft.ySpeed != bottomRight.ySpeed) {
            throw new IllegalArgumentException("Points must have same speed");
        }

        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return String.format("Rectangle(topLeft=%s, bottomRight=%s)", topLeft, bottomRight);
    }

}
