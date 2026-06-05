package inheritance;
class Grandparent
{
	void openland()
	{
		System.out.println("Openland for commercial use");
	}
}
class Parent extends Grandparent
{
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("BAleno Petrol car");
	}
}
class Child extends Parent
{
	void bike()
	{
		System.out.println("Pulsar");
	}
}
public class Multilevel_In {
	
 
	public static void main(String[] args) {
		Child mohan=new Child();
		mohan.flat();//parent
		mohan.car();// parent
		mohan.bike();// self
		mohan.openland();// grandparent
		
		Parent soham=new Parent();
		soham.flat();
		soham.car();
		//soham.bike();
		
	}
 
}