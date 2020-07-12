package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxNoBonus = population*growthRate;
		double bonus = population*.5;
		
		double annualTaxes = taxNoBonus + bonus;
		
		return annualTaxes;
		
		
		
		
	}

}
