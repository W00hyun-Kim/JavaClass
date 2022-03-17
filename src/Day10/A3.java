package Day10;
import java.util.*;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number(0:Rock, 1:Paper, 2:Scissor)");
		while(true) {
			int input = sc.nextInt();
			int com = (int)(Math.random()*3);
			switch(input) {
				case 0 :	// Rock
					System.out.println("You : Rock");
					if(com==0) {//com:rock
						System.out.println("computer : Rock");
						System.out.println("Draw");
						
					} else if(com==1) {	//com:paper
						System.out.println("computer : paper");
						System.out.println("You lose.");
						
					} else if(com==2){	//com:scissor
						System.out.println("computer : Scissor");
						System.out.println("You won.");
					}
					break;
				case 1 :	//paper
					System.out.println("You : Paper");
					if(com==0) {	//com:rock
						System.out.println("computer : Rock");
						System.out.println("You won.");
					} else if(com==1) {	//com:paper
						System.out.println("computer : Paper");
						System.out.println("Draw");
					} else {
						System.out.println("computer : Scissor");
						System.out.println("You lose.");
					}
					break;
				case 2 :	//scissor
					System.out.println("You : Scissor");
					if(com==0) {
						System.out.println("computer : Rock");
						System.out.println("You lose.");
					} else if(com==1) {
						System.out.println("computer : Paper");
						System.out.println("You won.");
					} else {
						System.out.println("computer : Scissor");
						System.out.println("Draw.");
					}
					break;
				default : 
					System.out.println("Try another number");
			}

		}
	}	
}
