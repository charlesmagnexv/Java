/*
 * UsarData2.java
 * 
 * 
 */

import java.util.Scanner;
public class UsarData2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Data2 data01 = new Data2();
		data01.data1 = new Data(29,05,2022);//data01 é um objeto cuja classe (Data2) herdou tais atributos da classe Data
		data01.data2 = new Data(28,04,2023);
		System.out.println("Datas Informadas: \n\n" + data01);
		if( data01.testarDatas() ){
			System.out.println( "\nAs datas sao IGUAIS!\n" );
		}else{
			System.out.println( "\nAs datas sao DIFERENTES!\n" );
			System.out.println( "Diferenca: " + data01.diferencaAno() + " ano(s), " + data01.diferencaMes() + " mes(es) " );
		}
	}
}
