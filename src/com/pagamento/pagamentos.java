package com.pagamento;

import java.util.Scanner;

public class Pagamentos {

	public static void main(String[] args) {
		SalarioServico salario = new SalarioServico();
		Scanner myObj = new Scanner(System.in);

		System.out.println("digite seu salario: ");
		int salarioBruto = myObj.nextInt();

		int variavelCalcularsalariolqd = salario.metodoCalculosalario(salarioBruto);
		System.out.println("seu salario liquido e:  " + variavelCalcularsalariolqd);

		String variavelCalculoIR = salario.metodoCalcularIR(salarioBruto);
		System.out.println(variavelCalculoIR);

		int variavelCalcularhoraTrabalhada = salario.metodoCalcularhora(salarioBruto);
		System.out.println("Valor da Hora de trabalho é: " + variavelCalcularhoraTrabalhada);

		int contInss = salario.metodoCalcularinss(salarioBruto);
		System.out.println("Sua contribuição Inss e: " + contInss);

	}
}
