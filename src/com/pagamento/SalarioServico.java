package com.pagamento;

public class SalarioServico {
	public int metodoCalculosalario(int salarioBruto) {
		int salarioLiquido = salarioBruto - 200;
		return salarioLiquido;
	}

	public String metodoCalcularIR(int salarioBruto) {
		int rendimentoAnual = salarioBruto * 12;
		if (rendimentoAnual <= 24000)
			return "Você não tera que pagar imposto de renda ";
		else
			return "Você tera que pagar imposto de renda ";
	}

	public int metodoCalcularhora(int salarioBruto) {
		int valorHora = salarioBruto / 220;
		return valorHora;
	}

	public int metodoCalcularinss(int salarioBruto) {
		if (salarioBruto <= 1100) {
			return ((salarioBruto * 7) / 100);
			
		} else if (salarioBruto > 1100 && salarioBruto <= 2000) {
				// 1100 < salarioBruto <= 2000
			int valorinss = (salarioBruto * 9) / 100;
			return valorinss;
			
		} else if (salarioBruto > 2200 && salarioBruto <= 3000) {
			int valorinss = (salarioBruto * 12)/100;
			return valorinss;
			
		} else {
			int valorinss = (salarioBruto * 14)/100;
			return valorinss;
			
		}
		

	}
}
