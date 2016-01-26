/**
 * 
 */
package chapter1.sunJavaCodeConventions;

/**
 * @author cbyrd17
 *
 */
public class Wombat implements Runnable {

	private int i;

	/**
	 * 
	 */
	public Wombat() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public synchronized void run() {
		if (i % 5 != 0) {
			i++;
		}
		for (int x = 0; x < 5; x++, i++) {
			if (x > 1) {
				Thread.yield();
			}
			System.out.print(i + " ");
		}
	}
	
	public static void main(String...args) {
		Wombat n = new Wombat();
		for(int x =100; x>0; --x) {
			new Thread(n).start();
		}
	}

}
