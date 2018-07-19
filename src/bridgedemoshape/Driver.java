package bridgedemoshape;

public class Driver {
	public static void main (String[] args) {
		Shape circle = new Circle(new GreenShapeDrawer(), 2.0, 3.0, 5.0);
		Shape circle2 = new Circle(new RedShapeDrawer(), 4.0, 2.3, 5.5);
		
		circle.draw();
		circle2.draw();
	}
}
