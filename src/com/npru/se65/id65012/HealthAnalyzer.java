package com.npru.se65.id65012;

public class HealthAnalyzer {
	public String analyzeBmi(double bmi) {
		if(bmi < 18.4) {
			return "Underweight";
		}else if(bmi <= 24.9) {
			return "Normal weight";
		}else if(bmi <= 39.9) {
			return "Over weight";
		}else {
			return "obesity";
		}
	}
	
}
