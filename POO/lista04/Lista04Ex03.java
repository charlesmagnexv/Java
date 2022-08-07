/*
 * Lista04Ex03.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 3) [POO-016] ===Desafio!!!=== Semelhante ao exercício [POO-015] Crie um programa de conversão de temperaturas, mas 
 * agora com três possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A saída deverá ser as outras duas temperaturas, 
 * exemplo: entrada em Celsius, a saída deve ser em Fahrenheit e Kelvin. O processo de conversão deverá ser feito através de um ou mais 
 * métodos que recebe a temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos de conversão, 
 * utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser executado enquanto o usuário desejar.
	Entrada:                                                Saída:                           Cálculo:
	[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: M
	Opção Inválida!
	[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C                                     [ F = (9 * 0 / 5) + 32 ]
	Entre com a temperatura: 0                              F: 32 e K: 273                   [ K = 0 + 273 ]
	[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
	[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
	[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: C                                     [ F = (9 * 100 / 5) + 32 ]
	Entre com a temperatura: 100                            F: 212 e K: 373                  [ K = 100 + 273 ]
	[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: F                                     [ C = 5 * (86 – 32) / 9 ]
	Entre com a temperatura: 86                             C: 30 e F: 303                   [ F = (9 * 100 / 5) + 32 ]
	[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: K                                     [ C = 0 – 273 ]
	Entre com a temperatura: 0                              C: -273 e F: -459,4              [ F = (9 * (0 – 273) / 5) + 32 ]
	[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: S
 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		double celsius, fa, kelvin;
		String pergunta = "";
		do{
			System.out.print("[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: ");
			pergunta = leiaStr.nextLine().toLowerCase();
			if( !pergunta.equals( "s" ) && !pergunta.equals("f") && !pergunta.equals("c") && !pergunta.equals("k") ){
				System.out.println( "\nEntrada Invalida\n" );
			}else if( pergunta.equals( "f" ) ){
				System.out.println( "Entre com uma temperatura: " );
				fa = leia.nextDouble();
				double vetorFahrenheitParaCelsiusKelvin[] = fahrenheitParaCelsiusKelvin( fa );
				System.out.println( "\nC: " + vetorFahrenheitParaCelsiusKelvin[0] + " e K: " + vetorFahrenheitParaCelsiusKelvin[1] + "\n" );
			}else if( pergunta.equals( "c" ) ){
				System.out.println( "Entre com uma temperatura: " );
				celsius = leia.nextDouble();
				double vetorCelsiusParaFahrenheitKelvin[] = celsiusParaFahrenheitKelvin( celsius );
				System.out.println( "\nF: " + vetorCelsiusParaFahrenheitKelvin[0] + " e K: " + vetorCelsiusParaFahrenheitKelvin[1] + "\n" );
			}else if( pergunta.equals( "k" ) ){
				System.out.println( "Entre com uma temperatura: " );
				kelvin = leia.nextDouble();
				double vetorKelvinParaCelsiusFahrenheit[] = kelvinParaCelsiusFahrenheit( kelvin );
				System.out.println( "\nC: " + vetorKelvinParaCelsiusFahrenheit[0] + " e F: " + vetorKelvinParaCelsiusFahrenheit[1] + "\n" );
			}
		}while( !pergunta.equals("s") );
	}
	static double[] fahrenheitParaCelsiusKelvin( double fa ){
		double vetorFahrenheitParaCelsiusKelvin[] = new double[2];
		vetorFahrenheitParaCelsiusKelvin[0] = ( 5 * ( fa - 32) ) / 9;
		vetorFahrenheitParaCelsiusKelvin[1] = ( vetorFahrenheitParaCelsiusKelvin[0] + 273 );
		return vetorFahrenheitParaCelsiusKelvin;
	}
	static double[] celsiusParaFahrenheitKelvin( double celsius ){
		double vetorCelsiusParaFahrenheitKelvin[] = new double[2];
		vetorCelsiusParaFahrenheitKelvin[0] = ( ( 9 * celsius ) / 5 ) + 32;
		vetorCelsiusParaFahrenheitKelvin[1] = ( celsius + 273 );
		return vetorCelsiusParaFahrenheitKelvin;
	}
	static double[] kelvinParaCelsiusFahrenheit( double kelvin ){
		double vetorKelvinParaCelsiusFahrenheit[] = new double[2];
		vetorKelvinParaCelsiusFahrenheit[0] = ( kelvin - 273 );
		vetorKelvinParaCelsiusFahrenheit[1] = ( ( 9 * vetorKelvinParaCelsiusFahrenheit[0] ) / 5 ) + 32;
		return vetorKelvinParaCelsiusFahrenheit;
	}
}

