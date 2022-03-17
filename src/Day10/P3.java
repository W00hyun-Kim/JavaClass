package Day10;
import java.util.*;

public class P3 {

	public static void main(String[] args) {
		Thread thread1 = new MultiThreadTest(1);
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MultiThreadTest(2);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
	}

}

class MultiThreadTest extends Thread {
	public MultiThreadTest(int i) {
		this.setName("thread" + i);
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Thread : "+this.getName());
		int cnt = 0;
		while(true) {
			System.out.println(this.getName()+" : " +cnt++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
