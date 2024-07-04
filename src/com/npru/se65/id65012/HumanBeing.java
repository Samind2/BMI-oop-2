package com.npru.se65.id65012;

public class HumanBeing {
	private double height;
	private double weight;
	private double bmi;

	private double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	private double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	private void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	public void calculateBMI() {
		BmiIndexer bi1 = new BmiIndexer();
		setBmi(bi1.calculateBMI(getHeight(), getWeight()));
	}
	
	public String analyzeBmi() {
		HealthAnalyzer ha = new HealthAnalyzer();
		return ha.analyzeBmi(getBmi());
	}

}
