package chapter02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요 >> ");
		String name = scan.nextLine();
		System.out.println("안녕하세요. " + name + "님 반갑습니다.");
		scan.close();
	}
}
