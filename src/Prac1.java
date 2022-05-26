import java.io.*;
//KOPO06 김우현
//파일 읽고 쓰기 실습
public class Prac1 {

	public static void main(String[] args) {
		//예외처리를 위해서 try catch문으로 감싼다. 오류가 발생할 시 catch문 아래를 실행한다.
		try {
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
			
			//fileread를 하기 위하여 지정된 경로를 파라미터 값으로 받는 filereader객체를 생성한다.
			FileReader k6_fr = new FileReader(k6_f);
			
			int k6_n = -1; 
			char [] k6_ch;	//읽어올 character 배열을 하나 생성해준다.
			
			//무한 루프를 돌면서 파일의 character값을 읽는다. 
			while(true) {
				k6_ch = new char[100];	//배열의 크기를 100으로 지정해준다.
				k6_n = k6_fr.read(k6_ch);	//지정해준 배열에 들어간 character값을 읽는다.
				
				if(k6_n==-1) break;	//인덱스 값이 -1이 들어갈 수 없으니 그 경우 break를 해준다.
				
				//for문을 돌면서 각 character들을 읽어온다.
				for (int k6_i = 0; k6_i < k6_n; k6_i++) {
					System.out.printf("%c", k6_ch[k6_i]);
				}
			}
			//작업이 끝나면 close()를 사용하여 메모리 공간을 확보해준다.
			k6_fr.close();
			System.out.printf("\n FILE READ END");	//모든 작업이 끝나면 해당 문자열을 콘솔창에 출력
		} catch (Exception k6_e) {	//예외처리: 해당 exception을 만나게 되면 아래와 같이 에러를 출력한다.
			System.out.printf("나 에러[%s]\n", k6_e);
		}

	}

}
