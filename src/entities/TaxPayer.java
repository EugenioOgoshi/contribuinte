package entities;

public class TaxPayer {
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer(Double salaryIncome, Double servicesIcome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIcome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	public  double salaryTax() {
		if(salaryIncome< 36000.00) {
			return salaryIncome;
		}
		else if(salaryIncome < 60000.00) {
			return salaryIncome * 0.1;
		}
		else if(salaryIncome > 60000.00){
			return salaryIncome * 0.2;
		}else {
			return 0;
		}
	}
	public double servicesTax() {
		return servicesIncome * 0.15;
	}
	public double capitalTax() {
		return capitalIncome * 0.20;
	}
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	public double taxRebate() {
		double maxDedutible = grossTax() * 0.3;
		double expensesDedutible = healthSpending + educationSpending;
		if(maxDedutible < expensesDedutible) {
			return maxDedutible;
		}
		else {
			return expensesDedutible;
		}
	}
	public double netTax() {
		return grossTax() - taxRebate();
	}
	public String toString() {
		return 
				"Imposto bruto total: " + String.format("%.2f", grossTax())+
				"\n"+"Abatimento: " + String.format("%.2f",taxRebate())+
				"\n"+"Imposto devido: " + String.format("%.2f",netTax());

	}
}
