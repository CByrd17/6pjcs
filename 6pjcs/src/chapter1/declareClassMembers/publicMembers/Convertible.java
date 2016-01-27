package chapter1.declareClassMembers.publicMembers;

public class Convertible extends SportsCar {

	void doThings() {
		SportsCar sc = new SportsCar();
		// Invoking a public method using a reference of the class
		sc.goFast();
	}

	void doMore() {
		// Invoking an inherited method which is public
		goFast();
	}

	public static void main(String[] args) {
		Convertible c = new Convertible();
		c.doThings();
		c.doMore();
	}

}
