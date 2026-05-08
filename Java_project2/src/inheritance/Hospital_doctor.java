package inheritance;
class Hospital{
	String hospitalName = "Rampurhat Hospital";
	String location = "Rampurhat";
	void hospitalDetails() {
		System.out.println("Hospital Name: "+hospitalName);
		System.out.println("Location: "+location);
	}
}
class doctor extends Hospital{
	String doctorName = "Dr. Malay Halder";
	String specialization = "Skin Specialist";
	void doctorDetails() {
		System.out.println("Doctor Name: "+doctorName);
		System.out.println("Specialization: "+specialization);
	}
	
}

public class Hospital_doctor {

	public static void main(String[] args) {
		doctor d = new doctor();
		d.hospitalDetails();
		d.doctorDetails();

	}

}
