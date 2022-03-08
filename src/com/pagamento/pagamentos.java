package com.pagamento;

import java.util.Scanner;

public class Pagamentos {

	public static void main(String[] args) {
		Salario salario = new Salario();
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("digite seu salario: ");
		int salarioBruto = myObj.nextInt();
		
		int salarioLiquido = salario.salarioLiquido(salarioBruto);
		System.out.println("seu salario liquido e:  " + salarioLiquido);
		
		String declaracaoIR = salario.declararIR(salarioBruto);
		System.out.println(declaracaoIR);
	}
}
