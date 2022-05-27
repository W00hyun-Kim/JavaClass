import java.io.*;
import org.json.simple.*;

//실습 : JSON 만들기
//KOPO06 김우현
public class Prac2 {
	//반복되는 코드를 줄이기 위해서 메서드 정의
	// 나연말고 나머지멤버들도 나연처럼 정보를 넣을 수 있지만 코드 길어지니까 oneRec이라는 함수를 만들어서 파라미터 값을 받아 처리
	public static JSONObject k6_oneRec(String k6_name, int k6_studentid, int k6_kor, int k6_eng, int k6_mat) {
		JSONObject k6_dataObject = new JSONObject();
		k6_dataObject.put("name", k6_name);
		k6_dataObject.put("studentid", k6_studentid);
		//Json Array 생성
		JSONArray k6_score = new JSONArray();
		k6_score.add(k6_kor);
		k6_score.add(k6_eng);
		k6_score.add(k6_mat);
		k6_dataObject.put("score", k6_score);
		
		return k6_dataObject;	
	}
	//메인 함수
	public static void main(String[] args) {
		
		//최종 완성될 JSONObject 선언(전체)
		JSONObject k6_jsonObject = new JSONObject();
		//한명 성적의 JSON 정보를 담을 Array 선언
		JSONArray k6_datasArray = new JSONArray();
		
		//한명 정보가 들어갈 JSONObject 선언 (나연의 정보 먼저 어떤 방식으로 진행되는 지 보기 위해서 나눠서 진행해보았다.)
		JSONObject k6_dataObject = new JSONObject();
		k6_dataObject.put("name", "나연");			//첫번째로 들어갈 나연 정보를 put 함수를 이용하여 넣어준다.
		k6_dataObject.put("studentid", "209901");	//나연의 학생번호를 put함수를 이용하여 넣어준다.
		//JSON Array 생성.
		JSONArray k6_score = new JSONArray();		//나연의 성적은 arr를 이용하여 넣어준다.
		k6_score.add(90);	//add 함수를 이용하여 성적을 차례로 넣어준다.(국어)
		k6_score.add(100);	//영어
		k6_score.add(95);	//수학
		k6_dataObject.put("score", k6_score);	//성적을 add 해준 후에 dataObject에 성적을 넣어준다.
		k6_datasArray.add(k6_dataObject);		//datasArray에 object에 담긴 한명의 정보를 넣어준다.
		
		//위에 정의한 함수를 이용하여 처리하기 ( 나머지 멤버들은 아래와 같이 함수를 사용하여 정보를 넣어주었다.)
		k6_datasArray.add(k6_oneRec("정연", 209902, 100, 85, 75));
		k6_datasArray.add(k6_oneRec("모모", 209903, 90, 75, 85));
		k6_datasArray.add(k6_oneRec("사나", 209904, 90, 85, 75));
		k6_datasArray.add(k6_oneRec("지효", 209905, 80, 75, 85));
		k6_datasArray.add(k6_oneRec("미나", 209906, 90, 85, 55));
		k6_datasArray.add(k6_oneRec("다연", 209907, 70, 75, 65));
		k6_datasArray.add(k6_oneRec("채영", 209908, 100, 75, 95));
		k6_datasArray.add(k6_oneRec("쯔위", 209909, 80, 65, 95));
		//각 datasArray에 넣은 값을 filewrite하기 위햐서 try catch문으로 예외처리함
		try {
			FileWriter k6_file = new FileWriter("D:\\test\\test.json");	//원하는 경로와 파일이름을 파라미터로 받아 filewrite진행
			k6_file.write(k6_datasArray.toJSONString());	//전체를 String 값으로 받기위해 toJSONString()을 사용
			k6_file.flush();	//write작업이 끝났으면 메모리를 비워준다.
			k6_file.close();	//작업 끝난 후 close()해주기
			
		} catch (IOException k6_e) {
			k6_e.printStackTrace();		//예외가 발생했을 때 StackTrace를 출력
		}
		for (int i = 0; i < k6_datasArray.size(); i++) {
			System.out.println(k6_datasArray.get(i));
		}
	}
}
