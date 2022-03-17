package Day10;

import java.text.SimpleDateFormat;
import java.util.*;

public class A1 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);		
		System.out.println(dateAndTime);
		
		while(true) {			
			int input = 0;
			try {
				input = sc.nextInt();
				int setTime = input*1000;
				Thread.sleep(setTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			time = new Date();
			cal.add(Calendar.SECOND, input);
			dateAndTime = format.format(cal.getTime());
			System.out.print("time is over("+dateAndTime+")\n");
		}	
	}
}
