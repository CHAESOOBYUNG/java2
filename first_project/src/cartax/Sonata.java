package cartax;

public abstract class Sonata extends CarSpecs {
	public Sonata(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
	}
	
	int tax;
	
	public void getSpec() {
		if (displacement > 2000) {
			tax = 1500;
		} else {
			tax = 1000;
		}
		System.out.println("********************");
		System.out.println("색상: " + color);
		System.out.println("타이어: " + tire);
		System.out.println("배기량: " + displacement);
		System.out.println("핸들: " + handle);
		System.out.println("세금: " + tax);
		System.out.println("********************");
	}
}	
