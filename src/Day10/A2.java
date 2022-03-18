package Day10;
import java.util.*;

public class A2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		MultiThread[] runners = new MultiThread[n];
		
		for (int i = 0; i < n; i++) {
			String name = "Runner"+(i+1);
			runners[i]= new MultiThread(name);
		}
		for (int i = 0; i < n; i++) {
			runners[i].start();
		}

	}
}

class MultiThread extends Thread {
	String name;
	int distance;
	boolean isEnd = false;
	static int rank = 0;
	
	MultiThread(String name) {
		setName(name);
		this.name = getName();
		System.out.println(getName());
	}

	public void run() {
		Random ran = new Random();
		for (int i = 0; i < 999; i++) {
			this.runGame();
			if(this.isEnd) {
				break;
			}
//			int sleepTime = ran.nextInt(10)*1000;
			int sleepTime = 1000;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void runGame() {
		if(!this.isEnd) {
			this.distance = this.distance +(int)Math.floor(Math.random()*10);
			System.out.println(this.name+" : "+this.distance+"m");
			this.checkEnd();
		}
	}
	
	public void checkEnd() {
		if(distance>=50) {
			isEnd = true;
			MultiThread.rank++;
			System.out.println(this.name + " is goal. Rank"+MultiThread.rank);
		}
	}
	
}
