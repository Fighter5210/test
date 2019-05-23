package thread;

public class ThreadA implements Runnable {

	private MyObject object;

	public ThreadA(MyObject obj) {
		this.object = obj;
	}

	@Override
	public void run() {

		object.methodA();

	}
}