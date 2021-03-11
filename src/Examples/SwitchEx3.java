package Examples;

public class SwitchEx3 {

	public static void main(String[] args) {
		int num=1;
		switch(num) {
		case 1:
			System.out.println("[1] num의 값은 1입니다.");
			break;
		case 2:
			System.out.println("[2] num의 값은 2입니다.");
			break;
			default:
				System.out.println("[3] num이 1도 아니고 2도 아님");
	}
		System.out.println("=========아래의 break문이 없을 경우 예제=============");
		
		switch(num) {
		case 1:
			System.out.println("[4] num의 값은 1입니다.");
		case 2:
			System.out.println("[5] break;문이 없어서 여기도 실행 됩니다");
			default:		
				System.out.println("[6] 여기까지 실행 되고 break;문을 만나 switch를 탈줄 합니다.");
				break;
		}
	}

}
