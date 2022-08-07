/*
 * Lista04Ex02.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 2) [POO-015] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. 
 * O usuário deverá escolher se o valor de temperatura que será informado em Celsius ou em Fahrenheit. Se a 
 * entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de conversão 
 * deverá ser feito através de um ou mais métodos que recebem a temperatura fornecida como parâmetro de entrada e retorne a 
 * temperatura convertida. Para os cálculos de conversão, utilize as fórmulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. 
 * O programa deve ser executado enquanto o usuário desejar.
 * 
		Entrada: 									Saída: 				Cálculo:
		[C]Celsius, [F] Fahrenheit e [S] Sair: V
		Opção Inválida!
		[C]Celsius, [F] Fahrenheit e [S] Sair: C
		Entre com a temperatura: 0 					Saída: 32 			[ F = (9 * 0 / 5) + 32 ]
		[C]Celsius, [F] Fahrenheit e [S] Sair: S
		[C]Celsius, [F] Fahrenheit e [S] Sair: S
		[C]Celsius, [F] Fahrenheit e [S] Sair: C
		Entre com a temperatura: 100 				Saída: 212 			[ F = (9 * 100 / 5) + 32 ]
		[C]Celsius, [F] Fahrenheit e [S] Sair: F
		Entre com a temperatura: 86 				Saída: 30 			[ C = 5 * (86 – 32) / 9 ]
		[C]Celsius, [F] Fahrenheit e [S] Sair: S
 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		double celsius, fa;
		String pergunta = "";
		do{
			System.out.print("[C]Celsius, [F] Fahrenheit e [S] Sair: ");
			pergunta = leiaStr.nextLine().toLowerCase();
			if( !pergunta.equals("s") && !pergunta.equals("f") && !pergunta.equals("c") ){
				System.out.println( "\nEntrada Invalida\n" );
			}else if( pergunta.equals("f") ){
				System.out.println( "Entre com uma temperatura: " );
				fa = leia.nextDouble();
				System.out.println( "\nSaida: " + fahrenheitParaCelsius( fa ) + "\n" );
			}else if( pergunta.equals("c") ){
				System.out.println( "Entre com uma temperatura: " );
				celsius = leia.nextDouble();
				System.out.println( "\nSaida: " + celsiusParaFahrenheit( celsius ) + "\n" );
			}
		}while( !pergunta.equals("s") );
	}
	static double fahrenheitParaCelsius( double fa ){
		return ( 5 * ( fa - 32 ) ) / 9;
	}
	static double celsiusParaFahrenheit( double celsius ){
		return ( (9 * celsius) / 5 ) + 32;
	}
}

