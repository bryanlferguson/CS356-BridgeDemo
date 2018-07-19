package bridgedemogameconsole;

public class XBoxController extends ConsoleController{
	
	public XBoxController(GameConsole console) {
		super(console);
	}

	@Override
	public void topButtonPress() {
		System.out.println("Y pressed!");
	}

	@Override
	public void leftButtonPress() {
		System.out.println("X pressed!");
	}

	@Override
	public void rightButtonPress() {
		System.out.println("B pressed!");
	}

	@Override
	public void bottomButtonPress() {
		System.out.println("A pressed!");
	}
	
	
}
