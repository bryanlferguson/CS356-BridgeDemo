package bridgedemogameconsole;

public class XBox extends GameConsole{

	@Override
	public void playGame(String gameTitle, int numPlayers) {
		System.out.println("XBox is now playing " + gameTitle + "with " + numPlayers + " players.");
	}

	@Override
	public void openAppStore() {
		System.out.println("Opening XBox App Store");
	}
	
}
