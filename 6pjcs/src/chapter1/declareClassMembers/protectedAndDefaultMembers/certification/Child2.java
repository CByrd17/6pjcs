package chapter1.declareClassMembers.protectedAndDefaultMembers.certification;

public class Child2 extends Parent2 {

	public void testIt() {
		System.out.println("Variable x is " + x); // No problem
	}
	
	public static void main(String[] args) {
		Child2 sc = new Child2();
		sc.testIt();
	}

}
