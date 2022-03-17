package Day10;
import java.text.SimpleDateFormat;
import java.util.*;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);		
		System.out.println(dateAndTime);
		
		try {
			int input = sc.nextInt();
			Thread.sleep(input*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		time = new Date();
		dateAndTime = format.format(time);
		System.out.print("time is over("+dateAndTime+")");
	
	}

}
