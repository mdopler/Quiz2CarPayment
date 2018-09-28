package carPaymentTest;

import static org.junit.Assert.*;

import org.junit.Test;

import carPayment.CarPayment;

import java.lang.Math;

public class CarPaymentTest {
	
	@Test
	public void monthlyPayment_Test1() {
		
		CarPayment testCar = new CarPayment(35000, 0, 60, 0.10);
		
		assertTrue(Math.round(testCar.monthlyPayment()) == Math.round(743.65));
		
	}
	
	@Test
	public void totalInterest_Test1() {
		
		CarPayment testCar = new CarPayment(35000, 0, 60, 0.10);
		
		assertTrue(Math.round(testCar.totalInterest()) == Math.round(9618.79));
		
	}
	

}
