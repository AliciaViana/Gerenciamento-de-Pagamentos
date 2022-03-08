package com.pagamento;

import java.util.Scanner;

public class pagamentos {

	public static void main(String[] args) {
		Salario salario = new Salario();
		Scanner myObj = new Scanner(System.in);
		System.out.println("digite seu salario: ");
		int salarioBruto = myObj.nextInt();
		
		int salarioLiquido = salario.salarioLiquido(salarioBruto);
		System.out.println(salarioLiquido);
	}
}
