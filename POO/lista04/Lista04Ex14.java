/*
 * Lista04Ex14.java
 * 
 * 14) [POO-027] Crie um programa que solicite ao usuário um número inteiro. Através de um método que 
	receba esse número inteiro como parâmetro de entrada, inverta dígito-a-dígito e retorne um valor inteiro
	com o número invertido.
	Entrada: 					Saída:
	Entre com um número: 12 	>> 21
	Entre com um número: 430 	>> 34
	Entre com um número: -27 	>> -72
	Entre com um número: 0 		>> 0
 * 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class Lista04Ex14 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.print( "Entre com um numero: " );
		numero = leia.nextInt();
		System.out.println();
		System.out.print( ">> " + inverterNumero( numero ) );
	}
	static int inverterNumero( int numero ){
		String numeroStr = Integer.toString( numero );
		StringBuilder numeroInvertido = new StringBuilder( numeroStr );
		return Integer.parseInt( numeroInvertido.reverse().toString() );
	}
}

