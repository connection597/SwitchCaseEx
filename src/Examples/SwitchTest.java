package Examples;

public class SwitchTest {

	public static void main(String[] args) {
		int scr =(int)(Math.random()*10)+1;
		
		switch(scr*100) {
		case 100:
			System.out.println("����� ������ 100��");
			break;
		case 200:
			System.out.println("����� ������ 200��");
			break;
		case 300:
			System.out.println("����� ������ 300��");
			break;
		case 400:
			System.out.println("����� ������ 400��");
			break;
		default :
			System.out.println("���� �̴�");
		}

	}

}
