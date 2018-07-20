package bridgedemogameconsole;

/*
 * Driver Class
 */
public class Driver {

	public static void main(String[] args) {
		Controller xbox = new XBoxController(new XBox());
		Controller ps = new PlayStationController(new PlayStation());
		
		xbox.openAppStore();
		xbox.playGame("Halo", 2);
		xbox.topButtonPress();
		xbox.leftButtonPress();
		xbox.rightButtonPress();
		xbox.bottomButtonPress();
		xbox.startButtonPressed();
		
		ps.openAppStore();
		ps.playGame("Cal of duty", 3);
		ps.topButtonPress();
		ps.leftButtonPress();
		ps.rightButtonPress();
		ps.bottomButtonPress();
		ps.startButtonPressed();
		ps.startButtonPressed();
		ps.startButtonPressed();
	}

}
