package Day10;
import java.io.*;
import java.util.*;

public class A4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> seongsan = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\trafficvolume.csv"));
			String line;
			while((line=br.readLine())!=null) {
				String[] arr =(line.split(" "));
				for (int i = 0; i < arr.length; i++) {
					list.add(arr[i]);
				}
				System.out.println(list);
				
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).contains("성산로")) {
						seongsan.add(list.get(i));
					}
				}
				
				System.out.println(seongsan);
				
//				System.out.println(Arrays.toString(arr));
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
