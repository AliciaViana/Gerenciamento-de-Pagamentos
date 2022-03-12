package com.pagamento;

public class SalarioServico {
	public int carregaSalarioLiquido(int salarioBruto) {
		return salarioBruto - 200;
	}

	public String validaPagamentoIR(int salarioBruto) {
		int rendimentoAnual = salarioBruto * 12;
		// estrutura de condição
		if (rendimentoAnual <= 24000)
			return "Você não tera que pagar imposto de renda ";
		else
			return "Você tera que pagar imposto de renda ";
	}
	
	public int carregaSalarioHora(int salarioBruto) {
		return salarioBruto / 200;
	}

	public int carregaPagamentoINSS(int salarioBruto) {
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
