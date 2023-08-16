package Principal;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Funções representam um processamento 
		 * ou processo;
		 * o que identifica uma função são os parenteses
		 * System.out.println() é um exemplo de função/procedimento
		 */
		mostrarMensagem();
		/*String funcaoRecebida = */mostrarMensagemComParametro(33);
		System.out.println(calcular());
		int recebeCalcular = calcular();
		System.out.println("Recebeu: " + recebeCalcular);

		System.out.println("Resultado da soma: " + somar(10, 20));

		int x = 10;
		int y = 100;

		System.out.println("Nova soma: " + somar(x, y));

		int a = 50;
		int b = 50;

		System.out.println("Nova soma: " + somar(b, a));
	}

	static void mostrarMensagem() {
		System.out.println("Minha primeira função");
	}
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade é: " + idade);
	}

	static int calcular() {
		int x = 10;
		int y = 5;
		return x + y;	
	}

	static int somar(int x, int y) {
		return x + y;

	
	
	
	
	
	
	
	
	
	}
	

}
