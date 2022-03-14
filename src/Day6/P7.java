package Day6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class P7 {
 
    public static void main(String[] args) {
 
        ArrayList<Student> slist = new ArrayList<Student>();
 
        Scanner sc = new Scanner(System.in);
 

        while (true) {
            System.out.println("#Menu");
            System.out.println("1. Input a record");
            System.out.println("2. Make descriptive statistics");
            System.out.println("3. Print all the records");
            int input = sc.nextInt();
            Student std = new Student();
 
            if (input == 1) {
                // �꽦�쟻�엯�젰
            	String info = sc.next();
            	String str[] = info.split(",",4);
            	std.setName(str[0]);
            	std.setKor(Integer.parseInt(str[1]));
            	std.setEng(Integer.parseInt(str[2]));
            	std.setMath(Integer.parseInt(str[3]));
            	 
                slist.add(std);// Arraylist�뿉 std �엯�젰媛믪쓣 �꽔�뼱以��떎.
                
            } else if (input == 2) {
            	int numSt = slist.size();
            	
            	for (Student student : slist) {
            		double kor = student.getKor();
            		double eng = student.getEng();
            		double math = student.getMath();
            		System.out.printf("Number of Student : %d\n",numSt);

            	}
            } 	
 
            // �쟾泥댁텧�젰
            else if (input == 3) {
                for (int i = 0; i < slist.size(); i++) {
					System.out.println(slist.get(i));
				}
            	
            	
            } else if (input == 4) {
                System.out.println("�봽濡쒓렇�옩�쓣醫낅즺�빀�땲�떎");
                System.exit(-1);
            }
 
        } // while
 
    }
}

class Student {
	 
    String name;
    int kor;
    int eng;
    int math;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    
    public int Total() {
        return kor+eng+math;
    }
    public float Avg() {
        return kor+eng+math/3.0f;
    }
    public String toString() {
    	return "Name:" + getName() +"/ Korean:" +getKor()+"/ English:"+getEng() +"/ Math:"+getMath();
    }
    
}