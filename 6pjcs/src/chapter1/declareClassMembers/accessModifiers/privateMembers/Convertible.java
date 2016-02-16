package chapter1.declareClassMembers.accessModifiers.privateMembers;

public class Convertible extends SportsCar {

	void doThings() {
		SportsCar sc = new SportsCar();
		//Cannot invoke a private method using a reference of the class
		//sc.goFast();
	}
	
	void doMore() {
		//Cannot invoke method; it is private in the superclass
		//goFast();
	}
	
}
