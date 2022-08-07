/*
 * CalculoSalario.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */

import java.util.Scanner;
public class CalculoSalario {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int horas,horaAMais;
		double valorHora, horaExtra;
		System.out.print("Digite quantas horas trabalhou: ");
		horas = leia.nextInt();
		System.out.print("Digite o valor da hora: ");
		valorHora = leia.nextDouble();
		if(horas < 0){
			System.out.println("Valor invalido!!");
		}else{
			if(valorHora < 0){
				System.out.println("Valor invalido");
			}else{
				if(horas <= 160){
					System.out.println("\n\nSalario: "+(horas*valorHora)+" reais");
				}else{
					horaAMais = horas - 160;
					horaExtra = horaAMais*(valorHora+((valorHora*50)/100.0));
					System.out.println("\n\nSalario: "+((160*valorHora)+horaExtra)+" reais");
				}
			}
		}
	}
}

