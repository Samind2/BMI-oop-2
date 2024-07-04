package com.npru.se65.id65012;

public class BmiIndexer {
	
	public double calculateBMI(double height, double weight) {
		return (weight/(height*height))*10000;
	}
	
}
