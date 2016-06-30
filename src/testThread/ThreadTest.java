package testThread;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// runnable thread
		System.out.println("���߳�ID:" + Thread.currentThread().getId());
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		
		for (int i = 0; i < 3; i++) {
			MyThread thread1 = new MyThread();
			thread1.start();
			// thread1.run();
		}



	}

}

class MyThread extends Thread {
	private static int num = 0;

	public MyThread() {
		num++;
	}

	public void run() {
		System.out.println("��ǰ�������ǵ�" + num + "���߳�"
				+ Thread.currentThread().getId());
	}

}

class MyRunnable implements Runnable {
	public MyRunnable() {

	}

	public void run() {
		System.out.println("��ǰ���������߳�:" + Thread.currentThread().getId());
	}
}