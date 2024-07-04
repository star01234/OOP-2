package com.npru.se65.id65001;

public class HumanBeing {
	private double height;
	private double weight;
	private double bmi;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public void calculateBMi() {
		BmiIndexer bi1 = new BmiIndexer();
		setBmi(bi1.calculateBMI(getHeight(),getWeight()));
	}
	
	public String analyzeBmi() {
		HealthAnalyzer ha = new HealthAnalyzer();
		return ha.analyzeBmi(getBmi());
	}
}	
