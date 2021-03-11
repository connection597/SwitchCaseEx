package Examples;

public class SwitchTest {

	public static void main(String[] args) {
		int scr =(int)(Math.random()*10)+1;
		
		switch(scr*100) {
		case 100:
			System.out.println("당신의 점수는 100점");
			break;
		case 200:
			System.out.println("당신의 점수는 200점");
			break;
		case 300:
			System.out.println("당신의 점수는 300점");
			break;
		case 400:
			System.out.println("당신의 점수는 400점");
			break;
		default :
			System.out.println("점수 미달");
		}

	}

}
