/*
 * Lista02Ex03.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 3) [POO-003] Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número tipo double. Após 
 * verifique se o número é positivo, negativo ou zero. As verificações devem ser feitas através de métodos.
	Entrada: Saída:
	Entre com um número: -1,48 O número -1.48 é negativo.
	Entre com um número: 3,14 O número 3.14 é positivo.
	Entre com um número: 0 O número 0.0 é zero.
	Referências: POO-001 e POO-002.
 * 
 * 
 */

import java.util.Scanner;
public class Lista02Ex03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double numero;
		System.out.println("Entre com um numero: ");
		numero = leia.nextDouble();
		System.out.println("O numero " + numero + " eh " + validador(numero));
	}
	static String validador( double numero ){
		String retorno = "";
		if( numero > 0 ){
			retorno = "positivo";
		}else{
			if( numero < 0 ){
				retorno = "negativo";
			}else{
				retorno = "zero";
			}
		}
		return retorno;
	} 
}

