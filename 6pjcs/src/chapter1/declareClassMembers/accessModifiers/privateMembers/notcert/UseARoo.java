package chapter1.declareClassMembers.accessModifiers.privateMembers.notcert;

import chapter1.declareClassMembers.accessModifiers.privateMembers.cert.Roo;

public class UseARoo {
	
	public void testIt() {
		Roo r = new Roo(); //So far so good; class Roo is public
		//Does not work, method is private!
		//System.out.println(r.doRooThings());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
