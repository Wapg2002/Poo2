package Taller_Colecciones;

import javax.swing.JOptionPane;

public class Estudiante extends Persona{
	
	protected String semestre;
	
	protected Integer materiasMatriuladas;
	
	public Estudiante() {
		
		
		
	}
	
	public Estudiante(String semestre, Integer mm, String n, Integer a, Integer d, String id, String pass) {
		
		super(n, a, d, id, pass);
		
		this.semestre = semestre;
		
		this.materiasMatriuladas = mm;
		
	}
	
	public String acceso(String id, String pass) {
		
		id2 = JOptionPane.showInputDialog(null, "Usuario: ", "Bienvenido, digita tu usuario por favor", JOptionPane.INFORMATION_MESSAGE);
		
		pass2 = JOptionPane.showInputDialog(null, "Contraseña: ", "Digita tu contraseña por favor.", JOptionPane.INFORMATION_MESSAGE);
		
		if(id2.equals(id) && pass2.equals(pass)) {
			
			return "Bienvenido.";
			
		}
		
		else {
			
			return "Usuario o contraseña incorrectos.";
			
		}
		
	}

	public String getSemestre() {
		
		return semestre;
		
	}

	public void setSemestre(String semestre) {
		
		this.semestre = semestre;
		
	}

	public Integer getMateriasMatriuladas() {
		
		return materiasMatriuladas;
		
	}

	public void setMateriasMatriuladas(Integer materiasMatriuladas) {
		
		this.materiasMatriuladas = materiasMatriuladas;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public Integer getAge() {
		
		return this.age;
		
	}
	
	public void setAge(Integer a) {
		
		this.age = a;
		
	}
	
	public Integer getDocumento() {
		
		return this.documento;
		
	}
	
	public void setDocumento(Integer d) {
		
		this.documento = d;
		
	}
	
	public String getId() {
		
		return this.id;
		
	}
	
	public void setId(String id){
		
		this.id = id;
		
	}
	
	public String getPass() {
		
		return this.pass;
		
	}
	
	public void setPass(String p){
		
		this.pass = p;
		
	}

}
