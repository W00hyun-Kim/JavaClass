package Day10;
import java.text.SimpleDateFormat;
import java.util.*;

public class P1 {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		
		System.out.println(dateAndTime);
		System.out.println("Start");
		
		while(true) {
			for (int i = 0; i < 100; i++) {
				System.out.printf("¢½%d¢½",i+1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
//		time = new Date();
//		dateAndTime = format.format(time);
//		
//		System.out.println(dateAndTime);
//		System.out.println("end");

	}

}
