package chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.B;

import chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.A.Convertible2;
import chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.A.SportsCar2;

public class Driver2 {

	public static void main(String[] args) {
		SportsCar2 sc2 = new SportsCar2();
		// Can't access a default method via a reference to the class where
		// defined
		// sc2.goFast();
		Convertible2 c2 = new Convertible2();
		// Can't access a default method via a reference to a subclass of the
		// class where defined
		// c2.goFast();
	}

}
