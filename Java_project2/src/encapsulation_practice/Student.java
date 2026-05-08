package encapsulation_practice;
 
public class Student {
	protected String name;
	public int rollno=101;
	String getname(String name)
	{
		return name;
	}
//	Student(String name)
//	{
//		this.name=name;
//	}
	
 
	public static void main(String[] args) {
		Student st=new Student();
		BankAccount ba=new BankAccount();
		ba.deposit(2000);
		
 
	}
 
}
 
 
