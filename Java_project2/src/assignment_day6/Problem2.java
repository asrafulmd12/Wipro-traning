package assignment_day6;

class Box {
    int length;
}

public class Problem2 {
    void modifyBox(Box b) {
        b.length = b.length + 10;  // modifying object data
        System.out.println("Inside method: " + b.length);
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        
        Box box = new Box();
        box.length = 5;
        
        System.out.println("Before method call: " + box.length);
        
        obj.modifyBox(box);
        
        System.out.println("After method call: " + box.length);
    }
}
