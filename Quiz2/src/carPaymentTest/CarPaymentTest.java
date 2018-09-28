package carPaymentTest;

import static org.junit.Assert.*;

import org.junit.Test;

import carPayment.CarPayment;

import java.lang.Math;

public class CarPaymentTest {
	
	@Test
	public void monthlyPayment_Test1() {
		
		CarPayment testCar = new CarPayment(35000, 0, 60, 0.10);
		System.out.println(testCar.monthlyPayment());
		assertTrue(testCar.monthlyPayment() == 743.65);
		
	}
	
	@Test
	public void monthlyPayment_Test2() {
		
		CarPayment testCar = new CarPayment(42000, 5000, 72, 0.12);
		System.out.println(testCar.monthlyPayment());
		assertTrue(testCar.monthlyPayment() == 723.36);
		
	}
	
	@Test
	public void totalInterest_Test1() {
		
		CarPayment testCar = new CarPayment(35000, 0, 60, 0.10);
		System.out.println(testCar.totalInterest());
		assertTrue(testCar.totalInterest() == 9619.00);
		// I am not sure how the total interest could be 9,618.79 if you are paying
		// 743.65 for 60 months.  The total cost would work out to 743.65 * 60 = 44,619
		// and the total cost of the car is 35000.  The total interest should be 
		// 44619 - 35000 = 9,619 and not 9618.79, I think there was a rounding error when the
		// problem was created
	}
	
	@Test
	public void totalInterest_Test2() {
		
		CarPayment testCar = new CarPayment(42000, 5000, 72, 0.12);
		System.out.println(testCar.totalInterest());
		assertTrue(testCar.totalInterest() == 15081.92);
		
	}

}
