package chapter1.declareClassMembers.accessModifiers.privateMembers;

class SportsCar {
	private void goFast() {
		System.out.println("I'm going fast like a sports car does!");
	}
	
	void doStuff() {
		//Invoking a private method declared in the same class
		goFast();
	}

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.doStuff();
	}

}
