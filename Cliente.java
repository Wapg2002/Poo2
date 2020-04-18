package Parcial;

public class Cliente extends Persona{
	
	private String inmuebleEscogido;
	
	Cliente(String name, String age, String numberphone, int id, String inmuebleEscogido){
		
		super(name, age, numberphone, id);
		
		this.inmuebleEscogido = inmuebleEscogido;
		
	}

}
