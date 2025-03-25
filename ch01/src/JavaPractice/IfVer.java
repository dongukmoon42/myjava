package JavaPractice;

public class IfVer {

	public static void main(String[] args) {
		
		/*
		[if 기본식]
		if (조건) 
			명령문	
			
		[명령문이 두줄 이상일때]
		if (조건){
			명령문
			명령문
			...
		}	
		*/
		
		int num = 3;
		
		if (num > 0)
			System.out.println("num은 0보다 커요");
		if (num < 0)
			System.out.println("num은 0보다 작아요");		
		if (num > 0 && num<5)
			System.out.println("num은 0보다 크고 5보다 작아요");
		if (num > 0 || num<5)
			System.out.println("num은 0보다 크거나 5보다 작아요");
		
		

	}

}
