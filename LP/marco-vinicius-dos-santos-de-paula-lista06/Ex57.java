/*
 * Ex57.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 57) Solicite ao usuário a quantidade de termos da sequência de números perfeitos e imprima o resultado. (Atenção! Este processamento pode demorar MUITO)
 * 
 * 
 */

import java.util.Scanner;
public class Ex57 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidade,contador=0,soma=0;
		System.out.print("Digite a quantidade de termos: ");
		quantidade = leia.nextInt();
		if(quantidade<=0){
			System.out.println("Valores iguais ou menores do que 0 sao invalidos");
		}else{
			for(int c=1;c<=9000;c++){
				for(int i=1;i<c;i++){
					if(c%i==0){
						soma+=i;
					}
				}
				if(soma==c){
					System.out.print(c+" ");
					contador++;
				}
				if(contador>=quantidade){
					break;
				}
				soma=0;
		}
		}
	}
}

