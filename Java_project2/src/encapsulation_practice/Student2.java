package encapsulation_practice;
class Student1{
	private int id; //accessible only inside this class
	String name; //accessible within same package
	protected String college;// accessible within same packages and subclass
	public int age;// accessible from anywhere
	public void setId(int id) {  //Public setter for private variable
		this.id = id;
	}
	public int getId() {  //Public getter for private variables
		return id;
	}
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("College: "+college);
		System.out.println("Age: "+age);
	}
}

public class Student2 {

	public static void main(String[] args) {
		Student1 st = new Student1();
		st.setId(99);
		st.name = "ABC";
		st.college = "XYZ College";
		st.age = 24;
		st.display();

	}

}
