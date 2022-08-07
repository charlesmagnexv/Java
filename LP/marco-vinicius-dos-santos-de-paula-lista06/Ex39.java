/*
 * Ex39.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 39) Escreva um programa que solicite ao usuário a quantidade de termos, 
 * validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo 
 * o valor ZERO, finalizar o programa, caso seja positivo imprimir a sequência de 
 * termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50 termos. 
 * Apresentar a soma desta sequência no final.
 * 
 * 
 */

import java.util.Scanner;
public class Ex39 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, i=1,c=10,contador=1;
		double soma=0;
		System.out.print("Insira um numero: ");
		numero = leia.nextInt();
		if(numero>0){
			if(numero==1){
				System.out.print("1/1");
				soma=1;
			}else{
				c=numero;
				while(contador<=numero){
					if(c>0 && i<=numero){
						System.out.print(i+"/"+c+" ");
						soma += ((double)i/c);
						i++;
						c--;
						contador++;
					}
					if(c>0 && i<=numero){
						System.out.print("+ "+i+"/"+c+", ");
						soma += ((double)i/c);
						i++;
						c--;
					}
					contador++;
				}
			}
			System.out.println("\nSoma dos termos digitados: "+soma);
		}else if(numero<0){
			while(numero<0){
				System.out.print("Insira um numero: ");
				numero = leia.nextInt();
			}
			if(numero>0){
				if(numero==1){
				System.out.print("1/1");
				soma=1;
				}else{
					c=numero;
					while(contador<=numero){
						if(c>0 && i<=numero){
							System.out.print(i+"/"+c+" ");
							soma += ((double)i/c);
							i++;
							c--;
							contador++;
						}
						if(c>0 && i<=numero){
							System.out.print("+ "+i+"/"+c+", ");
							soma += ((double)i/c);
							i++;
							c--;
						}
						contador++;
					}
				}
				System.out.println("\nSoma dos termos digitados: "+soma);
			}else{
				System.out.println("FIm do programa!");
			}
		}else{
			System.out.println("FIm do programa!");
		}
	}
}

