package bridgedemoshape;

public abstract class Shape {
	protected ShapeDrawer shapedrawer;
	
	public Shape(ShapeDrawer shapedrawer) {
		this.shapedrawer = shapedrawer;
	}
	
	public abstract void draw();
	public abstract void resize(double percentage);
}
