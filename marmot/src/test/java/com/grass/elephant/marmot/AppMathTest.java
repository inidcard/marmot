package com.grass.elephant.marmot;

import java.math.BigDecimal;

import org.junit.Test;

public class AppMathTest {
	
	@Test
	public void mBigDecimal(){
		
		String s = "44444.55";
		double d = 123455.67;
		
//		BigDecimal bd = new BigDecimal(d).multiply(100);
		BigDecimal bd = new BigDecimal(d);
		//bd = bd.multiply(100, 100);
		System.out.println("===: " + bd.multiply(new BigDecimal(100)).intValue());
		System.out.println("===: " + bd.toString());
		
		
		
		
	}

}
