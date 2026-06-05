package assignment_day5;
interface Math{
	int divide(int a, int b);
}
class Division implements Math{
	public int divide(int a, int b) {
		try {
			return a/b;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	
	}
}

public class Problem3 {

	public static void main(String[] args) {
		Division d = new Division();
		System.out.println(d.divide(65, 5));
		System.out.println(d.divide(22, 0));
	}

}
