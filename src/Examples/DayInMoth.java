package Examples;

import java.util.Scanner;

public class DayInMoth {

	public static void main(String[] args) {
		int month;
		int year =2021;
		int days = 0;
		
		System.out.println("�ϼ��� �˰� ���� ���� �Է��ϼ��� : ");
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
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�");
				break;
		}
		System.out.println(month + "���� ��¥ ����" +days+"��");

	}

}
