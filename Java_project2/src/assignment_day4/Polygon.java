package assignment_day4;
public interface Polygon {
    double getArea();
    
    default double getPerimeter(int[] sides) {
        double perimeter = 0;
        if (sides != null) {
            for (int side : sides) {
                perimeter += side;
            }
        }
        return perimeter;
    }
    
    static String shapeInfo() {
        return "Polygon: A shape with straight sides";
    }
}


