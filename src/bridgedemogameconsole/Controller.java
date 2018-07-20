package bridgedemogameconsole;

/*
 * This class is the refined abstraction
 */
public abstract class Controller {
	//This is the "bridge"
	protected GameConsole console;
	
	public Controller(GameConsole console) {
		this.console = console; 
	}
	
	public void playGame(String gameTitle, int numPlayers) {
		console.playGame(gameTitle, numPlayers);
	}
	
	public void openAppStore() {
		console.openAppStore();
	}
	
	public abstract void topButtonPress();
	public abstract void leftButtonPress();
	public abstract void rightButtonPress();
	public abstract void bottomButtonPress();
	
	public void startButtonPressed() {
		console.pauseGame();
	}
}
