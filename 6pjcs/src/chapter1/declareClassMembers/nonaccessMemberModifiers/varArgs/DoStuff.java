package chapter1.declareClassMembers.nonaccessMemberModifiers.varArgs;

public class DoStuff {

	static void doStuff(String s, int a) {
	} // We're expecting two parameters: String and int

	void doStuff(int... x) {
	} // expects from 0 to many ints as parameters

	void doStuff2(char c, int... x) { // expects first a char, then 0 to many
										// ints
	}

	void doStuff3(Animal... animal) { // 0 to many Animals

	}

	// void doStuff4(int x...) // bad syntax
	// void doStuff5(int... x, char... y) {} // too many var-args
	// void doStuff6(String... s, byte b) {} // var-arg must be last

	public static void main(String[] args) {
		DoStuff.doStuff("a", 2); // invoking doStuff, so a & 2 are arguments
	}

}

class Animal {
}
