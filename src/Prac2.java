import java.io.*;

//KOPO06 김우현
//파일 읽고 쓰기 실습2
public class Prac2 {
	//실습1과 동일한 구조지만 method로 구분을 하였다.
	public static void FileWrite() throws IOException {
		//파일을 쓰기 위해서 파일을 쓸 경로를 먼저 설정한다. 
		//FileWriter, FileReader를 쓰기 위해서 import를 해준다.
		File k6_f = new File("D:\\test\\test.txt");	//지정된 경로에 파일을 만든다.
		FileWriter k6_fw = new FileWriter(k6_f); //파일을 쓰기 위해서 해당 경로를 파라미터로 넣은 객체 생성
		//test.txt 파일에 쓸 글들을 아래에 써준다.
		k6_fw.write("안녕 파일\n");	//개행을 하기 위해서 \n을 해준다.
		k6_fw.write("Hello 헬로 \n");
		
		k6_fw.close();	//flush()안하고 close()하는 이유: filewriter는 스트림을 이용하여 파일 내용을 읽음.
		//이때 close()를 호출하여 스트림을 닫으면 그 스트림을 다시 이용하여 쓰는 것이 불가능하다.
		//작업이 끝나면 close()를 호출하여 스트림을 닫아 종료된 작업에 대한 메모리를 확보하여야 한다.
	}
	
	public static void FileRead() throws IOException {
		// 파일을 쓰기 위해서 파일을 쓸 경로를 먼저 설정한다.
		// FileWriter, FileReader를 쓰기 위해서 import를 해준다.
		File k6_f = new File("D:\\test\\test.txt"); // 지정된 경로에 파일을 만든다.
		BufferedReader k6_br = new BufferedReader(new FileReader(k6_f)); 
		//파일을 읽기 위해 bufferedReader를 사용한다.
		String k6_readtxt;	//읽을 내용들을 담을 String 변수를 선언해준다.
		
		while((k6_readtxt = k6_br.readLine())!=null) {	//while문을 돌면서 한줄씩 읽으면서 더이상읽을게 없을 때까지 읽는다.
			System.out.printf("%s\n",k6_readtxt);	//한줄씩 출력을 진행한다.
		}
		k6_br.close();	//작업이 끝나면 스트림을 닫도록 한다.
	}
	//메인함수에서는 위에 정의한 메서드를 순서대로 실행하도록 하였으며, 예외처리는 던져서 나중에 처리하도록 하였다.
	public static void main(String[] args) throws IOException {
		FileWrite();
		FileRead();

	}

}
