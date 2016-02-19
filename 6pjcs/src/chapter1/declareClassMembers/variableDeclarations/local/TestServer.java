package chapter1.declareClassMembers.variableDeclarations.local;

public class TestServer {

	int count = 9; // Declare an instance variable named count

	public void logIn() {
		int count = 10; // Declare a local variable named count
		System.out.println("local variable count is " + count);
	}

	public void count() {
		System.out.println("instance variable count is " + count);
	}

	public void doSomething(int i) {
		// count = i; // Won't comple! Can't access count outside method logIn()
	}

	public static void main(String... args) {
		new TestServer().logIn();
		new TestServer().count();
	}

}
