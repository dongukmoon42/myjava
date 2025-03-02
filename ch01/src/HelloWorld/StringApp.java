package HelloWorld;

public class StringApp {

	public static void main(String[] args) {
		
		//Character VS String
		System.out.println("Hello World"); //string
		System.out.println('H'); //Character
		System.out.println("H"); //string
		
		System.out.println("Hello"
				+ "World"); //줄바꿈은 안된다
		
		//'\n'new line의 약자이다.
		System.out.println("Hello \nWorld"); 
		
		// escape '\'
		System.out.println("Hello \"World\"");

	}

}
