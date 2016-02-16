package chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.A;

public class Convertible2 extends SportsCar2 {

	void doThings() {
		SportsCar2 sc = new SportsCar2();
		// Access to default method, same package via a Reference to the class where declared
		sc.goFast();
	}

	void doMore() {
		// Access to default method, same package via Inheritance
		goFast();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
