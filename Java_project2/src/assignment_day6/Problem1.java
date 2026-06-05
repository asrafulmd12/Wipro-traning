package assignment_day6;

public class Problem1 {
	static void changeValue(int x) {
		System.out.println("Inside method (before change): "+x);
		x = 45;
		System.out.println("Inside method (After change): "+x);
	}
		
	public static void main(String[] args) {
		int a = 15;
		System.out.println("Before method call: "+a);
		changeValue(a);
		System.out.println("After method call: "+a);
		
		

	}

}
