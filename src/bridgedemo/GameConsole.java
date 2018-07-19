package bridgedemo;

public abstract class GameConsole {
	
	public boolean gamePaused = false;
	
	public abstract void playGame(String gameTitle, int numPlayers);
	public abstract void openAppStore();
	
	public void pauseGame() {
		gamePaused = !gamePaused;
		System.out.println("Game paused? " + gamePaused);
	}
}
