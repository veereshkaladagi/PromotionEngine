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
		
		return total;
	}

	private int calculateSkuIdB(int quantB, int total) {
		
		return total;
	}
	
	private int calculateSkuIdCAndD(int quantC, int quantD, int total) {
		
		return total;
	}
	
	
}
