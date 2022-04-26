package com.promotionengine.evaluate;

public class EvaluateCost {
	

	public static final int PRICE_SKU_A = 50;

	public static final int PRICE_SKU_B = 30;

	public static final int PRICE_SKU_C = 20;

	public static final int PRICE_SKU_D = 15;
	
	public static final int PRICE_COMBO_SKU_A = 130;
	
	public static final int PRICE_COMBO_SKU_B = 45;
	
	public static final int PRICE_COMBO_SKU_CD = 30;
	
	public int total =0;
	
	
	public int evaluateTotalCost(int quantA, int quantB, int quantC, int quantD ) {
		
		  total = calculateSkuIdA(quantA, total);
		
		  total = calculateSkuIdB(quantB, total);
		
		  total = calculateSkuIdCAndD(quantC, quantD, total);
		
		return total ;
	}


	private int calculateSkuIdA(int quantA, int total) {
		if (quantA >= 3) {
			int quotient = quantA / 3;
			int remainder = quantA % 3;

			total = (quotient >= 0) ? total + quotient * PRICE_COMBO_SKU_A : total;

			total = (remainder >= 0) ? total + remainder * PRICE_SKU_A : total;
		} else {

			total = total + quantA * PRICE_SKU_A;
		}
		
		return total;
	}

	private int calculateSkuIdB(int quantB, int total) {
		if (quantB >= 2) {
			int quotient = quantB / 2;
			int remainder = quantB % 2;

			total = (quotient >= 0) ? total + quotient * PRICE_COMBO_SKU_B : total;

			total = (remainder >= 0) ? total + remainder * PRICE_SKU_B : total;
		} else {

			total = total + quantB * PRICE_SKU_B;
		}
		
		return total;
	}
	
	private int calculateSkuIdCAndD(int quantC, int quantD, int total) {
		
		if(quantC >=1 && quantD >=1 ) {
			
			total = (quantC == quantD ) ? total + quantC*PRICE_COMBO_SKU_CD : total;
			
			total = (quantC > quantD ) ?  total + (quantD*PRICE_COMBO_SKU_CD  + (quantC - quantD )*PRICE_SKU_C) : total ;
			
			total = (quantD > quantC ) ?  total + (quantC*PRICE_COMBO_SKU_CD  + (quantD - quantC )*PRICE_SKU_D) : total;
			
		}else {
			total =total + quantC * PRICE_SKU_C;
			
			total =total + quantD * PRICE_SKU_D;
		}
		return total;
	}
	
	

	
	
}
