
public class ShareData {

	final static int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	static int i = 0;

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {

				try {
					synchronized (input) {
						while (i < 10) {
							System.out.println("线程1:i=" + i);
							while (i < 10 && input[i] % 2 != 1) {
								input.wait();
							}
							if (i < 10) {
								System.out.println("奇数：" + input[i]);
								i++;
								input.notifyAll();
							}
						}
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					synchronized (input) {
						while (i < 10) {
							System.out.println("线程2：i=" + i);
							while (i < 10 && input[i] % 2 != 0) {
								input.wait();
							}
							if (i < 10) {
								System.out.println("偶数：" + input[i]);
								i++;
								input.notifyAll();
							}
						}
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("完毕");

	}

}
