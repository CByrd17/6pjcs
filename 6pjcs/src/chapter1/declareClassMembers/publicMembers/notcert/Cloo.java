package chapter1.declareClassMembers.publicMembers.notcert; //Not the package Roo is in

import chapter1.declareClassMembers.publicMembers.cert.Roo;

public class Cloo extends Roo {

	public void testCloo() {
		System.out.println(doRooThings());
	}

	public static void main(String[] args) {
		Cloo c = new Cloo();
		c.testCloo();
	}

}
