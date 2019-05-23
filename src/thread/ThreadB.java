package thread;

public class ThreadB implements Runnable {

	private MyObject object;

	public ThreadB(MyObject obj) {
		this.object = obj;
	}

	@Override
	public void run() {
		object.methodB();
	}
}