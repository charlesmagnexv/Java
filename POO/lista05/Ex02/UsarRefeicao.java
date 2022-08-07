/*
 * UsarRefeicao.java
 * 
 * 
 */

import java.util.Scanner;
public class UsarRefeicao {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		Refeicao refeicao = new Refeicao();
		int numeroPessoas = 0;
		double valorConta = 0;
		String gorjeta = " ";
		do{
			System.out.print( "Digite a quatidade de pessoas: " );
			numeroPessoas = leia.nextInt();
			if( numeroPessoas <= 0 ) System.out.println( "\nDigite o valor novamente\n" );
		}while( numeroPessoas <= 0 );
		do{
			System.out.print( "Digite o valor da conta: " );
			valorConta = leia.nextDouble();
			if( valorConta <= 0 ) System.out.println( "\nDigite o valor novamente\n" );
		}while( valorConta <= 0 );
		do{
			System.out.print( "Sera paga a gorjeta para o gaarcom S/N : " );
			gorjeta = leiaStr.nextLine().toLowerCase();
			if( !gorjeta.equals("s") && !gorjeta.equals("n") ) System.out.println( "\nDigite novamente\n" );
		}while( !gorjeta.equals("s") && !gorjeta.equals("n") );
		refeicao.setNumeroPessoas( numeroPessoas );
		refeicao.setValorConta( valorConta );
		if( gorjeta.equals("s") ){
			refeicao.setGorjeta(true);
		}else{
			refeicao.setGorjeta(false);
		}
		System.out.println("\n" + refeicao + "\n");
	}
}

