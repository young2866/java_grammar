public class C03Operater {
	public static void main(String[] args) {

//		int num1 = 8;
//		int num2 = 3;
//
//		System.out.println("num1 + num2 : " + (num1 + num2) );
//		System.out.println("num1 - num2 : " + (num1 - num2) );
//		System.out.println("num1 * num2 : " + (num1 * num2) );
//		System.out.println("num1 / num2 : " + (num1 / num2) );
//		System.out.println("num1 % num2 : " + (num1 % num2) );
//
//		char char1 = 'a';
//		char char2 = 'A';
//
//		System.out.println(char1 == char2 ? "true" : "false");

		int num1 = 10;
		int num2 = 20;
		boolean result1, result2;

		result1 = num1 > 5 && num2 < 20 ? true : false;
		result2 = num1 < 10 || num2 < 30 ? true : false;

		System.out.println(result1 + " " + result2);
		System.out.println(!result2);

	}

}