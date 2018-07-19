package bridgedemogameconsole;

public abstract class GameConsole {
	
	public boolean gamePaused = false, gameLaunched = false;
	public String gameTitle;
	
	public abstract void playGame(String gameTitle, int numPlayers);
	public abstract void openAppStore();
	
	public void pauseGame() {
		if (gameLaunched) {
			gamePaused = !gamePaused;
			System.out.println(gameTitle + (gamePaused ? " is now Paused" : " is resumed"));
		} else {
			System.out.println("No game currently playing!");
		}
	}
}
