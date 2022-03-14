package Day7;
import java.util.Arrays;

public class P5 {
	public static String table[][] = {{"Jeong", "70", "80", "100"},
									{"Pyo", "60", "70", "86"},
									{"Choi", "54", "100", "82"},
									{"Mike", "87", "95","79"}};
	public static void main(String[] args) {
		perPersonScore();
		perSubjectScore();		
	}	
	
	public static void perPersonScore() {
		int [] sumPerson = new int [4];
		int [] maxPerson = new int [4];
		int [] minPerson = new int [4];
		for (int i = 0; i < table.length; i++) {
			int max = 0;
			int min = 100;
			int sum = 0;
			for (int j = 1; j < table[i].length; j++) {
				int score = Integer.parseInt(table[i][j]);
				sum = sum + score;
				sumPerson[i]=sum;

				if(score<min) {
					min = score;
				}				
				if(score>max) {
					max = score;
				}
			}			
			maxPerson[i]=max;
			minPerson[i]=min;
		}
		for (int i = 0; i < table.length; i++) {
			System.out.printf("[%s] sum: %d, average: %d, minimum: %d, maximum: %d",
								table[i][0],sumPerson[i], sumPerson[i] / 4, minPerson[i], maxPerson[i]);
			System.out.println();
		}
	}
	
	public static void perSubjectScore() {
		int korean[] = new int[4];
		int english[] = new int[4];
		int math[] = new int[4];
		
		for (int i = 0; i < math.length; i++) {
			korean[i]=Integer.parseInt(table[i][1]);
			english[i]=Integer.parseInt(table[i][2]);
			math[i]=Integer.parseInt(table[i][3]);
		}
		//낮은 순서로 정렬
		Arrays.sort(korean);
		Arrays.sort(english);
		Arrays.sort(math);
		
		int sum1 = 0;
		for (int i = 0; i < korean.length; i++) {
			sum1 = sum1 + korean[i];
		}
		int korSum = sum1;
		
		int sum2 = 0;
		for (int i = 0; i < english.length; i++) {
			sum2 = sum2 + english[i];
		}
		int engSum = sum2;
		
		int sum3 = 0;
		for (int i = 0; i < math.length; i++) {
			sum3 = sum3 + math[i];
		}
		int mathSum = sum3;
		
		System.out.println();
		System.out.printf("[Korean] Sum: %d, Average: %d, minimum: %d, maximum: %d\n",
							korSum, korSum/4, korean[0],korean[3]);
		System.out.printf("[English] Sum: %d, Average: %d, minimum: %d, maximum: %d\n",
				engSum, engSum/4, english[0],english[3]);
		System.out.printf("[Math] Sum: %d, Average: %d, minimum: %d, maximum: %d\n",
				mathSum, mathSum/4, math[0],math[3]);						
	}	
}
