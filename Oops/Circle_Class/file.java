/*
Steps
Type of the properties
Methods what should be the parameter and the type of the parameter
and return type and type of the return type
*/

//For every class java will create a sperate file
//If one file has more class every class will be created by a new class by java



class Circle {
	public double radius;
	public double area() {
		return Math.PI * radius * radius;
	}
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	public double circumference() {
		return perimeter();
	}
};


public class file {
	public static void main(String args[]) {
		Circle obj = new Circle();

		obj.radius = 7;

		System.out.println(obj.area());
		System.out.println(obj.perimeter());
		System.out.println(obj.circumference());
	}
}