package chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.defaultDetails.other;

import chapter1.declareClassMembers.accessModifiers.protectedAndDefaultMembers.defaultDetails.certification.Parent;

public class Child extends Parent {

	public void testIt() {

		// No good x is default in the parent, so it is not inherited outside
		// the package
		//System.out.println("x is " + x); // No problem; Child
											// inherits x
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.testIt();

	}

}
