package chapter1.declareClassMembers.protectedAndDefaultMembers.A;

public class Convertible1 extends SportsCar1 {

	void doThings() {
		SportsCar1 sc = new SportsCar1();
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
