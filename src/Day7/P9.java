package Day7;

public class P9 {

	public static void main(String[] args) {
		String words = "kim,lee,park";
		String[] names = words.split(",");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
