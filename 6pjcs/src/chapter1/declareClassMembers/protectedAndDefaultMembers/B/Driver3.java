package chapter1.declareClassMembers.protectedAndDefaultMembers.B;

import chapter1.declareClassMembers.protectedAndDefaultMembers.B.Convertible3;
import chapter1.declareClassMembers.protectedAndDefaultMembers.A.SportsCar3;

public class Driver3 {

	public static void main(String[] args) {
		SportsCar3 sc3 = new SportsCar3();
		// Can't access a default method via a reference to the class where
		// defined
		// sc3.goFast();
		Convertible3 c3 = new Convertible3();
		// Can't access a default method via a reference to a subclass of the
		// class where defined
		// c3.goFast();
	}

}
