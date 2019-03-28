package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase1() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase3() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase4() {
		ntc.setStartTime(2500);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase5() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase6() {
		ntc.setStartTime(1576);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase7() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase8() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTimeCase9() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	
	
	
	
	
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDurationCase1() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDurationCase2() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	
	
	@Test()
	public void testDiscountedStartTimeDiscountedDurationCase1() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double expected = 1768;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	@Test()
	public void testDiscountedStartTimeDiscountedDurationCase2() {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		double expected = 1078.48;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	@Test()
	public void testDiscountedStartTimeDiscountedDurationCase3() {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		double expected = 1078.48;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	@Test()
	public void testDiscountedStartTimeDiscountedDurationCase4() {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		double expected = 1149.2;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	
	
	@Test()
	public void testDiscountedStartTimeCase1() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double expected = 1248.0;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	@Test()
	public void testDiscountedStartTimeCase2() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		double expected = 1227.2;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	@Test()
	public void testDiscountedStartTimeCase3() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		double expected = 20.8;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	@Test()
	public void testDiscountedStartTimeCase4() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double expected = 208.0;
		assertEquals(expected,ntc.computeCharge(), 0);
	}

	@Test()
	public void testDiscountedStartTimeCase5() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		double expected = 208.0;
		assertEquals(expected,ntc.computeCharge(), 0);
	}

	@Test()
	public void testDiscountedStartTimeCase6() {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		double expected = 208.0;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	
	
	
	
	
	
	@Test()
	public void testDiscountedDurationCase1() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double expected = 2298.4;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	
	@Test()
	public void testDiscountedDurationCase2() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		double expected = 2156.96;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	
	
	
	
	@Test()
	public void testNoDiscountsCase1() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double expected = 1664.0;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	
	@Test()
	public void testNoDiscountsCase2() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		double expected = 41.6;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	
	@Test()
	public void testNoDiscountsCase3() {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		double expected = 2454.4;
		assertEquals(expected,ntc.computeCharge(), 0);
	}
	
	
	@Test()
	public void testNoDiscountsCase4() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		double expected = 2496.0;
		assertEquals(expected,ntc.computeCharge(), 0);
	}


}
