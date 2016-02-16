package chapter1.declareClassMembers.accessModifiers.privateMembers.cert; //Cloo and Roo are in the same package

class Cloo extends Roo { // Still OK, superclass Roo is public (default would work too)

	public void testCloo() {
		// Does not work! doRooThings is not inherited, it's private!
		// System.out.println(doRooThings());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
