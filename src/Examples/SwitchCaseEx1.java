package Examples;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int i = sc.nextInt(); // 점수 입력
		
		String grade ="";
		switch(i/10) { //조건 점수를 10으로 나눈 값의 로 판별
		case 10:
		case 9: 
			grade ="A";
			break;
		case 8: 
			grade ="B";
			break;
		case 7: 
			grade ="C";
			break;
		default : //조건 이외의 값
			grade ="F";
			break;
		}
		System.out.println("당신의 " +grade+"학점 입니다"); //학점 출력

	}

}
