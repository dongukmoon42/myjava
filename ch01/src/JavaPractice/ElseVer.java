package JavaPractice;

public class ElseVer {

	public static void main(String[] args) {
		/*
		 if(조건) -> 참일때만 실행
		 	명령문
		 
		 else -> if문이 참이 아닐때 실행
		 	명령문
		 
		 [명령문이 여러줄일때]
		 if(조건){
		 	명령문
		 	...
		 }else{
		 	명령문
		 	...
		 }
		 */

		//Else 적용법
		int num = 3;
		
		if (num < 0) //실행X
			System.out.println("num은 0보다 작다");
		else
			System.out.println("num은 0보다 작지않다");
		
		
		//Else if -> 다른조건을 추가함.

		
		
		if (num < 0) //실행X
			System.out.println("num은 0보다 작다");
		else if (num > 3)
			System.out.println("num은 3보다 크다");
		else if (num == 3)
			System.out.println("num은 3이다.");
		
		
	}

}
