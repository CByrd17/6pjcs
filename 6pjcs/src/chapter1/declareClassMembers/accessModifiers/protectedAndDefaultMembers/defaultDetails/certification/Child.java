package chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.defaultDetails.certification;

public class Child extends Parent {

	public void testIt() {
		System.out.println("Variable x is " + x); // No problem
	}
	
	public static void main(String[] args) {
		Child sc = new Child();
		sc.testIt();
	}

}
