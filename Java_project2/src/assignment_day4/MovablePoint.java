package assignment_day4;

public class MovablePoint implements Movable{
	 int x, y;
	 int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y,int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public void moveUp() {
		y -= ySpeed;
	}
	public void moveDown() {
		y += ySpeed;
	}
	public void moveLeft() {
		x -= xSpeed;
	}
	public void moveRight() {
		x += xSpeed;
	}
	public int getX() { 
    	return x; 
    	}
    public int getY() {
    	return y; 
    	}
    public int getXSpeed() {
    	return xSpeed;
    	}
    public int getYSpeed() {
    	return ySpeed; 
    	}
    public String toString() {
        return String.format("Point(%d, %d) speed(%d, %d)", x, y, xSpeed, ySpeed);
    }

}
