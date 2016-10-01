package area;


public class Round extends Figure {

	public Round(double r) {
		this.r = r;//радиус
	}
	double r;
	@Override
	public double getArea() {
		return 3.14*r*r;
	}



}
