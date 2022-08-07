/*
 * Casting.java
 * 2 - Crie um arquivo chamado Casting.java. Crie uma variável chamada numero1 do tipo long e
inicialize-a com o valor 2147483648L. Depois, crie uma variável chamada numero2 do tipo int e
copie o valor da variável numero1 para a variável numero2. Por fim, exiba, na saída padrão, os
valores dessas duas variáveis.
Marco Vinicius dos Santos de Paula
 */


public class Casting {
	
	public static void main (String[] args) {
		long numero1 = 2147483648L;
		int numero2 = (int)numero1;
		System.out.println("Variavel 1: "+numero1);
		System.out.println("Variavel 2: "+numero2);
	}
}

