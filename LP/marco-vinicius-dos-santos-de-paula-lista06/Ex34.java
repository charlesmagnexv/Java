/*
 * Ex34.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 34) Escreva um programa que solicite ao usuário a quantidade de termos, validando a 
 * entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o 
 * programa, caso seja positivo imprimir a sequência de termos: 0, 1, 3, 6, 10, 15, ...
 * 
 * 
 */

import java.util.Scanner;
public class Ex34 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,i=0,numeroAnterior=0;
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		if(numero>0){
			while(i<=5){
				System.out.print((i+numeroAnterior)+", ");
				numeroAnterior=numeroAnterior+i;
				i++;
			}
			System.out.print("...");
		}else if(numero<0){
			while(numero<0){
				System.out.print("Digite um numero: ");
				numero = leia.nextInt();
			}
			if(numero>0){
				while(i<=5){
					System.out.print((i+numeroAnterior)+", ");
					numeroAnterior=numeroAnterior+i;
					i++;
				}
				System.out.print("...");
			}else{
				System.out.println("Fim do programa!");
			}
		}else{
			System.out.println("Fim do programa!");
		}
	}
}

