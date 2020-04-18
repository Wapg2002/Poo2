package Parcial;

public class Propietario extends Persona{
	
	private String inmueble;
	
	private String direccionInmueble;
	
	private String valorInmueble;
	
	private String ArrendarInmueble;
	
	private String VenderInmueble;
	
	private String precioArriendo;
	
	private String id;
	
	Propietario(String name, String age, String numberphone, int id, String inmueble, String direccionInmueble, String valorInmueble, String valorDeAlquiler,String ArrendarInmueble,
			String VenderInmueble, String Id){
		
		super(name, age, numberphone, id);
		
		this.direccionInmueble = direccionInmueble;
		
		this.valorInmueble = valorInmueble;
		
		this.ArrendarInmueble = ArrendarInmueble;
		
		this.VenderInmueble = VenderInmueble;
		
		this.inmueble = inmueble;
		
		this.precioArriendo = valorDeAlquiler;
		
		this.id = Id;
		
	}
	
	Propietario(String name, String age, String numberphone, int id, String inmueble, String direccionInmueble, String valorInmueble, String ArrendarInmueble,
			String VenderInmueble, String Id){
		
		this(name, age, numberphone, id, inmueble, direccionInmueble, valorInmueble, "No se alquila", ArrendarInmueble,
				VenderInmueble, Id);
	}
	
	public String getDireccionInmueble() {
		return direccionInmueble;
	}

	public void setDireccionInmueble(String direccionInmueble) {
		this.direccionInmueble = direccionInmueble;
	}

	public String getValorInmueble() {
		return valorInmueble;
	}

	public void setValorInmueble(String valorInmueble) {
		this.valorInmueble = valorInmueble;
	}

	public String getArrendarInmueble() {
		return ArrendarInmueble;
	}

	public void setArrendarInmueble(String arrendarInmueble) {
		ArrendarInmueble = arrendarInmueble;
	}

	public String getVenderInmueble() {
		return VenderInmueble;
	}

	public void setVenderInmueble(String venderInmueble) {
		VenderInmueble = venderInmueble;
	}

	public String getInmueble() {
		return inmueble;
	}

	public void setInmueble(String inmueble) {
		this.inmueble = inmueble;
	}

	public String getPrecioArriendo() {
		return precioArriendo;
	}

	public void setPrecioArriendo(String precioArriendo) {
		this.precioArriendo = precioArriendo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
