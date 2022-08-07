/*
 * Xadrez.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
iniciar em um dia e terminar no dia seguinte.
 */

import java.util.Scanner;
public class Xadrez {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int horaInicio, horaFim;
		System.out.print("Digite o horario de inicio: ");
		horaInicio = leia.nextInt();
		System.out.print("Digite a horario de fim: ");
		horaFim = leia.nextInt();
		if(horaInicio < 0 || horaInicio > 23 || horaFim < 0 || horaFim > 23){
			System.out.println("Valor invalido!!!");
		}else{
			if(horaFim > horaInicio){
				System.out.println("Duracao do jogo: "+(horaFim-horaInicio)+" hora(s)");
			}else{
				System.out.println("Duracao do jogo: "+(horaFim-horaInicio+24)+" hora(s)");
			}
		}
	}
}

