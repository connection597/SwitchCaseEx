package Examples;

public class SwitchTset1 {

	public static void main(String[] args) {
		int scr =(int)(Math.random() *10)+1;
		String msg ="";
		
		scr *=100;
		msg ="����� ������"+scr+"��";
		
		switch(scr) {
		case 1000:
			msg += "������,";
			break;
		case 900:
			msg += "TV,";
			break;
		case 800:
			msg += "�����,";
			break;
		case 700:
			msg += "����Ŀ,";
			break;
		default :
			msg += "���콺,";
		}
	    System.out.println(msg +"�Դϴ�");

	}

}
