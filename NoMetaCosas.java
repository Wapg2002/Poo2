package Taller_Colecciones;

public class NoMetaCosas extends Exception{
	
	protected String Mensaje;
	
	public NoMetaCosas(String m) {
		
		this.Mensaje = m;
		
	}
	
	public String getMensaje(){
		
		return this.Mensaje;
		
	}

}
