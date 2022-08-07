/*
 * Ex22.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 22) Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
- o maior preço lido;
- a média aritmética dos preços dos produtos.
 * 
 * 
 */

import java.util.Scanner;
public class Ex22 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo,codigoMaior=0,controle=0;
		double preco,maior=0,soma=0;
		for(int i=1;i<=3;i++){
			System.out.print("Digite o codigo do produto: ");
			codigo = leia.nextInt();
			do{
				System.out.print("Digite o preco do produto: ");
				preco = leia.nextDouble();
			}while(preco<=0);
			if(i==1){
				maior = preco;
				codigoMaior = codigo;
			}else{
				if(preco>maior){
					maior = preco;
					codigoMaior = codigo;
				}
			}
			soma+=preco;
			controle++;
		}
		System.out.println("O produto de maior preco eh o produto de codigo: "+codigoMaior+" e preco: "+maior+"R$");
		System.out.println("A media do preco dos produtos: "+(soma/(controle)));
	}
}

