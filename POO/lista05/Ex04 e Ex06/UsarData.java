/*
 * UsarData.java
 *
 * 
 * 
 */

import java.util.Scanner;
public class UsarData {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Data d1 = new Data();
		int dia, mes, ano;
		System.out.print( "Digite o dia: " );
		dia = leia.nextInt();
		System.out.print( "Digite o mes: " );
		mes = leia.nextInt();
		System.out.print( "Digite o ano: " );
		ano = leia.nextInt();
		d1.setDia(dia);
		d1.setMes(mes);
		d1.setAno(ano);
		System.out.println( "\n" + d1.exibirData() + "\n" );
	}
}

