package Day6;
import java.util.Scanner;
 
public class A5 {
	public static double result;
	public static int target;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Converter converter = new Converter();
		UI ui = new UI();
		
		ui.printing();
		
		String str = sc.nextLine();
		target = sc.nextInt();
		
		String[] input = str.split(" ");
		double num1= Double.parseDouble(input[0]);
		double num2 = Double.parseDouble(input[1]);
		converter.convert(num1, num2, target);
			
	}
}
 
class UI {
	public static void printing() {
		System.out.println("# Unit");
		System.out.println("1. cm");
		System.out.println("2. m");
		System.out.println("3. mm");
		System.out.println("4. km");
		System.out.println("5. mile");
	}
}
 
class Converter {
	public static void convert(double num1, double num2, double target) {
		double result =0;
		if(num1==1) {
			if(num2==1) {
				result = target;
			}else if(num2==2) {
				result = target/100;
			} else if(num2==3) {
				result = target*10;
			} else if(num2==4) {
				result = target/100000;
			} else if(num2==5) {
				result = target * 0.0000062137;				
			} else {
				System.out.println("Try another number");
			}
			System.out.printf("%.2f",result);
		}
		
		if(num1==2) {
			if(num2==1) {
				result = target*100;
			} else if(num2==2) {
				result = target;
			} else if(num2==3) {
				result = target * 1000;
			} else if (num2 == 4) {
				result = target * 0.001;
			} else if (num2 == 5) {
				result = target * 0.000621371;
			} else {
				System.out.println("Try another number");
			}
			System.out.printf("%.2f",result);
		}
		
		if(num1==3) {
			if(num2==1) {
				result = target*0.1;
			} else if(num2==2) {
				result = target*0.001;
			} else if(num2==3) {
				result = target;
			} else if (num2 == 4) {
				result = target * 0.000001;
			} else if (num2 == 5) {
				result = target * 0.00000062;
			} else {
				System.out.println("Try another number");
			}
			System.out.printf("%.2f",result);
		}
		
		if(num1==4) {
			if(num2==1) {
				result = target*100000;
			} else if(num2==2) {
				result = target*1000;
			} else if(num2==3) {
				result = target * 1000000;
			} else if (num2 == 4) {
				result = target;
			} else if (num2 == 5) {
				result = target * 0.621371;
			} else {
				System.out.println("Try another number");
			}
			System.out.printf("%.2f",result);
		}
		
		if(num1==5) {
			if(num2==1) {
				result = target*160934;
			} else if(num2==2) {
				result = target*1609.34;
			} else if(num2==3) {
				result = target * 1609000;
			} else if (num2 == 4) {
				result = target * 1.60934;
			} else if (num2 == 5) {
				result = target;
			} else {
				System.out.println("Try another number");
			}
			System.out.printf("%.2f",result);
		}
	}
}
