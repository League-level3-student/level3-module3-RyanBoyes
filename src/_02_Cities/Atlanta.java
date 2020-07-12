package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {

		double taxNoBonus = population*growthRate;
		double bonus = growthRate*2;
		double annualTaxes = taxNoBonus*bonus;
		
		return annualTaxes;
		
		
		
		
	}

}
