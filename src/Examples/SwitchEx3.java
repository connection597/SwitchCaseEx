package Examples;

public class SwitchEx3 {

	public static void main(String[] args) {
		int num=1;
		switch(num) {
		case 1:
			System.out.println("[1] num�� ���� 1�Դϴ�.");
			break;
		case 2:
			System.out.println("[2] num�� ���� 2�Դϴ�.");
			break;
			default:
				System.out.println("[3] num�� 1�� �ƴϰ� 2�� �ƴ�");
	}
		System.out.println("=========�Ʒ��� break���� ���� ��� ����=============");
		
		switch(num) {
		case 1:
			System.out.println("[4] num�� ���� 1�Դϴ�.");
		case 2:
			System.out.println("[5] break;���� ��� ���⵵ ���� �˴ϴ�");
			default:		
				System.out.println("[6] ������� ���� �ǰ� break;���� ���� switch�� Ż�� �մϴ�.");
				break;
		}
	}

}
