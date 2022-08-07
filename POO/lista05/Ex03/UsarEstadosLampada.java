/*
 * UsarEstadosLampada.java
 * 
 * 
 */

import java.util.Scanner;
public class UsarEstadosLampada {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner (System.in);
		Scanner leia = new Scanner (System.in);
		EstadosLampada lampada1 = new EstadosLampada();
		int resposta = 1;
		String acessa, apagada, meiaLuz;
		acessa = apagada = meiaLuz = " ";
		do{
			System.out.println("1) Apagar Lampada ");
			System.out.println("2) Acender Lampada ");
			System.out.println("3) Meia-Luz ");
			System.out.println("4) Status ");
			System.out.println("5) Sair ");
			System.out.println("Selecione uma opcao: ");
			resposta = leia.nextInt();
			if( resposta == 1 ){
				lampada1.setEstado( resposta );
				System.out.println( "\nA lampada foi apagada!\n" );
			}else if( resposta == 2 ){
				lampada1.setEstado( resposta );
				System.out.println( "\nA lampada foi acessa\n" );
			}else if( resposta == 3 ){
				lampada1.setEstado( resposta );
				System.out.println( "\nA lampada foi colocada em meia-luz!\n" );
			}else if( resposta == 4 ){
				System.out.println( "\n" + lampada1 + "\n" );
			}
		}while( resposta != 5 );
	}
}

