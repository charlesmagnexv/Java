/*
 * EstadosLampada.java
 * 
 * Marco Vinicius dos Santos de Paula
 * In Corde Jesu, semper;
 * 
 * 3) Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.
 * 
 * 
 */


public class EstadosLampada {
	private int estado;
	public EstadosLampada(){
		estado = 1;
	}
	public void setEstado( int estado ){
		if( estado > 3 || estado < 0 ){
			throw new IllegalArgumentException( "Valor informado nao corresponde a nenhum estado da lampada" );
		}else if( this.estado == estado ){
			throw new IllegalArgumentException( "A lampada ja esta no estado informado" );
		}else{
			this.estado = estado;
		}
	}
	public int hasEstado(){
		return estado;
	}
	@Override
	public String toString(){
		if( hasEstado() == 1 ){
			return "A lampada esta apagada";
		}else if( hasEstado() == 2 ){
			return "A lampada esta acessa";
		}else{
			return "A lampada esta a meia-luz";
		}
	}
}

