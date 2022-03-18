package Day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		ArrayList<String> days = new ArrayList<>(); // for weekdays
		ArrayList<String> points = new ArrayList<>();
		ArrayList<String> stops = new ArrayList<>();
		ArrayList<String> hours = new ArrayList<>(); // for times

		ArrayList<Integer> daycount = new ArrayList<>(); // for count day
		ArrayList<Integer> dayscount = new ArrayList<>(); // for cal mean , count
		ArrayList<Integer> incount = new ArrayList<>();
		ArrayList<Integer> outcount = new ArrayList<>();

		int[] timecount = null; // for count
		int[] howtime = null;

		String carin = "유입";
		String carout = "유출";
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\trafficvolume.csv"));
			String line;
			int idx = -1;

			while ((line = br.readLine()) != null) {
				String[] ary = line.split(",");
				if (ary[0].equals("일자")) {
					for (int i = 6; i < ary.length; i++) {
						hours.add(ary[i]);
					}

					timecount = new int[hours.size()];
					howtime = new int[hours.size()];
					continue;
				}

				String day = ary[1], point = ary[2];
				int sum = sum(ary);
				// for days
				if (days.contains(day)) {
					idx = days.indexOf(day);
					daycount.set(idx, daycount.get(idx) + sum);
					dayscount.set(idx, dayscount.get(idx) + 1);
				} else {
					days.add(day);
					daycount.add(sum);
					dayscount.add(0);
				}

				// for points and stops

				if (points.contains(point)) {
					idx = points.indexOf(point);
					if (ary[4].equals(carin)) {
						incount.set(idx, incount.get(idx) + sum);
					} else {
						outcount.set(idx, outcount.get(idx) + sum);
					}
				} else {
					points.add(point);
					incount.add(sum);
					outcount.add(sum);
					stops.add(ary[3]);
				}

				for (int i = 6; i < ary.length; i++) {
					int num = 0;
					if (!ary[i].equals("")) {
						num = Integer.parseInt(ary[i]);
					}
					timecount[i - 6] += num;
					howtime[i - 6]++;
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// for print
		Scanner scanner = new Scanner(System.in);
		printformat();

		int num = scanner.nextInt();
		switch (num) {
			case 1:
				for (int i = 0; i < days.size(); i++) { // for weekday
					System.out.println(days.get(i) + " : 평균 " + checkMan((float) daycount.get(i) / dayscount.get(i)));
				}
				System.out.println();
				break;
			case 2:
				for (int i = 0; i < points.size(); i++) { // for stops & stop point
					System.out.println(points.get(i) + " 지점번호 : " + stops.get(i));
					System.out.println(carin + " 평균 : " + checkMan((float) incount.get(i) / 31) + ", " + carout + " 평균 : "
							+ checkMan((float) outcount.get(i) / 31));
				}
				System.out.println();
				break;
			case 3:
				for (int i = 0; i < hours.size(); i++) {
					System.out.println(hours.get(i) + " 평균 : " + checkMan((float) timecount[i] / howtime[i]));
				}
				break;
			default:
				System.out.println("out of order. Error!");
				break;
		}
	}

	private static void printformat() {
		System.out.println("보고싶은 data를 지정하세요.");
		System.out.println("1. 요일별 평균\n2. 지점별 평균\n3. 시간별 평균");
		System.out.print(" -> ");
	}

	public static int sum(String[] ary) {
		int sum = 0;

		for (int i = 6; i < ary.length; i++) {
			int num = 0;
			if (!ary[i].equals("")) {
				num = Integer.parseInt(ary[i]);
			}
			sum += num;
		}

		return sum;
	}

	public static String checkMan(float num) {
		String str = "";
		int man = (int) num / 10000;
		if (man != 0) {
			str = man + "만 " + num % 10000;
		} else {
			str = num + "";
		}

		return str;
	}
}