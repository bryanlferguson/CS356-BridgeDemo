package bridgedemo;

public class Circle extends Shape{
	
	private double x, y, radius;

	public Circle(ShapeDrawer shapedrawer, double x, double y, double radius) {
		super(shapedrawer);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		shapedrawer.drawCircle(x, y, radius);
		
	}

	@Override
	public void resize(double percentage) {
		radius *= 1.0 + percentage / 100.0;
	}
	
}
