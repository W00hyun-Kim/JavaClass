package Day6;
import java.util.Scanner;
 
public class A1 {
	public static int num2;
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		Course course = new Course();
		UserInterface ui = new UserInterface();
				
		while(true) {
			ui.printing1();
			int num1 = sc.nextInt();
			System.out.println();
			
			if(num1==1) {
				ui.printing2();
				num2 = sc.nextInt();
				if(num2==0) {
					System.out.println();
					continue;
				} else {
					System.out.printf("\"%s\"is registered\n",course.getCourse(num2));					
				}
				System.out.println();		
				
			} else if(num1==2) {
				System.out.println("?–¶My Course");
				System.out.printf("%d. %s\n",num2,course.getCourse(num2));
				System.out.println("- End -");
				System.out.println();
			}			
		}
	}
}
 
class Course {			
	public String getCourse(int num) {
		String tmp ="";
		if(num==1) {
			tmp = "Korean";
		} else if(num==2) {
			tmp = "Math";
		} else if(num==3) {
			tmp = "English";
		} else if(num==4) {
			tmp = "Social Studies";
		} else if(num==5) {
			tmp = "Science";
		} else if(num==0) {
			tmp="";
		} else {
			tmp="Try another number.";
		}
		return tmp;
	}	
}
 
class UserInterface {
	public void printing1() {
		System.out.println("?–¶Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		System.out.print("->");
	}	
	public void printing2() {
		System.out.println("?–¶Course List");
		System.out.println("1. Korean");
		System.out.println("2. Math");
		System.out.println("3. English");
		System.out.println("4. Social Studies");
		System.out.println("5. Science");
		System.out.println("0. Back to Main");
		System.out.print("->");
	}
}