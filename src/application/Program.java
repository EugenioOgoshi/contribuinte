package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		List<TaxPayer> list = new ArrayList<>();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos contribuintes você vai digitar?" );
		int n = sc.nextInt();
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.println("Digite os dados do "+(i+1)+"o contribuinte:");
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			
			TaxPayer payer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			
			list.add(payer);
		}
		System.out.println();
		int count = 1;
		for(TaxPayer p : list) {
			System.out.println("Resumo do "+(count++)+"o contribuinte:");
			System.out.println(p);
			System.out.println();
			
		}
	
		
		sc.close();
	}

}
