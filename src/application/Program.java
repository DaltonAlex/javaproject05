package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Wage;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Wage product = new Wage();
		
		System.out.print("Name: ");
		product.name=sc.nextLine();
		
		System.out.print("Gross salary: ");
		double x2=product.grossSalary=sc.nextDouble();
		
		System.out.print("Tax: ");
		product.tax=sc.nextDouble();
		double x = product.netSalary();
		
		System.out.println("\nEmployee: " + product);
		
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage=sc.nextDouble();
		double x1 = product.increaseSalary((percentage*x2)/100);
		
		double resultado=x+x1;
		
		System.out.printf("\nUpdate data: %s, $ %.2f", product.name, resultado);
		
		sc.close();
		
	}

}
