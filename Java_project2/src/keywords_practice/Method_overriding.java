package keywords_practice;
//Polymorphism- 1. compile time polymorphism -Method overloading-
//                 1.same method name but different arguments
//                 2. method overloading done in same class
//              2. Runtime polymorphism- Method overriding
//                 same method name and same arguments
//                 2. method overriding done in different class (Is - a- relationship(inheritance))
 
abstract class Vehicle
{
	abstract void nooftyres();
	
	void type()
	{
		System.out.println("Petrol/Diesel/electric");
	}
}
class Scooter extends Vehicle
{
	void nooftyres()
	{
		System.out.println("no of tyre for scooter=2");
	}
	
}
class Car extends Vehicle
{
	void nooftyres()
	{
		System.out.println("no of tyre for car=4");
	}
	
}
public class Method_overriding {
 
	public static void main(String[] args) {
		Scooter sc=new Scooter();
		sc.nooftyres();
		sc.type();
		System.out.println("*********************");
		Car c=new Car();
		c.nooftyres();
		c.type();
		//Vehicle v=new Vehicle();
		
 
	}
 
}
 
 