package com.adri1711.egc;

import static org.junit.Assert.*;

import org.junit.Test;
public class Practica1 {

	@Test
	public void testSum2Num(){
		assertEquals(6,sum(2,4));
	}
	
	
	public int sum(int i, int n){
		return i+n;
	}

	
	
	
	
}