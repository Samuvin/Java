class Student {
	private double roll; // read only
	public double get() {
		return roll;
	}
}

//shared class used by some other class
class producer {
	private int sharedData;
	public void set(int data) {
		sharedData = data;
	}
}


public class file {
	public static void main(String args[]) {
		Student obj = new Student();
		System.out.println(obj.get());
	}
}