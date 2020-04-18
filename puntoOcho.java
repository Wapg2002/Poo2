package Parcial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class puntoOcho {
	
	static int nContrato = 100;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String op;
		
		Propietario p1 = new Propietario("Izuku Midoriya", "14", "3046525746", 1000125894, "Apartamento", "Cerca a la U.A", "700000000", "40000000","Si", "Si", "1001");
		Propietario p2 = new Propietario("Tenya Lida", "17", "3046525255", 105228258, "Casa", "Mz A C 12B", "85500000", "No", "Si", "2002");
		Propietario p3 = new Propietario("Endeavor", "39", "30145686885", 533523268, "Aparta-Estudio", "Mz B2 Transversal 3", "No se vende", "10000000","Si", "no", "3003");
		Propietario p4 = new Propietario("All Might", "40", "3529546248", 26484268, "Casa quinta", "Barrio lo h�roes", "1000000", "12000000","Si", "Si", "4004");
		Propietario p5 = new Propietario("Beast Jeanist", "29", "30465223646", 264264862, "Casa", "Barrio jeanist", "No se vende", "8000000", "Si", "no", "5005");
		Propietario p6 = new Propietario("Edgehost", "27", "52648299598", 200289568, "Apartamento", "Mz H c12A", "706850000", "no", "Si", "6006");
		
		List<Propietario> propietarios = new ArrayList();
		propietarios.add(p1);
		propietarios.add(p2);
		propietarios.add(p3);
		propietarios.add(p4);
		propietarios.add(p5);
		propietarios.add(p6);
		
		List<Cliente> clientes = new ArrayList();
			
			op = JOptionPane.showInputDialog(null, "Selecciona una opci�n por favor: \n1)Comprar un inmueble \n2)Alquilar un inmueble", "Bienvenido a la inmobiliaria PLUS ULTRA", JOptionPane.INFORMATION_MESSAGE);
			
			if(op.equals("1")) {
				
				System.out.println("Inmuebles en venta");
				
				for(int i = 0; i < propietarios.size(); i++) {
					
					if(propietarios.get(i).getVenderInmueble().equalsIgnoreCase("si")) {
						
						System.out.println("Caracteristicas de inmueble: \nPropietario: "+propietarios.get(i).getNombre()+"\nTipo de inmueble: "+propietarios.get(i).getInmueble()+"\nPrecio del inmueble: "+propietarios.get(i).getValorInmueble()+"\nValor del alquiler: "+propietarios.get(i).getPrecioArriendo()+"\nDirecc�n del inmueble: "+propietarios.get(i).getDireccionInmueble()+"\nTel�fono de contacto: "+propietarios.get(i).getNumeroTelefono()+"\nId del inmueble: "+propietarios.get(i).getId()+"\n****************");
						
					}
					
				}
				
				
				String id = JOptionPane.showInputDialog(null, "Ahora d�gita el id del inmueble de t� inter�s", "Selecci�n del inmueble", JOptionPane.INFORMATION_MESSAGE);
				
				for(int i = 0; i < propietarios.size(); i++) {
					
					if(propietarios.get(i).getId().equals(id)) {
						
						Propietario inmueble = propietarios.get(i);
						
						JOptionPane.showMessageDialog(null, "Bien antes de continuar te pediremos algunos datos. Presiona aceptar para contnuar");
						
						String nombre = JOptionPane.showInputDialog(null, "D�gita tu nombre por favor: ", "Registro de cliente", JOptionPane.INFORMATION_MESSAGE);
						
						String edad = JOptionPane.showInputDialog(null, "D�gita tu edad por favor: ", "Registro de cliente", JOptionPane.INFORMATION_MESSAGE);
						
						String numero = JOptionPane.showInputDialog(null, "D�gita tu n�mero de tel�fono por favor: ", "Registro de cliente", JOptionPane.INFORMATION_MESSAGE);
						
						try {
						
							System.out.print("D�gita tu n�mero de documento: ");
							
							int documento = in.nextInt();
							
							System.out.println("Sarini");
						 
							clientes.add(new Cliente(nombre, edad, numero, documento, id));
							
							System.out.println("****************Contrato de venta N.o: "+nContrato+"*******************");
							nContrato++;
							System.out.println("Tipo de inmueble a vender: "+inmueble.getInmueble()+"\nValor del inmueble: "+inmueble.getValorInmueble()+"\nDirecci�n del inmueble: "+inmueble.getDireccionInmueble()+"\nPropietario del inmueble: "+inmueble.getNombre()+"\nN�mero de documento: "+inmueble.getDocumento()
							+"\nNombre del compradorfd: "+nombre+"\nN.o de documento: "+documento);
						
						}
						
						catch(InputMismatchException e) {
							
							System.out.println("Aseg�rate de insertar �nicamente n�meros en t� n�mero de documento");
							
						}
						
					}
					
				}
				
				
			}
			
			else if(op.equals("2")) {
				
				System.out.println("Inmuebles en alquiler");
				
				for(int i = 0; i < propietarios.size(); i++) {
					
					if(propietarios.get(i).getArrendarInmueble().equalsIgnoreCase("si")) {
						
						System.out.println("Caracteristicas de inmueble: \nPropietario: "+propietarios.get(i).getNombre()+"\nTipo de inmueble: "+propietarios.get(i).getInmueble()+"\nPrecio del inmueble: "+propietarios.get(i).getValorInmueble()+"\nValor del alquiler: "+propietarios.get(i).getPrecioArriendo()+"\nDirecc�n del inmueble: "+propietarios.get(i).getDireccionInmueble()+"\nTel�fono de contacto: "+propietarios.get(i).getNumeroTelefono()+"\nId del inmueble: "+propietarios.get(i).getId()+"\n****************");
						
					}
					
				}
				
				String id = JOptionPane.showInputDialog(null, "Ahora d�gita el id del inmueble de t� inter�s", "Selecci�n del inmueble", JOptionPane.INFORMATION_MESSAGE);
				
				for(int i = 0; i < propietarios.size(); i++) {
					
					if(propietarios.get(i).getId().equals(id)) {
						
						Propietario inmueble = propietarios.get(i);
						
						JOptionPane.showMessageDialog(null, "Bien antes de continuar te pediremos algunos datos. Presiona aceptar para contnuar");
						
						String nombre = JOptionPane.showInputDialog(null, "D�gita tu nombre por favor: ", "Registro de cliente", JOptionPane.INFORMATION_MESSAGE);
						
						String edad = JOptionPane.showInputDialog(null, "D�gita tu edad por favor: ", "Registro de cliente", JOptionPane.INFORMATION_MESSAGE);
						
						String numero = JOptionPane.showInputDialog(null, "D�gita tu n�mero de tel�fono por favor: ", "Registro de cliente", JOptionPane.INFORMATION_MESSAGE);
						
						try {
						
							System.out.print("D�gita tu n�mero de documento: ");
							
							int documento = in.nextInt();
							
							System.out.println("Sarini");
						 
							clientes.add(new Cliente(nombre, edad, numero, documento, id));
							
							System.out.println("****************Contrato de arrendamiento N.o: "+nContrato+"*******************");
							nContrato++;
							System.out.println("Tipo de inmueble a arrendar: "+inmueble.getInmueble()+"\nValor de alquiler: "+inmueble.getPrecioArriendo()+"\nDirecci�n del inmueble: "+inmueble.getDireccionInmueble()+"\nPropietario del inmueble: "+inmueble.getNombre()+"\nN�mero de documento: "+inmueble.getDocumento()
							+"\nNombre del inquilino: "+nombre+"\nN.o de documento: "+documento);
						
						}
						
						catch(InputMismatchException e) {
							
							System.out.println("Aseg�rate de insertar �nicamente n�meros en t� n�mero de documento");
							
						}
						
					}
					
				}
				
			}
		
		
	}

}
