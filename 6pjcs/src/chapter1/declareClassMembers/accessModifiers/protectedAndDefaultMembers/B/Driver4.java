package chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.B;

import chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.A.SportsCar4;

public class Driver4 {

	public static void main(String[] args) {
		SportsCar4 sc4 = new SportsCar4();
		// Can't access a protected method via a reference to the class where
		// defined
		// sc4.goFast();
		Convertible4 c4 = new Convertible4();
		// Can't access a protected method via a reference to a subclass of the
		// class where defined
		// c4.goFast();
	}

}
