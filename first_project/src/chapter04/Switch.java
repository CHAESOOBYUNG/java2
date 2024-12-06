package chapter04;

public class Switch {
	
	public static void main(String[] args) {
		int number = 1;
		
		switch (number) {
			case 1:
				System.out.println("One");
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Unknown number");
		}
	}
	
}
