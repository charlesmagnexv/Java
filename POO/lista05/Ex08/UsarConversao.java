/*
 * UsarConversao.java
 * 
 */

import java.util.Scanner;
public class UsarConversao {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		ConversaoDeUnidadesDeArea conversor = new ConversaoDeUnidadesDeArea();
		double medida;
		int opcao;
		do{
			System.out.println( "1) Converter metros para pes" );		
			System.out.println( "2) Converter pes para metros" );		
			System.out.println( "3) Converter milha para acre" );		
			System.out.println( "4) Converter acre para pe" );
			System.out.print( "Digite sua opcao: " );		
			opcao = leia.nextInt();
			System.out.print( "Informe a medida: " );
			conversor.setMedida( leia.nextInt() );
			if( opcao == 1 ){
				System.out.println( "Resultado: " + conversor.metroParaPe() + " pes" );
			}else if( opcao == 2 ){
				System.out.println( "Resultado: " + conversor.peParaMetro() + " metros" );
			}else if( opcao == 3 ){
				System.out.println( "Resultado: " + conversor.milhaParaAcre() + " acres" );
			}else if( opcao == 4 ){
				System.out.println( "Resultado: " + conversor.acreParaPe() + " pes" );
			}else{
				System.out.println( "\n\nConversao Invalida!!!\n\n" );
			}
		}while( opcao > 4 || opcao < 1 );
	}
}

