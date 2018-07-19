package bridgedemogameconsole;

public class PlayStationController extends ConsoleController {

	public PlayStationController(GameConsole console) {
		super(console);
	}

	@Override
	public void topButtonPress() {
		System.out.println("Triangle pressed!");
	}

	@Override
	public void leftButtonPress() {
		System.out.println("Square pressed!");
	}

	@Override
	public void rightButtonPress() {
		System.out.println("Circle pressed!");
	}

	@Override
	public void bottomButtonPress() {
		System.out.println("X pressed!");
	}
	
}
