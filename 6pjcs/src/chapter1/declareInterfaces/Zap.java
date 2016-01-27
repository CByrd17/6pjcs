package chapter1.declareInterfaces;

public class Zap implements Foo {

	@Override
	public void go() {
		// Cannot do! BAR is final due to being in the interface!
		// BAR = 27;
	}

}
