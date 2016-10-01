package area;

import java.util.Random;

public class Rectangle extends Figure{

	public Rectangle(double a,double b) {
		this.a = a;
		this.b = b;
	}
	double a,b;
	@Override
	public double getArea() {
		return a*b;
	}

	

}
