package Test_package;

public class Student {
	String name;
	int rollno;
	static String schoolname="JNV";
	void insecondary(int age,int cls,String name1) {
		name = name1;
		System.out.println("Name:" + name1);
		System.out.println("School name:" + schoolname);
		System.out.println("class:" + cls);
		System.out.println("Age:" + age);
	}

	public static void main(String[] args) {
		Student std = new Student();
		std.insecondary(17, 10,"Asraful");

	}

}
