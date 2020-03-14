package Taller_Colecciones;

public abstract class Persona {
	
	protected String name;
	
	protected Integer age;
	
	protected Integer documento;
	
	protected String id;
	
	protected String pass;
	
	protected Integer nota;
	
	protected String id2;
	
	protected String pass2;
	
	public Persona() {
		
	}
	
	public Persona(String name, Integer age, Integer documento, String id, String password){
		
		this.name = name;
		
		this.age = age;
		
		this.documento = documento;
		
		this.id = id;
		
		this.pass = password;
		
	}
	
	public abstract String acceso(String id, String password);
	
	public abstract String getName();
	
	public abstract void setName(String name);
	
	public abstract Integer getAge();
	
	public abstract void setAge(Integer age);
	
	public abstract Integer getDocumento();
	
	public abstract void setDocumento(Integer documento);
	
	public abstract String getId();
	
	public abstract void setId(String id);
	
	public abstract String getPass();
	
	public abstract void setPass(String pass);
	
}
