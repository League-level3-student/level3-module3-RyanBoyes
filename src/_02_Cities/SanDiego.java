package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxNoBonus =  population*growthRate;
		double annualTaxes = taxNoBonus + 1000000;
		
		return annualTaxes;
	}
}
