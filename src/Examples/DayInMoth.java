package Examples;

import java.util.Scanner;

public class DayInMoth {

	public static void main(String[] args) {
		int month;
		int year =2021;
		int days = 0;
		
		System.out.println("일수를 알고 싶은 달을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		month =sc.nextInt();
		
		switch(month) {
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
			days =31;
			break;
		case 4 : case 6: case 9: case 11: 
			days =30;
			break;
		case 2 : 
			days =28;
			break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다");
				break;
		}
		System.out.println(month + "월의 날짜 수는" +days+"일");

	}

}
