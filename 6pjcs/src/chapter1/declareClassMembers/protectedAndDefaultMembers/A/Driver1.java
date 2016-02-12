package chapter1.declareClassMembers.protectedAndDefaultMembers.A;

public class Driver1 {

	public static void main(String[] args) {
		SportsCar1 sc1 = new SportsCar1();
		// Can access a default method via a reference to the class where
		// defined
		sc1.goFast();
		Convertible1 c1 = new Convertible1();
		// Can access a default method via a reference to a subclass of the
		// class where defined
		c1.goFast();
	}

}
