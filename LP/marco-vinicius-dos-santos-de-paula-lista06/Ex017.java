/*
 * Ex017.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 17) Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações 
 * de um aluno, calcule e imprima a média (simples) desse aluno. Só devem ser 
 * aceitos valores válidos durante a leitura (0 a 10) para cada nota. Ao final da 
 * execução a mensagem novo calculo s n deve ser apresentada. Se for respondido S
 * deve retornar e executar um novo cálculo, caso contrário deverá encerrar o programa.
 * 
 * 
 */

import java.util.Scanner;
public class Ex017 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		int nota1,nota2;
		String simOuNao = "S";
		do{
			System.out.print("Digite a nota da primeira avaliacao: ");
			nota1 = leia.nextInt();
			while(nota1 > 10 || nota1 < 0){
				System.out.print("Digite a nota da primeira avaliacao: ");
				nota1 = leia.nextInt();
			}
			System.out.print("Digite a nota da segunda avalicao: ");
			nota2 = leia.nextInt();
			while(nota2 > 10 || nota2 < 0){
				System.out.print("Digite a nota da primeira avaliacao: ");
				nota2 = leia.nextInt();
			}
			System.out.println("Media final: "+((nota1+nota2)/2.0));
			System.out.print("NOVO CALCULO (S/N)?: ");
			simOuNao = leiaStr.nextLine();
		}while(simOuNao.equals("S"));
		
	}
}

