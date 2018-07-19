package bridgedemo;

public class GreenShapeDrawer implements ShapeDrawer {
	
	@Override
	public void drawCircle(double x, double y, double radius) {
		System.out.println("Drawing Green Circle with radius " + radius + " at x:" + x + " y:");
		
	}

	@Override
	public void drawSquare(double x, double y, double side) {
		System.out.println("Drawing Green Square with side " + side + " at x:" + x + " y:");
	}

}
