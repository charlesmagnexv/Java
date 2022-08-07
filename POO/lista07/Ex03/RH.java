/*
 * RH.java
 * 3) Uma empresa de recursos humanos, especializada em recolocações no mercado
	(vagas de emprego), solicita a criação de um sistema para informatizar suas ações.
	Assim, ela deseja cadastrar os candidatos com seu nome (String) e idade (int). Os
	candidatos podem ser desempregados, que tem o tempo em meses (int) que não
	trabalha ou empregados, que tem o nome da empresa (String), onde está atualmente.
	As vagas tem a descrição (String) e o salário oferecido (double). As vagas podem ser
	de estágio, que em o tempo em meses (int) ou contrato, que pode ser temporário ou
	não (boolean). Criar um programa em Java para cadastrar os candidatos
	(desempregados ou empregados) e cadastrar as vagas (estágio ou contrato). O
	sistema deve ser capaz de cadastrar os candidatos para as vagas.
	Criar uma classe para criar a empresa de RH (main). Nesta classe deverá haver um
	menu para cadastrar candidatos, cadastrar vagas, cadastrar candidato x vaga, listar
	vagas por tipo, mostrar quantidade de candidatos e sua situação e os candidatos x
	vaga.
	 * 
 * 
 */

import java.util.Scanner;
public class RH {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner( System.in );
		Scanner leiaStr = new Scanner( System.in );
		Candidato c1[] = new Candidato[100];
		Vaga v1[] = new Vaga[100];
		int resposta = 0, contador = 0, contadorVaga = 0, contadorCandidato = 0;
		boolean validador;
		do{
			System.out.println( "\n1) Cadastrar Candidatos" );
			System.out.println( "2) Cadastrar Vagas" );
			System.out.println( "3) Cadastrar Candidato X Vaga" );
			System.out.println( "4) Listar Vagas por Tipo" );
			System.out.println( "5) Mostrar Quantidade de Candidatos e Situacao" );
			System.out.println( "6) Candidatos por Vagas" );
			System.out.println( "7) Sair" );
			System.out.print( "Digite sua opcao: " );
			resposta = leia.nextInt();
			switch( resposta ){
				case 1:
					do{
						System.out.print( "Deseja cadastrar candidato empregado[1] ou desepregado[2]?: " );
						resposta = leia.nextInt();
						if( resposta == 1 ){
							System.out.println();
							c1[contadorCandidato] = new CandidatoEmpregado();
							System.out.print( "Digite o nome do candidato: " );
							( (CandidatoEmpregado)c1[contadorCandidato] ).setNome( leiaStr.nextLine() );
							System.out.print( "Digite a idade do candidato: " );
							( (CandidatoEmpregado)c1[contadorCandidato] ).setIdade( leia.nextInt() );
							System.out.print( "Digite o nome da empresa atual do candidato: " );
							(  (CandidatoEmpregado)c1[contadorCandidato] ).setNomeEmpresa( leiaStr.nextLine() );
							contadorCandidato ++;
						}else if( resposta == 2 ){
							System.out.println();
							c1[contadorCandidato] = new CandidatoDesempregado();
							System.out.print( "Digite o nome do candidato: " );
							( (CandidatoDesempregado)c1[contadorCandidato] ).setNome( leiaStr.nextLine() );
							System.out.print( "Digite a idade do candidato: " );
							( (CandidatoDesempregado)c1[contadorCandidato] ).setIdade( leia.nextInt() );
							System.out.print( "Digite o tempo(em meses) de desemprego do candidato: " );
							( (CandidatoDesempregado)c1[contadorCandidato] ).setTempoDesemprego( leia.nextInt() );
							contadorCandidato ++;
						}else{
							System.out.println( "\nResposta Invalida!\n" );
						}
					}while( resposta != 1 && resposta != 2 );
					
					break;
				case 2:
					do{
						System.out.print( "Deseja cadastrar estagio ou contrato?[1 = estagio/2 = contrato]:" );
						resposta = leia.nextInt();
						if( resposta == 1 ){
							System.out.println();
							v1[contadorVaga] = new Estagio();
							System.out.print( "Digite a descricao da vaga: " );
							( (Estagio)v1[contadorVaga] ).setDescricao( leiaStr.nextLine() );
							System.out.print( "Digite o salario da vaga: " );
							( (Estagio)v1[contadorVaga] ).setSalario( leia.nextDouble() );
							System.out.print( "Digite o tempo da vaga: " );
							( (Estagio)v1[contadorVaga] ).setTempo( leia.nextInt() );
							contadorVaga ++;
						}else if( resposta == 2 ){
							System.out.println();
							v1[contadorVaga] = new Contrato();
							System.out.print( "Digite a descricao da vaga: " );
							( (Contrato)v1[contadorVaga] ).setDescricao( leiaStr.nextLine() );
							System.out.print( "Digite o salario da vaga: " );
							( (Contrato)v1[contadorVaga] ).setSalario( leia.nextDouble() );
							System.out.print( "Temporario[1 = sim/ 2 = nao]: " );
							( (Contrato)v1[contadorVaga] ).setTemporario( temporario( leia.nextInt() ) );
							contadorVaga ++;
						}else{
							System.out.println( "Resposta invalida, digite novamente!" );
						}
					}while( resposta != 1 && resposta != 2 );
					break;
				case 3:
					do{
						System.out.print( "Deseja cadastrar candidato empregado[1] ou desepregado[2]?: " );
						resposta = leia.nextInt();
						if( resposta == 1 ){
							System.out.println();
							c1[contadorCandidato] = new CandidatoEmpregado();
							System.out.print( "Digite o nome do candidato: " );
							( (CandidatoEmpregado)c1[contadorCandidato] ).setNome( leiaStr.nextLine() );
							System.out.print( "Digite a idade do candidato: " );
							( (CandidatoEmpregado)c1[contadorCandidato] ).setIdade( leia.nextInt() );
							System.out.print( "Digite o nome da empresa atual do candidato: " );
							(  (CandidatoEmpregado)c1[contadorCandidato] ).setNomeEmpresa( leiaStr.nextLine() );
							System.out.print( "Digite o numero da vaga desejada pelo candidato: " );
							( (CandidatoEmpregado)c1[contadorCandidato] ).setVagaDesejada( leia.nextInt() );
							contadorCandidato ++;
						}else if( resposta == 2 ){
							System.out.println();
							c1[contadorCandidato] = new CandidatoDesempregado();
							System.out.print( "Digite o nome do candidato: " );
							( (CandidatoDesempregado)c1[contadorCandidato] ).setNome( leiaStr.nextLine() );
							System.out.print( "Digite a idade do candidato: " );
							( (CandidatoDesempregado)c1[contadorCandidato] ).setIdade( leia.nextInt() );
							System.out.print( "Digite o tempo(em meses) de desemprego do candidato: " );
							( (CandidatoDesempregado)c1[contadorCandidato] ).setTempoDesemprego( leia.nextInt() );
							System.out.print( "Digite o numero da vaga desejada: " );
							( (CandidatoDesempregado)c1[contadorCandidato] ).setVagaDesejada( leia.nextInt() );
							contadorCandidato ++;
						}else{
							System.out.println( "Resposta Invalida!" );
						}
					}while( resposta != 1 && resposta != 2 );
					break;
				case 4:
					System.out.println( "\nLista de Vagas: \n" );
					for( int i = 0 ; v1[i] != null ; i ++ ){
						System.out.println( (i+1) + " - " + v1[i].getDescricao() );
					}
					System.out.println();
					break;
				case 5:
					int qtdCandidatosEmpregados = 0, qtdCandidatosDesempregados = 0;
					System.out.println( "\nLista de Candidatos: \n" );
					System.out.println( "Total de candidatos: " + contadorCandidato );
					for( int i = 0 ; c1[i] != null ; i ++ ){
						if( c1[i] instanceof CandidatoEmpregado ){
							qtdCandidatosEmpregados ++;
						}else{
							qtdCandidatosDesempregados ++;
						}
					}
					System.out.println( "Total de candidatos empregados: " + qtdCandidatosEmpregados );
					System.out.println( "Total de candidatos desempregados: " + qtdCandidatosDesempregados );
					System.out.println();
					break;
				case 6:
					System.out.println( "\nCandidatos x Vagas:\n" );
					for( int i = 0 ; ( c1[i] != null ) ; i ++ ){
						if( c1[i].hasVagaDesejada() != 0 ){
							System.out.println( "Candidato: " + c1[i].hasNome() + " -- Vaga: " + c1[i].hasVagaDesejada() );
						}
					}
					System.out.println();
					break;
				case 7:
					System.out.println( "Sistema encerrado" );
					break;
				default:
					System.out.println( "Entrada Invalida!" );
					break;
			}
		}while( resposta != 7 || contadorVaga == 99 || contadorCandidato == 99 );
	}
	public static boolean temporario( int simNao ){
		if( simNao == 1 ){
			return true;
		}else if( simNao == 2 ){
			return false;
		}else{
			System.out.println( "\nEntrada Invalida!\n" );
			return false;
		}
	}
}

