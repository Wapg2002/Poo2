package Parcial;

public class Persona {
	
	private String nombre;
	
	private String edad;
	
	private String numeroTelefono;
	
	private int documento;
	
	public Persona(String name, String age, String numberphone, int id) {
		
		this.nombre = name;
		
		this.edad = age;
		
		this.numeroTelefono = numberphone;
		
		this.documento = id;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	

}
