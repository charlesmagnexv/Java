/*
5 – Crie um arquivo chamado CopiaValores.java. Implemente um programa em Java que declare
uma variável do tipo float chamada numero. Essa variável deve ser inicializada com o valor 3.14.
Depois, declare outra variável do tipo float chamada numeroCopia. Essa variável deve ser
inicializada com uma cópia do valor armazenado na variável numero. Por fim, exiba os valores
armazenados nessas variáveis na saída padrão.
*  Marco Vinicius dos Santos de Paula
*/


public class CopiaValores {
	
	public static void main (String[] args) {
		float numero = 3.14f, numeroCopia;
		numeroCopia = numero;
		System.out.println(numero);
		System.out.println(numeroCopia);
	}
}

