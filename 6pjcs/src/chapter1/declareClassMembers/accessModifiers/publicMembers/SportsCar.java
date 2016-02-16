package chapter1.declareClassMembers.accessModifiers.publicMembers;

public class SportsCar {

	void goFast() {
		System.out.println("Going fast like a sports car does!");
	}

	void doStuff() {
		//Invoking a declared public method from this class
		goFast();
	}

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.doStuff();
	}

}
