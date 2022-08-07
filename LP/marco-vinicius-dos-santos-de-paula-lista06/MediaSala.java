/*
 * MediaSala.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 
 * 11) Escreva um programa em Java para ler o número de alunos existentes em uma turma 
 * e, após isto, ler as notas destes alunos, calcular e escrever a média aritmética dessas notas lidas.
 */
//arrumar problema do tipo de variável. Arrumar problema do número negativo
import java.util.Scanner;
public class MediaSala {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeroAlunos=0,numeroNotas,nota,somaAluno=0,mediaAluno, somaSala=0;
		System.out.print("Digite a quantidade de alunos na sala: ");
		numeroAlunos = leia.nextInt();
		System.out.println("Digite quantas notas cada aluno tem: ");
		numeroNotas = leia.nextInt();
		for(int c = 1; c <= numeroAlunos; c++){
			for(int i = 1; i <= numeroNotas; i++){
				System.out.print("Digite a nota "+i+" do aluno "+c+" : ");
				nota = leia.nextInt();
				somaAluno += nota;
			}
			mediaAluno = somaAluno/numeroNotas;
			System.out.print("Media do aluno "+c+" : "+mediaAluno);
			somaSala += somaAluno;
		}
		System.out.println("\n\nMedia das notas da sala: "+(somaSala/numeroAlunos));
	}
}

