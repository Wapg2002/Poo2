package Taller_Colecciones;

import javax.swing.JOptionPane;

public class Profesor extends Persona{
	
	protected Integer Clases_dictadas;
	
	protected Integer numEstudents;
	
	public Profesor() {
		
	}
	
	public Profesor(Integer cd, Integer ne, String n, Integer a, Integer d, String id, String pass) {
		
		super(n, a, d, id, pass);
		
		this.Clases_dictadas = cd;
		
		numEstudents = ne;
		
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

	public Integer getClases_dictadas() {
		
		return this.Clases_dictadas;
		
	}

	public void setClases_dictadas(Integer cd) {
		
		this.Clases_dictadas = cd;
		
	}

	public Integer getnumEstudents() {
		
		return this.numEstudents;
		
	}

	public void setnumStudents(Integer ne) {
		
		this.numEstudents = ne;
		
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
	
	public void establecer_nota(Integer n) throws NoMetaCosas{
		
		if(n > -1 && n < 6) {
		
			this.nota = n;
			
		}
		
		else {
			
			throw new NoMetaCosas("Estimado profesor la nota ingresada se encuentra fuera del rango establecido. Recuerde que el rango de notas va desde 0 hasta 5");
			
		}
		
	}

}
