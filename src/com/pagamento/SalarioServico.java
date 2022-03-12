package com.pagamento;

public class SalarioServico {
	public int calcularSalarioLiquido(int salarioBruto) {
		return salarioBruto - 200;
	}

	public String validaIr(int salarioBruto) {
		int rendimentoAnual = salarioBruto * 12;
		if (rendimentoAnual <= 24000)
			return "Você não tera que pagar imposto de renda ";
		else
			return "Você tera que pagar imposto de renda ";
	}
	public int calcularSalarioHora(int salarioBruto) {
		return salarioBruto / 200;
	}

	public int calcularInss(int salarioBruto) {
		if (salarioBruto <= 1100) {
			return ((salarioBruto * 7) / 100);
			
		} else if (salarioBruto > 1100 && salarioBruto <= 2000) {
				// 1100 < salarioBruto <= 2000
			return ((salarioBruto * 9)/100);
						
		} else if (salarioBruto > 2200 && salarioBruto <= 3000) {
			return ((salarioBruto * 12)/100);
						
		} else {
			return ((salarioBruto * 14)/100);
		}
	}
}
