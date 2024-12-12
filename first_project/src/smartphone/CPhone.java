package smartphone;

public class CPhone implements IFunction {

	@Override
	public void call() {
		System.out.println("전화 가능합니다.");
	}

	String speed = "4G";
	
	@Override
	public void tvrc() {
		System.out.println("미탑재 되어 있습니다.");
	}

}
