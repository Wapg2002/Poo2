package Taller_Colecciones;

public class Materia {
	
	protected String Materia;
	
	protected String Estudiante;
	
	protected String Sensei;
	
	protected Integer Nota;
	
	public Materia() {
		
		
		
	}
	
	public Materia(String s, Integer n){
		
		this.Sensei = s;
		
		this.Nota = n;
		
	}
	
	public Materia(String m, String e, String s) {
		
		Materia = m;
		
		Estudiante = e;
		
		Sensei = s;
		
	}

	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}

	public String getEstudiante() {
		return Estudiante;
	}

	public void setEstudiante(String estudiante) {
		Estudiante = estudiante;
	}
	
	
}
