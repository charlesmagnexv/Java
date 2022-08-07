/*
 * UsarMonitor.java
 * 
 * 
 */

import java.util.Scanner;
public class UsarMonitor {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		ModeloDeComputador pc01 = new ModeloDeComputador();
		int cpu, ram, disco, monitor;
		System.out.print( "Opcoes de processadores: 1600Mhz a R$700, 1800Mhz a R$830, 1900Mhz a R$910: " );
		//cpu = leia.nextInt();
		pc01.setCpu( leia.nextInt() ); 
		System.out.print( "Opcoes de memoria: 1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350: " );
		//ram = leia.nextInt();
		pc01.setRam( leia.nextInt() );
		System.out.print( "Opcoes de disco rigido: 500 GB a R$300, 1 TB a R$420, 2TB a R$500: " );
		//disco = leia.nextInt();
		pc01.setDisco( leia.nextInt() );
		System.out.print( "Opcoes de monitor: 15 polegadas a R$320, 17 polegadas a R$520: " );
		//monitor = leia.nextInt();
		pc01.setMonitor( leia.nextInt() );
		System.out.println( "\nPreco total: " + pc01.preco() + "\n" );
	}
}

