import java.util.Scanner;

public class C01InputOutput {
	public static void main(String[] args) {

//		int a = 20;
//		System.out.print(a);
//		String myString = "Hello world";
//		System.out.println(myString + a);

//		System.out.println(10 + 20);

		Scanner sc = new Scanner(System.in);
//		System.out.println("아무 문자열을 입력해주세요");
//		String input = sc.nextLine();
//		System.out.println("사용자가 입력한 문자열은 : " + input + "입니다.");
//
//		int inputInt = sc.nextInt();
//		System.out.println("사용자가 입력한 정수는 : " +inputInt);

//		System.out.println("더하기를 할 숫자 2개를 입력해주세요.");
//		int firstInt = sc.nextInt();
//		int secondInt = sc.nextInt();
//		System.out.println("입력하신 두 수를 더한 값은 " + (firstInt + secondInt) + " 입니다.");

		System.out.println("소수점을 가진 수를 입력해주세요 :");
		double inputDouble = sc.nextDouble();
		System.out.println("입력한 수는 : " + inputDouble + " 입니다.");

		System.out.println("Input true or default : ");
		boolean inputBoolean = sc.nextBoolean();
		System.out.println("입력한 것은 : " + inputBoolean);

		sc.close(); // 입출력 시스템 메모리 해제
	}
}