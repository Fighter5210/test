package thread;

public class Run {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyObject object = new MyObject();
		// 线程A与线程B 持有的是同一个对象:object
		Thread a = new Thread(new ThreadA(object));
		Thread b = new Thread(new ThreadB(object));
		a.start();
		b.start();
	}
}