/*
 * Ex52.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 52) Solicite um número inteiro ao usuário e informe se ele pertence a sequência de Fibonacci ou não.
 * 
 * 
 */

import java.util.Scanner;
public class Ex52 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,fibonacci=0,termoAnterior=0,fAtual=1,contador=0;
		System.out.print("Entre com um numero: ");
		numero = leia.nextInt();
		for(int i=1;i<=50;i++){
			fibonacci=termoAnterior+fAtual;
			fAtual=termoAnterior;
			termoAnterior=fibonacci;
			if(numero==fibonacci){
				contador++;
				break;
			}
			fibonacci=0;
		}
		if(contador==1){
			System.out.println("O numero "+numero+" pertence a sequencia de Fibonacci!");
		}else{
			System.out.println("O numero "+numero+" NAO pertence a sequencia de Fibonacci!");
		}
	}
}

