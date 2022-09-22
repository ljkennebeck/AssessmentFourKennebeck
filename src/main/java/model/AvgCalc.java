package model;


/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Sep 16, 2022  
*/
public class AvgCalc {
	
	private double numOne;
	private double numTwo;
	private double numThree;
	private double average;
	
	public AvgCalc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AvgCalc(int numOne, int numTwo, int numThree) {
		super();
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.numThree = numThree;
		calculator(numOne, numTwo, numThree);
	}

	public double getNumOne() {
		return numOne;
	}

	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}

	public double getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}

	public double getNumThree() {
		return numThree;
	}

	public void setNumThree(int numThree) {
		this.numThree = numThree;
	}
	
	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public void calculator(int numOne, int numTwo, int numThree) {
		double numTotal = 3;
		setAverage((numOne + numTwo + numThree) / numTotal);
	}

	@Override
	public String toString() {
		return "AvgCalc [numOne=" + numOne + ", numTwo=" + numTwo + ", numThree=" + numThree + ", average=" + average
				+ "]";
	}

	
	
	

}
