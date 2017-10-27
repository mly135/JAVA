package com.test.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class testFile {
	public static void main(String[] args) throws FileNotFoundException {
		
		BigDecimal b= new BigDecimal(2.115).setScale(2, RoundingMode.HALF_UP);
		System.out.println(b);
		
		
		long tsyjkf = Math.round(2.114*100)/100;
		System.out.println(tsyjkf);
		
	}
}
