package chapter1.javaBeansStandards;

public class MyListener {

	public class XListener {

	}

	private int myValue;
	private boolean myStatus;
	private MyListener myListener;
	private XListener xListener;
	private String customerName;

	public void setMyValue(int v) {
		myValue = v;
	}

	public int getMyValue() {
		return myValue;
	}

	public boolean isMyStatus() {
		return myStatus;
	}

	public void addMyListener(MyListener m) {
		myListener = m;
	}

	public void removeMyListener(MyListener m) {
		myListener = null;
	}

	void setCustomerName(String s) { // INVALID must be public
		customerName = s;
	}

	public void modifyMyValue(int v) { // INVALID can't use 'modify'
		myValue = v;
	}

	public void addXListener(MyListener m) { // INVALID listener type mismatch
		//Can't do!!		
		//xListener = m;
	}

	public MyListener() {
	}

}
