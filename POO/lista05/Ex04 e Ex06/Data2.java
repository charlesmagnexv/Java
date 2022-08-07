/*
 * Data2.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 *6) Utilizando o exercício 4 (Data) criar uma classe testadora de datas, onde o haverá duas 
 * datas e métodos para comparar se são iguais, qual é a maior e a menor e a diferença, em dias, 
 * de uma para a outra. Supor anos de 365 dias.
 * 
 * 
 */


public class Data2 extends Data{
	Data data1, data2;//Atributos do tipo "Data" que herdam atributos que estão dentro da classe Data; data1 e data2 são tipo referencia.
	public Data2(){
	}
	public boolean testarDatas(){
		if( data2.toString().equals(data1.toString()) ){
			return true;
		}else{
			return false;
		}
	}
	public int diferencaAno(){
		if( data1.getAno() > data2.getAno() ){
			if( data1.getMes() < data2.getMes() ){
				return data1.getAno() - data2.getAno() - 1;
			}else{
				return data1.getAno() - data2.getAno();
			}
		}else{
			if( data1.getMes() > data2.getMes() ){
				return data2.getAno() - data1.getAno() - 1;
			}else{
				return -1 * ( data1.getAno() - data2.getAno() );
			}
		}
	}
	public int diferencaMes(){
		if( data1.getAno() > data2.getAno() ){
			if( data1.getMes() < data2.getMes() ){
				return ( 12 - data2.getMes() ) + data1.getMes();
			}else{
				return data1.getMes() - data2.getMes();
			}
		}else{
			if( data1.getMes() > data2.getMes() ){
				return ( 12 - data1.getMes() ) + data2.getMes(); 
			}else{
				return -1 * ( data1.getMes() - data2.getMes() );
			}
		}
	}
	@Override
	public String toString(){
		return "Data 01: " + data1 + "\n" +
			   "Data 02: " + data2;
	}
}

