package Examples;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int i = sc.nextInt(); // ���� �Է�
		
		String grade ="";
		switch(i/10) { //���� ������ 10���� ���� ���� �� �Ǻ�
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
		default : //���� �̿��� ��
			grade ="F";
			break;
		}
		System.out.println("����� " +grade+"���� �Դϴ�"); //���� ���

	}

}
