
package carPayment;

import java.lang.Math;

public class CarPayment {
	// initialize variables
	
	private double CarCost;
	
	private double DownPayment;
	
	private double LengthofLoaninMonths;
	
	private double InterestRate;
	
	// this will take in potential car payments
	public CarPayment(double carCost, double downPayment, double lengthofLoaninMonths, double interestRate) {
		
		this.CarCost = carCost;
		
		this.DownPayment = downPayment;
		
		this.LengthofLoaninMonths = lengthofLoaninMonths;
		
		this.InterestRate = interestRate;
		
	}
	// calculates monthly payment
	public double monthlyPayment() {
		
		double monthlyRate = this.InterestRate / 12;
		// numerator part of calculation formula
		double numerator  = (monthlyRate * (Math.pow(1 + monthlyRate, this.LengthofLoaninMonths)));
		// denominator part of calculation formula
		double denominator = (Math.pow(1 + monthlyRate, this.LengthofLoaninMonths) - 1);
		
		double MonthlyPayment = (this.CarCost - this.DownPayment) * (numerator / denominator);
		// needed to round answers to the cent
		return Math.round(MonthlyPayment * 100d) / 100d;
	}
	
	// calculates total interest
	public double totalInterest() {
		
		double totalAmountPaid = this.monthlyPayment() * this.LengthofLoaninMonths;
		
		double TotalInterest = totalAmountPaid - this.CarCost + this.DownPayment;
		// needed to round answers to the cent
		return Math.round(TotalInterest * 100d) / 100d;
		
	}
	

}
