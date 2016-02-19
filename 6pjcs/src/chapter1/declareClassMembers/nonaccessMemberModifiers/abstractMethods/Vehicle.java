package chapter1.declareClassMembers.nonaccessMemberModifiers.abstractMethods;

public abstract class Vehicle {

	private String type;

	public abstract void goUpHill(); // Abstract method

	public String getType() { // Non-abstract method
		return type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
