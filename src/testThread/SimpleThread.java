package testThread;

public class SimpleThread extends Thread {
	public SimpleThread(String str) {
		super(str);
	}

	public void run() {// ��д�����run()����
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " " + getName());
			try {
//				sleep(0);
				sleep((int) (Math.random() * 1000));// �߳����ߣ��ѿ���Ȩ����ȥ
			} catch (InterruptedException e) {
			}
		}
		System.out.println("DONE! " + getName()+"\t" + currentThread().getName());
	}

	public static void main(String args[]) {
		new SimpleThread("First").start();
		new SimpleThread("Second").start();
	}
}