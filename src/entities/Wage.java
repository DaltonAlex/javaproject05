package entities;

public class Wage {
	
	public String name;
	public double grossSalary;
	public double tax;
			
		public double netSalary() {
		return grossSalary-tax;
	}
	public double increaseSalary (double grossSalary) {
		 return grossSalary;
		
	}
	public String toString() {
		return name
				+", $ "
				+ String.format("%.2f", netSalary());	
		
	}
}
	