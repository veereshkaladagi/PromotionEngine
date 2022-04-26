
package com.promotionengine.main;

import java.util.Scanner;

import com.promotionengine.evaluate.EvaluateCost;
import com.promotionengine.execute.ExecuteEvaluateEngine;


public class RunEngine {


	public static void main(String[] args) {
		
		System.out.println("Custome Promotion Engine");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter quantity value of SKU-ID A");
		int skuIdA = sc.nextInt();

		System.out.println("Enter quantity value of SKU-ID B");

		int skuIdB = sc.nextInt();

		System.out.println("Enter quantity value of SKU-ID C");

		int skuIdC = sc.nextInt();

		System.out.println("Enter quantity value of SKU-ID D");

		int skuIdD = sc.nextInt();
		
		
	}
	
	
}
