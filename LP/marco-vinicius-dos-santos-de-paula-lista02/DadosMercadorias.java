/*
10 - Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa
que declare variáveis para representar os seguintes dados: número do pedido, código do produto,
quantidade e valor total da compra. Inicialize essas variáveis com valores apropriados. Por fim,
exiba os valores armazenados.
Faculdade 
* Marco Vinicius dos Santos de Paula
 */


public class DadosMercadorias {
	
	public static void main (String[] args) {
		int numeroPedido = 145, codigoProduto = 24859437;
		short quantidade = 5;
		float valor = 89.45F;
		System.out.println("Numero do pedido: " + numeroPedido);
		System.out.println("Codigo do produto: " + codigoProduto);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor: " + valor);
	}
}

