package com.epam.jb27.lesson6;

public class Fraction {

	private int nominator;
	private int denominator;

	public Fraction(int nominator, int denominator) {
		
		this.nominator = nominator;
		this.denominator = denominator;
	
	}

	@Override
	public String toString() {
		return nominator+"/"+denominator;
	}
	
	
}


