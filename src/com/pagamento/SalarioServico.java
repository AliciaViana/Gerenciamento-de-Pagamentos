package com.pagamento;

public class SalarioServico {
	public int salarioLiquido(int salarioBruto) {
		int salarioLiquido = salarioBruto - 300;
		return salarioLiquido;
	}

	public String declararIR(int salarioBruto) {
		int rendimentoAnual = salarioBruto * 12;
		if (rendimentoAnual <= 24000)
			return "Você não tera que pagar imposto de renda ";
		else
			return "Você tera que pagar imposto de renda ";
	}
	public int horaTrabalhada(int salarioBruto) {
		int valorHora = salarioBruto / 220;
		return valorHora;
	}
}
