
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
		double monthlyRate = this.InterestRate / 12;
		double num = (monthlyRate * (Math.pow(1+monthlyRate, this.LengthofLoaninMonths)));
		double denom = (Math.pow(1+monthlyRate, this.LengthofLoaninMonths) - 1);
		double MonthlyPayment = (this.CarCost - this.DownPayment) * (num/denom);
		return MonthlyPayment;
	}
	
	public double totalInterest() {
		double nm = this.monthlyPayment() * this.LengthofLoaninMonths;
		double TotalInterest = nm - this.CarCost;
		return TotalInterest;
	}
	

}
