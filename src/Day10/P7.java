package Day10;

public class P7 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		try {
			System.out.println(numbers[9]);
			System.out.println("1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
		
		//������ ���� �ʾƵ� finally ����
		} finally { 	
			System.out.println("finally");
		}
		
		System.out.println("finish");
	}

}
