package chapter1.declareClassMembers.constructorDeclarations;

public class Foo2 {

	// legal constructors
	Foo2() {
		System.out.println("No arguments");
	}

	private Foo2(byte b) {
	}

	Foo2(int x) {
		System.out.println("Just one int");
	}

	Foo2(int x, int... y) {
	}

	Foo2(int... y) {
		System.out.println("Zero or more ints");
	}

	// illegal constructors
	void Foo2() {
	} // it's a method, not a constructor

	// Foo() {} // not a method or a constructor
	//
	// Foo2(short s); // looks like an abstract method
	//
	// static Foo2(float f) {
	// } // can't be static
	//
	// final Foo2(long x) {
	// } // can't be final
	//
	// abstract Foo2(char c) {} // can't be abstract
	//
	// Foo2(int...args x, int t) {} // bad var-arg syntax

	static public void main(String... args) {
		Foo2 f21 = new Foo2(1);
		Foo2 f22 = new Foo2(new int[] { 2, 3 });
		Foo2 f20 = new Foo2();
		Foo2 f201 = new Foo2(new int[] {});

	}

}
