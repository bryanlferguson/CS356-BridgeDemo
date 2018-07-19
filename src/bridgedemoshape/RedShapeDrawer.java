package bridgedemoshape;

public class RedShapeDrawer implements ShapeDrawer {

	@Override
	public void drawCircle(double x, double y, double radius) {
		System.out.println("Drawing Red Circle with radius " + radius + " at x: " + x + " y: " + y);
		
	}

	@Override
	public void drawSquare(double x, double y, double side) {
		System.out.println("Drawing Red Square with side " + side + " at x: " + x + " y:" + y);
	}

}
