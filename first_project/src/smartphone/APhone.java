package smartphone;

public class APhone implements IFunction {
	@Override
	public void call() {
		System.out.println("전화 가능합니다.");
	}
	
	String speed = "3G";
	
	@Override
	public void tvrc() {
		System.out.println("미탑재 되어있습니다.");
	}
}
