package thread;

public class MyObject {

	synchronized public void methodA() {
		System.out.println("A执行前");

		for (int i = 0; i < 1000000000; i++) {
			for (int j = 0; j < 1000000000; j++) {

			}
		}
		System.out.println("A执行");
	}

	synchronized public void methodB() {
		System.out.println("B执行");
	}
}
