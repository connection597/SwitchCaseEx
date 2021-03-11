package Examples;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		String medal ="Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달 입니다");
			break;
		case "Silver":
			System.out.println("은메달 입니다");
			break;
		case "Breonze":
			System.out.println("동메달 입니다");
			break;
		default :
			System.out.println("메달 없습니다");
			break;
		}

	}

}
