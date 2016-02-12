package chapter1.declareClassMembers.protectedAndDefaultMembers.B;

import chapter1.declareClassMembers.protectedAndDefaultMembers.A.SportsCar3;

public class Convertible3 extends SportsCar3 {

	void doThings() {
		SportsCar3 sc = new SportsCar3();
		// No access to default method, different package via a Reference to the
		// class where declared
		// sc.goFast();
	}

	void doMore() {
		// No access to default method, different package via Inheritance
		// goFast();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
