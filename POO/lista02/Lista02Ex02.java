/*
 * Lista02Ex02.java
 * 
 * 2) [POO-002] Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é zero ou não. A 
 * verificação deve ser feita através de um método que receba um valor (parâmetro de entrada) e informe se ele é
 * zero ou não através de um retorno do tipo boolean. Declare como: boolean isZero ( double num ).
	Entrada: Saída:
	Entre com um número: -1,48 O número -1.48 não é zero.
	Entre com um número: 3,14 O número 3.14 não é zero.
	Entre com um número: 0 O número 0.0 é zero.
 * 
 * 
 */

import java.util.Scanner;
public class Lista02Ex02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double numero;
		System.out.println("Entre com um numero: ");
		numero = leia.nextDouble();
		if(validacao(numero)){
			System.out.println("O numero " + numero + " eh zero");
		}else{
			System.out.println("O numero " + numero + " nao eh zero");
		}
	}
	static boolean validacao(double numero){
		if(numero == 0){
			return true;
		}else{
			return false;
		}
	}
}

