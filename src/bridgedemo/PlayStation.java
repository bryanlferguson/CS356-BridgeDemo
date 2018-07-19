package bridgedemo;

public class PlayStation extends GameConsole {

	@Override
	public void playGame(String gameTitle, int numPlayers) {
		System.out.println("PlayStation is now playing " + gameTitle + "with " + numPlayers + "number of players.");
	}

	@Override
	public void openAppStore() {
		System.out.println("Opening PlayStation App Store");
	}

}