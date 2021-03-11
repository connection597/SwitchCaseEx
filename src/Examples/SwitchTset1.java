package Examples;

public class SwitchTset1 {

	public static void main(String[] args) {
		int scr =(int)(Math.random() *10)+1;
		String msg ="";
		
		scr *=100;
		msg ="당신의 점수는"+scr+"점";
		
		switch(scr) {
		case 1000:
			msg += "에어컨,";
			break;
		case 900:
			msg += "TV,";
			break;
		case 800:
			msg += "모니터,";
			break;
		case 700:
			msg += "스피커,";
			break;
		default :
			msg += "마우스,";
		}
	    System.out.println(msg +"입니다");

	}

}
