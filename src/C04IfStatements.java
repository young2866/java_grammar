import java.util.Scanner;

public class C04IfStatements {

	public static void main(String[] args) {

//		String answer = "0234";
//		System.out.println("비밀번호를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//
//		if (input.equals( answer)) {
//			System.out.println("문이 열렸습니다");
//		} else {
//			System.out.println("비밀번호가 틀렸습니다.");
//		}
//		char input = scanner.next().charAt(0);
//
//		if (input >= 'a') {
//			System.out.println("소문자");
//		} else {
//			System.out.println("대문자");
//		}
//		System.out.println("현재 잔액을 입력하세요 : ");
//		int nowCash = scanner.nextInt();
//		System.out.println("버스 요금을 입력하세요 : ");
//		int busPrice = scanner.nextInt();
//		boolean stolen;
//
//		System.out.println(nowCash >= busPrice ? "정상처리" : "탑승불가");

		System.out.println("원하시는 서비스의 번호를 입력하여 주세요. : 0(상담사 연결) , 1(대출), 2(예금), 3(적금)");
		switch (scanner.next()) {
			case "0":
				System.out.println("상담사를 연결해드리겠습니다.");
				break;
			case "1":
				System.out.println("대출 서비스를 누르셨습니다");
				break;
			case "2":
				System.out.println("예금 서비스를 누르셨습니다.");
				break;
			case "3":
				System.out.println("적금 서비스를 누르셨습니다.");
				break;
			default:
				System.out.println("잘못 누르셨습니다.");
		}

	}
}