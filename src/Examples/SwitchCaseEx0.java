package Examples;

import java.util.Scanner;

public class SwitchCaseEx0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� :");
		int num1 = sc.nextInt(); // ���� �Է�
		int result = num1%2; //�Է¹��� ���� %2
		
		switch(result) {
		case 0:
			System.out.println("¦���Դϴ�");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�");
			break;
			default: //�Ѵ� �ƴҰ��
				break;
		}

	}

}
