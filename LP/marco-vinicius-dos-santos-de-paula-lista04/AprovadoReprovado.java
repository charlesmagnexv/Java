/*
 * AprovadoReprovado.java
 * Marco Vinicius dos Santos de Paula
 * 2 - Crie um arquivo chamado AprovadoReprovado.java. Solicite ao usuário que digite o valor para
a variável nota. O programa deve testar o valor digitado pelo usuário e caso não esteja na faixa de 0
até 10 (inclusos), exibir a mensagem VALOR INVALIDO e finalizer o programa. Caso o valor
digitado seja válido, exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6
ou APROVADO caso contrário.
 */

import java.util.Scanner;
public class AprovadoReprovado {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int nota;
		System.out.print("Digite a nota do aluno: ");
		nota = leia.nextInt();
		if(nota < 0 || nota > 10){
			System.out.println("Valor invalido!!");
		}else{
			if(nota < 6)System.out.println("REPROVADO");
			else System.out.println("APROVADO");
		}
	}
}

