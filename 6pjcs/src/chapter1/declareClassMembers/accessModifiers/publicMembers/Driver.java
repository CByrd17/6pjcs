package chapter1.declareClassMembers.accessModifiers.publicMembers;

public class Driver {

	void doDriverStuff() {
		SportsCar car = new SportsCar();
		// Invoking a public method using a reference of the class
		car.goFast();

		Convertible con = new Convertible();
		// Invoking a public method using a reference of the (sub)class
		con.goFast();
	}

	public static void main(String[] args) {
		Driver d = new Driver();
		d.doDriverStuff();
	}

}
