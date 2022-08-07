/*
2 - Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em Java que
gere um número real aleatório entre 0 e 100. Esse número deve ser armazenado em uma variável do
tipo double chamada numeroAleatorio. Por fim, exiba o valor dessa variável na saída padrão.
Marco Vinicius dos Santos de Paula
 */


public class ExibeNumeroAleatorio {
	
	public static void main (String[] args) {
		double numeroAleatorio = (Math.random () *100 ) + 1;
		System.out.println(numeroAleatorio);
	}
}

