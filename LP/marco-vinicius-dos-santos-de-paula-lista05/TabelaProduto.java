/*
 * TabelaProduto.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * Desenvolva um programa em Java que receba o preço de um produto e seu código de
origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
valor final a ser pago pelo produto, conforme tabela a seguir:
 */

import java.util.Scanner;
public class TabelaProduto {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		double preco;
		System.out.print("Digite o codigo do produto: ");
		codigo = leia.nextInt();
		System.out.print("Digite o preco do produto: ");
		preco = leia.nextDouble();
		if(preco < 0){
			System.out.println("Valor invalido do preco");
		}else{
			if(codigo == 1){
				System.out.println("Preco total: "+(preco+(preco*10/100))+"\t Frete: "+(preco*10/100)+"\t Regiao de procedencia: Norte");
			}else if(codigo == 2 || codigo == 5 || codigo == 9){
				System.out.println("Preco total: "+(preco+(preco*3/100))+"\t Frete: "+(preco*3/100)+"\t Regiao de procedencia: Sul");
			}else if(codigo == 3 || (codigo >=10 && codigo <= 15) ){
				System.out.println("Preco total: "+(preco+(preco*1.2/100))+"\t Frete: "+(preco*1.2/100)+"\t Regiao de procedencia: Leste");
			}else if(codigo == 7 || codigo == 20){
				System.out.println("Preco total: "+(preco+(preco*7.3/100))+"\t Frete: "+(preco*7.3/100)+"\t Regiao de procedencia: Oeste");
			}else{
				System.out.println("Preco total: "+(preco+(preco*22.2/100))+"\t Frete: "+(preco*22.2/100)+"\t Regiao de procedencia: Importado");
			}
		}
	}
}

