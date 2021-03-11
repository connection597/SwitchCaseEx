package Examples;

public class SwitchEx1 {

	public static void main(String[] args) {
		int score =87;
		switch(score/10) { // 조건 =8
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
			default:
				System.out.println("F학점");
				break;
		}

	}

}
