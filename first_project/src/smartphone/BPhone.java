package smartphone;

public class BPhone implements IFunction {

	@Override
	public void call() {
		System.out.println("전화 가능합니다.");
	}

	String speed = "5G";
	
	@Override
	public void tvrc() {
		System.out.println("탑재 되어 있습니다.");
	}

}
