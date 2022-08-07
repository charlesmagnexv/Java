/*
 * Pessoa.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 1) Criar uma classe para representar uma Pessoa. A pessoa tem como características o nome, em
	formato String, a idade, em números inteiros e a altura, que pode ter casas decimais. Além dos
	métodos assessores de cada característica, temos um método que recebe como parâmetro de
	entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse
	método deve ser chamado por fazAniversario, não havendo retorno. Siga o diagrama abaixo para
	implementar a classe Pessoa. Após crie uma classe para testar. Observe os sinais de mais e de
	menos antes dos nomes dos atributos e métodos. Respeite-os!
 * 
 */


public class Pessoa {
	private int idade;
	private String nome;
	private double altura;
	public Pessoa() {
		idade = 20;
		nome = "Marco";
		altura = 2.5;
	}
	public void setIdade( int idade ){
		if( idade < 0 ){
			throw new IllegalArgumentException( "Idade invalida!" );
		}else{
			this.idade = idade;
		}
	}
	public void setNome( String nome ){
		this.nome = nome;
	}
	public void setAltura( double altura ){
		if( altura < 0 ){
			throw new IllegalArgumentException( " Altura invalida! " );
		}else{
			this.altura = altura;
		}
	}
	public int hasIdade(){
		return idade;
	} 
	public String hasNome(){
		return nome;
	}
	public double hasAltura(){
		return altura;
	}
	public void fazAniversario( boolean validador ){
		if( validador ){
			idade++;
		}
	}
}

