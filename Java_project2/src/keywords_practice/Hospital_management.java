package keywords_practice;

abstract class Hospital{
	void documents() {
		System.out.println("Your documents are submitted");
	}
	void patients() {
		System.out.println("You are on the safe place");
		
	}
	abstract void ot();
	abstract void operations();
	
}
class nurse extends Hospital{
	void ot() {
		System.out.println("You are allowed to assist");
	}
	void operations() {
		System.out.println("Operation is not your duty");
		
	}
	
}
class doctor extends Hospital{
	void ot() {
		System.out.println("You are main person here");
	}
	void operations() {
		System.out.println("You will be performing operations");
		
	}
	
}

public class Hospital_management {

	public static void main(String[] args) {
		nurse n = new nurse();
		n.documents();
		n.ot();
		System.out.println("**********************");
		doctor d = new doctor();
		d.patients();
		d.operations();

	}

}
