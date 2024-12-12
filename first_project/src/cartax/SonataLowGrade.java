package cartax;

public class SonataLowGrade extends Sonata {
	public SonataLowGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
	}
	
	public static void main(String[] args) {
        SonataLowGrade lowGradeCar = new SonataLowGrade("블루", "일반타이어", 2000, "파워핸들");

        lowGradeCar.getSpec();
    }
}
