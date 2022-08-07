/*
 * Ex54.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 54) Solicite ao usuário o termo inicial e o termo final da sequência de Fibonacci (intervalo fechado) e imprima o resultado.
 * 
 */

import java.util.Scanner;
public class Ex54 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int inicio,fim, fibonacci=0,termoAnterior=0,fAtual=1;
		System.out.print("Digite o termo inicial: ");
		inicio = leia.nextInt();
		System.out.print("Digite o termo final: ");
		fim = leia.nextInt();
		if(inicio==0){
			System.out.print("0 ");
		}
		for(int i=1;i<=30;i++){
			fibonacci=termoAnterior+fAtual;
			fAtual=termoAnterior;
			termoAnterior=fibonacci;
			if(fibonacci>=inicio&&fibonacci<=fim){
				System.out.print(fibonacci+" ");
			}
			if(fibonacci>=fim){
				break;
			}
			fibonacci=0;
		}
	}
}

