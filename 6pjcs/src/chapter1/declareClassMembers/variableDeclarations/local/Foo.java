package chapter1.declareClassMembers.variableDeclarations.local;

public class Foo {
	int size = 27;

	public void setSize(int size) {
		size = size; // ??? which size equals which size??
	}

	public void setSize2(int size) {
		this.size = size; // this.size means the current object's instance
							// variable, size. The size on the right is the
							// parameter
	}

	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.println("Size is " + f.size);
		f.setSize(17);
		System.out.println("Size is " + f.size);
		f.setSize2(17);
		System.out.println("Size is " + f.size);

	}

}
