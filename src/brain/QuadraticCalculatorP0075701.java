package brain;
/*
 * @author G. M.
 * @date September 07 2017
 * @version 1.0
 * This class will take the coefficients of a quadratic equation
 * from the user and return the roots to the user
 */

public class QuadraticCalculatorP0075701 {

	/**
	 * @param args
	 */
	// here is where you insert all the attributes
	private double a; // this is coefficient a in front of x^2
	private double b; // this is coefficient b in front of x
	private double c; // this is coefficient c
	private double D; // The determinant D = b^2 - 4ac
	private double x1; // the first root
	private double x2; // the second root
	
	//******************************************
	
	//Constructor that accepts a, b, and c
	
	public QuadraticCalculatorP0075701(double newA, double newB, double newC){
		this.a = newA;
		this.b = newB;
		this.c = newC;
		this.D = b*b - 4*a*c;
	}
	
	/*
	 * There are two methods:
	 * 1) calculate roots
	 * 2) return roots to user
	 */
	public void determineRoots(){
		if (this.D>=0){
			this.x1 = (-b + Math.sqrt(D))/(2*a);
			this.x2 = (-b - Math.sqrt(D))/(2*a);
		}else{
			this.x1 = this.x2 = Double.POSITIVE_INFINITY;
		}
		
	}
	
	public double[] returnRoots(){
		double[] roots = new double[2];
		roots[0] = this.x1;
		roots[1] = this.x2;
		return roots; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testing the code
		//create a calculator object
		QuadraticCalculatorP0075701 calc = new QuadraticCalculatorP0075701(2.0, 0.0, 4.0);
		calc.determineRoots();
		double[] myRoots = calc.returnRoots();
		if (myRoots[0]== Double.POSITIVE_INFINITY || myRoots[1]== Double.POSITIVE_INFINITY ){
			System.out.println("There are no roots");
		}
		else{
			System.out.println("The roots are: ");
			System.out.println("x1 = " + myRoots[0]);
			System.out.println("x2 = " + myRoots[1]);	
		}
	

	} 

}
