package bai3_T34;

public class MyTriangle {
	MyPoint v1;
	MyPoint v2;
	MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1.x = x1;
		v1.y = y1;
		v2.x = x2;
		v2.y = y2;
		v3.x = x3;
		v3.y = y3;
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	public String toString() {
		return "MyTRiangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}

	public double getPerimeter() {
		return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
	}
	public String getType() {
		String type = "";
		if(v1.distance(v2) == v2.distance(v3) && v1.distance(v2) == v1.distance(v3)) {
			if(v3.distance(v1) == v1.distance(v2)) {
				type = "Equilateral";
				return type;
			}
			else {
				type = "Isosceles";
				return type;
			}
		}
		else {
			type = "Scalene";
			return type;
		}
	}
}
