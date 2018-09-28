
package carPayment;

import java.lang.Math;

public class CarPayment {
	
	private double CarCost;
	private double DownPayment;
	private double LengthofLoaninMonths;
	private double InterestRate;
	
	public CarPayment(double carCost, double downPayment, double lengthofLoaninMonths, double interestRate) {
		this.CarCost = carCost;
		this.DownPayment = downPayment;
		this.LengthofLoaninMonths = lengthofLoaninMonths;
		this.InterestRate = interestRate;
	}
	
	public double monthlyPayment() {
		double P = this.CarCost;
		double monthRate = this.InterestRate / 12;
		double num = (monthRate * (Math.pow(1+monthRate, this.LengthofLoaninMonths)));
		double denom = (Math.pow(1+monthRate, this.LengthofLoaninMonths) - 1);
		
		return P * (num/denom);
	}
	
	public double totalInterest() {
		double nm = this.monthlyPayment() * this.LengthofLoaninMonths;
		return nm - this.CarCost;
	}
	

}
