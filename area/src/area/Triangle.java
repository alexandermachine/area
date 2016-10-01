package area;

public class Triangle extends Figure{

	public Triangle(double a,double h) {
		this.a = a;//сторона треугольника
		this.h = h;//высота треугольника
	}
	double a,h;
	@Override
	public double getArea() {
		return 0.5*a*h;
	}
}
