package cartax;

public class SonataHighGrade extends Sonata {

	public SonataHighGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
	}
	
	public static void main(String[] args) {
        SonataHighGrade highGradeCar = new SonataHighGrade("레드", "광폭타이어", 2200, "파워핸들");

        highGradeCar.getSpec();
    }
}
