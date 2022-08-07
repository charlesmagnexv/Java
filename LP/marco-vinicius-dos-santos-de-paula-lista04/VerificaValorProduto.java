/*
 * VerificaValorProduto.java
 * Marco Vinicius dos Santos de Paula
 * 4 - Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usuário que digite os valores
para as variáveis precoProduto1 e precoProduto2. O programa deve testar o valor digitado pelo
usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), exibir a
mensagem VALOR INVALIDO e finalizer o programa. Caso os valores digitados sejam válidos,
exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
exibida.
 */

import java.util.Scanner;
public class VerificaValorProduto {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int precoProduto1, precoProduto2;
		System.out.print("Digite o preco do produto1: ");
		precoProduto1 = leia.nextInt();
		System.out.print("Digite o preco do produto2: ");
		precoProduto2 = leia.nextInt();
		if(precoProduto1 < 1 || precoProduto2 < 1 || precoProduto1 > 1000 || precoProduto2 >1000){
			System.out.println("VALOR INVALIDO");
		}else{
			if(precoProduto1 < precoProduto2){
				System.out.println("O produto 1 eh o mais barato");
			}else{
				if(precoProduto2 < precoProduto1){
					System.out.println("O produto 2 eh o mais barato");
				}else{
					System.out.println("Os precos dos dois produtos sao iguais");
				}
			}
		}
	}
}

