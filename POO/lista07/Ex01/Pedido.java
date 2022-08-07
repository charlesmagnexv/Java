/*
* 1) Crie um sistema de vendas de produtos, onde cada pedido poderá ter no máximo
    100 itens. O pedido deverá ser capaz de receber vários tipos produtos (superclasse),
    como frios, pães, doces, etc (subclasses). Ao final da entrada dos produtos o pedido
    deverá ter um método que calcule o valor total do pedido, onde ele varrerá o vetor de
    produtos somando seus valores. Desafio: implementar a quantidade de produtos vezes
    seu valor, no cálculo do valor do pedido. Implemente as classes para do modelo
    abaixo:
*/
import java.util.Scanner;
public class Pedido {
    public static void main(String[] args){
        Scanner leia = new Scanner( System.in );
        Scanner leiaStr = new Scanner( System.in );
        int quantidade;
        String resposta;
        double total = 0, totalPao = 0, totalDoce = 0, totalFrios = 0, qtdFrios = 0, qtdPao = 0, qtdDoce = 0;
        do{
            System.out.print( "Informe quantidade de itens: " );
            quantidade = leia.nextInt();
            if( quantidade <= 0 || quantidade > 100 ){
                System.out.println( "Valor invalido!" );
            }
        }while( quantidade <= 0 || quantidade > 100 );
        Produto p1[] = new Produto[quantidade];
        for( int i = 0 ; i < quantidade ; i ++ ){
            do {
                System.out.print("Digite o tipo do produto[frios, pao, doce]:");
                resposta = leiaStr.nextLine();
                if (resposta.equalsIgnoreCase("frios")) {
                    p1[i] = new Frios();
                    System.out.print( "Entre com o preco do produto: " );
                    totalFrios += leia.nextDouble();
                    p1[i].setQuantidade( 1 );

                } else if (resposta.equalsIgnoreCase("pao")) {
                    p1[i] = new Paozinho();
                    System.out.print( "Entre com o preco do produto: " );
                    totalPao += leia.nextDouble();
                    p1[i].setQuantidade( 1 );

                } else if (resposta.equalsIgnoreCase("doce")) {
                    p1[i] = new Doce();
                    System.out.print( "Entre com o preco do produto: " );
                    totalDoce += leia.nextDouble();
                    p1[i].setQuantidade( 1 );

                } else {
                    System.out.println( "Resposta Invalida! digite novamente!" );
                }
            }while( !resposta.equalsIgnoreCase( "frios" ) && !resposta.equalsIgnoreCase("pao" ) && !resposta.equalsIgnoreCase( "doce" ) );
        }
        System.out.println( "\nPreco total dos produtos: " + ( totalFrios + totalDoce + totalPao ) + "\n" );
        for( int i = 0 ; i < quantidade ; i ++ ){
			if( p1[i] instanceof Frios ){
				qtdFrios ++;
			}else if( p1[i] instanceof Paozinho ){
				qtdPao ++;
			}else{
				qtdDoce ++;
			}
		}
		System.out.print( "Quantidade de frios: " + qtdFrios + "\n" );
		System.out.print( "Quantidade de paes: " + qtdPao  + "\n" );
		System.out.print( "Quantidade de doces: " + qtdDoce + "\n" );
    }
}
