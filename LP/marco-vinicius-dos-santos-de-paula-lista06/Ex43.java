/*
 * Ex43.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 43) Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial desse número.
 * 
 * 
 */

import java.util.Scanner;
public class Ex43 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,contador=1,fatorial=1,fAnterior;
		while(contador<=7){
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			fAnterior=numero;
			if(numero==0){
				System.out.println("Fatorial de "+numero+" = 1");
			}else{
				for(int i = numero-1;i>=1;i--){
					fatorial=i*fAnterior;
					fAnterior=fatorial;
				}
				System.out.println("Fatorial de "+numero+" = "+fatorial);
			}
			
			contador++;
		}
	}
}

