


public class Triangle {
public final static double DEFAULT_SIDE = 1.000;
public static final String POLYGONSHAPE = "Triangle";
	
private double sideA;

private double sideB;

private double sideC;

private double [] sides = {sideA, sideB, sideC};

//******************

public Triangle() {
	sideA = DEFAULT_SIDE;
	sideB = DEFAULT_SIDE;
	sideC = DEFAULT_SIDE;
	
	sides[0] = sideA;
	sides[1] = sideB;
	sides[2] = sideC;
	
}



public Triangle(double a, double b, double c) {
	if(isTriangle(a,b,c) == true){
		sideA = a;
		sideB = b;
		sideC = c;
		sides[0] = sideA;
		sides[1] = sideB;
		sides[2] = sideC;
	}
	else {
		sideA = DEFAULT_SIDE;
		sideB = DEFAULT_SIDE;
		sideC = DEFAULT_SIDE;
		sides[0] = sideA;
		sides[1] = sideB;
		sides[2] = sideC;
	}
}



public Triangle(double[] ds) {
	if(isTriangle(ds) == true) {
		sideA = ds[0];
		sideB = ds[1];
		sideC = ds[2];
		sides[0] = sideA;
		sides[1] = sideB;
		sides[2] = sideC;
		
	}
	else {
		sideA = DEFAULT_SIDE;
		sideB = DEFAULT_SIDE;
		sideC = DEFAULT_SIDE;
		sides[0] = sideA;
		sides[1] = sideB;
		sides[2] = sideC;
	}
}






public Triangle(Triangle triangle) {
	if(triangle == null || isTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()) == false) {
		sideA = DEFAULT_SIDE;
		sideB = DEFAULT_SIDE;
		sideC = DEFAULT_SIDE;
		sides[0] = sideA;
		sides[1] = sideB;
		sides[2] = sideC;
	}
	else {
		sideA = triangle.getSideA();
		sideB = triangle.getSideB();
		sideC = triangle.getSideC();
		sides[0] = sideA;
		sides[1] = sideB;
		sides[2] = sideC;
	}
}



public static Boolean isTriangle(double a, double b, double c) {
	if(a + b > c && b + c > a && a + c > b) {
		return true;
	}
	if(Math.abs(a - b) < c && c < a + b) {
		return true;
	}
	
	return false;
}


public static Boolean isTriangle(double[] ds) {
	if(ds == null) {
		return false;
	}
	if(ds.length == 3) {
		double A = ds[0];
		double B = ds[1];
		double C = ds[2];
		return isTriangle(A, B, C);
		
	}
	return false;
}

public static double lawOfCosines(double a, double b, double c) {
	double f = (Math.pow(a, 2.0)+Math.pow(b, 2.0)-Math.pow(c, 2.0));
	double g = f/(2*a*b);
	double theta = Math.acos(g);
	theta = Math.toDegrees(theta);
	return theta;
}



public double getSideA() {
	return sideA;
}



public double getSideB() {
	return sideB;
}



public double getSideC() {
	return sideC;
}



public double[] getSides() {
	double[] s = sides.clone();
	return s;
}



public double getAngleA() {
	// (b*b) + (c*c) - (a*a) / 2*b*c
	double theta = lawOfCosines(sideB, sideC, sideA);
	return theta;
}



public double getAngleB() {
	double theta = lawOfCosines(sideC, sideA, sideB);
	return theta;
}



public double getAngleC() {
	double theta = lawOfCosines(sideA, sideB, sideC);
	return theta;
}



public double[] getAngles() {
	double A = lawOfCosines(sides[1], sides[2], sides[0]);
	
	double B = lawOfCosines(sides[0], sides[2], sides[1]);
	
	double C = lawOfCosines(sides[0], sides[1], sides[2]);
	
	double [] array = {A, B, C};
	return array;
}


public Boolean setSideA(double d) {
	Double test = d;
	if(test.equals(null) != true && isTriangle(d, sideB, sideC) == true) {
		sideA = d;
		sides[0] = sideA;
		return true;
	}
		return false;
}



public Boolean setSideB(double d) {
	Double test = d;
	if(test.equals(null) != true && isTriangle(sideA, d, sideC) == true) {
		sideB = d;
		sides[1] = sideB;
		return true;
	}
		return false;
}



public Boolean setSideC(double d) {
	Double test = d;
	if(test.equals(null) != true && isTriangle(sideA, sideB, d) == true) {
		sideC = d;
		sides[2] = sideC;
		return true;
	}
		return false;
}



public Boolean setSides(double[] ds) {
	if(isTriangle(ds) == true) {
		sideA = ds[0];
		sideB = ds[1];
		sideC = ds[2];
		sides[0] = sideA;
		sides[1] = sideB;
		sides[2] = sideC;
		return true;
	}
	return false;
}

public String toString() {
	String a = String.format("Triangle(%.4f", sideA);
	String b = String.format("%.4f", sideB);
	String c = String.format("%.4f", sideC);
	return a + ", " + b + ", " + c+ ")";
}



}

