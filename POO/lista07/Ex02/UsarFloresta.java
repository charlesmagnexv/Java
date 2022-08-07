/*
 * 2) Se a mãe natureza pudesse criar um programa em Java para criar plantas de uma
	floresta e as plantas sendo conhecidas por seus nomes e espécie, podendo ser de 3
	tipos: 
	arvore, que pode ou não ser frutifera; 
	Flor, que tem a cor dos suas flores; e 
	Carnívora, que pode ou não ser venenosa. 
	Como seria a criação de uma floresta? 
	Criar uma classe para criar uma floresta (main). Nesta classe deverá haver um menu
	para cadastrar plantas, listar plantas, mostrar quantidade de plantas na floresta e
	mostrar a quantidade de plantas de cada tipo (arvore, Flor e Carnivora).
 *  
 * 
 */

import java.util.Scanner;
public class UsarFloresta {
    public static void main( String[] args ){
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner( System.in );
		Floresta f1[] = new Floresta[100];
		int resposta, contador = 0, contArvore = 0, contFlor = 0, contCarnivora = 0;
		do{
			System.out.println( "\n1) Cadastrar arvore" );
			System.out.println( "2) Cadastrar flor" );
			System.out.println( "3) Cadastrar carnivora" );
			System.out.println( "4) Listar plantas" );
			System.out.println( "5) Mostrar quatidade de plantas" );
			System.out.println( "6) Mostrar quantidade de cada tipo de planta" );
			System.out.println( "7) Sair\n" );
			System.out.print( "Digite sua opcao: " );
			resposta = leia.nextInt();
			System.out.println();
			switch( resposta ){
				case 1:
					f1[contador] = new Arvore();
					System.out.print( "Digite o nome da planta: " );
					f1[contador].setNome( leiaStr.nextLine() );
					System.out.print( "Digite a especie da planta: " );
					f1[contador].setEspecie( leiaStr.nextLine() );
					do{
						System.out.print( "A arvore eh frutifera?[sim = 1/nao = 2]: " );
						resposta = leia.nextInt();
						if( resposta == 1 ){
							( ( Arvore )f1[contador] ).setFrutifera( true );
						}else{
							( ( Arvore )f1[contador] ).setFrutifera( false );
						}
					}while( resposta != 1 && resposta != 2 );
					contArvore ++;
					contador ++;
					break;
				case 2:
					f1[contador] = new Flor();
					System.out.print( "Digite o nome da planta: " );
					f1[contador].setNome( leiaStr.nextLine() );
					System.out.print( "Digite a especie da planta: " );
					f1[contador].setEspecie( leiaStr.nextLine() );
					System.out.print( "Digite a cor da planta: " );
					( (Flor)f1[contador] ).setCor( leiaStr.nextLine() );
					contFlor ++;
					contador ++;
					break;
				case 3:
					f1[contador] = new Carnivora();
					System.out.print( "Digite o nome da planta: " );
					f1[contador].setNome( leiaStr.nextLine() );
					System.out.print( "Digite a especie da planta: " );
					f1[contador].setEspecie( leiaStr.nextLine() );
					do{
						System.out.print( "A planta eh venenosa?[sim = 1/nao = 2]: " );
						resposta = leia.nextInt();
						if( resposta == 1 ){
							( (Carnivora)f1[contador] ).setVeneno( true );
						}else if( resposta == 2 ){
							( (Carnivora)f1[contador] ).setVeneno( false );
						}else{
							System.out.println( "Valor invalido, digite novamente!" );
						}
					}while( resposta != 1 && resposta != 2 );
					contCarnivora ++;
					contador ++;
					break;
				case 4:
					System.out.println();
					for( int i = 0 ; i < contador ; i ++ ){
						System.out.println( "Planta " + ( i + 1 ) + ": \n" +
											"Nome - " + f1[i].getNome() + "\n" +
											"Especie - " + f1[i].getEspecie() + "\n" +
											( ( f1[i] instanceof Arvore )?( "Arvore " + ( ( ( Arvore )f1[i] ).getFrutifera()?"frutifera":"sem frutos" ) ):
											(f1[i] instanceof Flor)?"Flor " + ( ( ( Flor )f1[i] ).getCor().toLowerCase() ):
											"Carnivora " + ( ( (Carnivora)f1[i] ).getVeneno()?"venenosa":"nao venenosa." ) )
											);
					}
					System.out.println();
					break;
				case 5:
					System.out.println( "\nQuantidade de Plantas.\n" );
					System.out.println( "Total de " + contador + " planta(s)\n");
					break;
				case 6:
					System.out.println( "\nQuantidade de Cada Tipo de Planta.\n" );
					System.out.println( "Total de " + contArvore + " arvore(s)");
					System.out.println( "Total de " + contFlor + " flor(es)");
					System.out.println( "Total de " + contCarnivora + " carnivora(s)");
					System.out.println();
					break;
				case 7:
					System.out.println( "\nAPLICACAO ENCERRADA!\n" );
					break;
				default:
					System.out.println( "\nENTRADA INVALIDA!\n" );
					break;
			}
		}while( resposta != 7 || contador == 99 );
    }
}
