package Principal;

import java.util.Scanner;

public class ConversorDeMoedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Atividade de conversão das moedas Real (R$) e Dóllar ($)
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor em real" + " para ser convertido em dólar: ");
		double real = sc.nextDouble();

		System.out.printf("\nValor em dolar é: %.2f", converterParaDolar(real));

		System.out.println("\nEntre com o valor em dolar" + " para ser convertido em real: ");
		double dolar = sc.nextDouble();

		System.out.printf("Valor em real é: %.2f", converterParaReal(dolar));

	}

	static double converterParaDolar(double real) {
		return real / 5.50;
	}

	static double converterParaReal(double dolar) {
		return 3.50 * dolar;

	}

}
