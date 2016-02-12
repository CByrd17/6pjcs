package chapter1.declareClassMembers.protectedAndDefaultMembers.B;

import chapter1.declareClassMembers.protectedAndDefaultMembers.A.SportsCar4;

public class Convertible4 extends SportsCar4 {

	void doThings() {
		SportsCar4 sc = new SportsCar4();
		// No access to protected method, different package via a Reference to
		// the class where declared
		// sc.goFast();
	}

	void doMore() {
		// Access to protected method, different package via Inheritance
		goFast();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
