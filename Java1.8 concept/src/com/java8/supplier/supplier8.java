package com.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class supplier8 {

	public static void main(String[] args) {
		Supplier s=()->new Date();
		System.out.println(s.get());

	}

}
