/*
 * SalarioVendedor.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 10) Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 
mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
 */

import java.util.Scanner;
public class SalarioVendedor {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double salarioFixo, valorDasVendas, valorTot;
		System.out.print("Digite o salario fixo do vendedor: ");
		salarioFixo = leia.nextDouble();
		System.out.print("Digite o valor das vendas: ");
		valorDasVendas = leia.nextDouble();
		if(salarioFixo < 0 || valorDasVendas < 0){
			System.out.println("Valor invalido!!");
		}else{
			if(valorDasVendas <= 1500.00){
				System.out.println("Salario total: "+(salarioFixo+((valorDasVendas*3)/100)));
			}else{
				valorTot = valorDasVendas - 1500;
				valorTot = (valorTot*5)/100;
				System.out.println("Salario total: "+(salarioFixo+((1500*3)/100)+valorTot));
			}
		}
	}
}

