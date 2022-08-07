/*
 * Ex23.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 23) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em Java 
 * para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população;
b) Média do número de filhos;
c) Maior salário dos habitantes;
d) Percentual de pessoas com salário menor que R$ 150,00.
 * 
 * 
 */

import java.util.Scanner;
public class Ex23 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeroFilhos,controle=0,i=0,salarioMenor=0;
		double salario,soma=0,soma2=0,maior=0;
		do{
			i++;
			System.out.print("Digite o numero de filhos: ");
			numeroFilhos = leia.nextInt();
			System.out.print("Digite o salario da familia: ");
			salario = leia.nextDouble();
			if(salario>=0){
				soma+=salario;
				soma2+=numeroFilhos;
				controle++;
				if(salario<150.00){
					salarioMenor++;
				}
			}
			if(i==1){
				maior=salario;
			}else{
				if(salario>maior){
					maior = salario;
				}
			}
		}while(salario>=0);
		System.out.println("Media de salario da populacao: "+(soma/controle)+"R$");
		System.out.println("Media de numero de filhos da populacao: "+(soma2/controle));
		System.out.println("Maior salario entre a populacao: "+(maior)+"R$");
		System.out.println("Numero de pessoas com salario menor do que 150,00R$: "+(salarioMenor));
	}
}

