package Examples;

import java.util.Scanner;

public class SwitchCaseEx0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :");
		int num1 = sc.nextInt(); // 숫자 입력
		int result = num1%2; //입력받은 숫자 %2
		
		switch(result) {
		case 0:
			System.out.println("짝수입니다");
			break;
		case 1:
			System.out.println("홀수입니다");
			break;
			default: //둘다 아닐경우
				break;
		}

	}

}
