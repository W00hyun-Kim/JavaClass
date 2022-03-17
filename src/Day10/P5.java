package Day10;

public class P5 implements Runnable{

	public static void main(String[] args) {	
		P5 main = new P5();
		Thread thread = new Thread(main);	
		thread.start();
	}

	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < 100; i++) {
				System.out.printf(" %d ", i + 1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
