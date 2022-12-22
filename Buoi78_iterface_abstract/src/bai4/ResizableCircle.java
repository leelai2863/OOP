package bai4;

public class ResizableCircle extends Circle implements Resizable{
	double radius;

	public ResizableCircle(double radius) {
		super(radius);
	}
	@Override
	public String toString() {
		return "ResizableCircle [radius=" + radius + "]";
	}
	public void resize(int precent) {
		radius *= precent/100.0;
	}
}
