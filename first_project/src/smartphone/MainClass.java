package smartphone;

public class MainClass {
	public static void main(String[] args) {
		APhone aPhone = new APhone();
		BPhone bPhone = new BPhone();
		CPhone cPhone = new CPhone();
		
		System.out.println("A Phone");
		aPhone.call();
		System.out.println("불가능합니다. " + aPhone.speed + "입니다.");
		aPhone.tvrc();
		System.out.println("----------------------------------------");
		
		System.out.println("B Phone");
		bPhone.call();
		System.out.println("불가능합니다. " + bPhone.speed + "입니다.");
		bPhone.tvrc();
		System.out.println("----------------------------------------");
		
		System.out.println("C Phone");
		cPhone.call();
		System.out.println("불가능합니다. " + cPhone.speed + "입니다.");
		cPhone.tvrc();
		System.out.println("----------------------------------------");
	}
}
