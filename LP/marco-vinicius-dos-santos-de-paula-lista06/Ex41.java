/*
 * Ex41.java
 * 
 * 41) Solicite ao usuário um número e mostre o fatorial do número informado.
 * 
 * 
 */

import java.util.Scanner;
public class Ex41 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,fAnterior,fAtual,fatorial=1;
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		fAnterior=numero;
		if(numero==0){
			System.out.println("O fatorial de "+numero+" eh: 1");
		}else{
			for(int i = numero-1;i>=1;i--){
				fatorial=i*fAnterior;
				fAnterior=fatorial;
			}
		}
		System.out.println("Fatorial de "+numero+" = "+fatorial);
	}
}

