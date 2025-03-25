package JavaPractice;

public class SwitchCaseVer {

	public static void main(String[] args) {
		/*
		 Switch case : 케이스(경우)에 따른 분기
		 
		 switch (조건) {
		 case 값1:명령문
		 	break;
		 case 값2:명령문
		 	break;
		 ...
		 default:명령문
		 }		
		 */

		int menu = 2; //게임메뉴 :시작(1),설정(2)
		switch (menu) {
			case 1 : System.out.println("시작");
				break;
			case 2 : System.out.println("설정");
				break;
			default:System.out.println("잘못된 메뉴");
		}
	}

}
