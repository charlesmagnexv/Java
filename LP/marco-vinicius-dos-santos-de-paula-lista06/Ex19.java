/*
 * Ex19.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 19) O mesmo exercício anterior, mas agora não será informado o 
 * número de mercadorias em estoque. Então o funcionamento deverá ser da seguinte forma: ler 
 * o valor da mercadoria e perguntar MAIS MERCADORIAS (S/N)?. Ao final, imprimir o valor total 
 * em estoque e a média de valor das mercadorias em estoque.
 * 
 * 
 */

import java.util.Scanner;
public class Ex19 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		double soma = 0, valorMercadoria;
		int i=0;
		String validacao = "S";
		do{
			i++;
			System.out.print("Digite o valor da mercadoria "+i+" : ");
			valorMercadoria = leia.nextDouble();
			soma += valorMercadoria;
			System.out.print("MAIS MERCADORIAS (S/N)?: ");
			validacao = leiaStr.nextLine();
		}while(validacao.equals("S"));
		System.out.println("Valor total em estoque: "+soma);
		System.out.println("Media do valor total em estoque: "+soma/i);
	}
}

