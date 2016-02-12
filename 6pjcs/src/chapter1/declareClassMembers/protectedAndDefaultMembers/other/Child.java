package chapter1.declareClassMembers.protectedAndDefaultMembers.other;

import chapter1.declareClassMembers.protectedAndDefaultMembers.certification.Parent;

public class Child extends Parent {

	public void testIt() {
		System.out.println("x is " + x); // No problem; Child
										 // inherits x
		Parent p = new Parent(); // Can we access x using the
								 // p reference?
		// No good, p is protected so only accessible outside the package by 
		// inheritance.
		// System.out.println("X in parent is " + p.x); // Compiler
													 // error!
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.testIt();

	}

}
