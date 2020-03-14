package Taller_Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		Integer op, op1, op2, nota;
		
		boolean exito;
		
		
		
		Profesor p = new Profesor();
		
		Estudiante e = new Estudiante();
		
		Materia m = new Materia();
		
		Estudiante e1 = new Estudiante("Primero", 7, "Izuku Midoriya", 14, 1000125894, "MidoriyaOnefa", "OneForAll");
		Estudiante e2 = new Estudiante("Primero", 7, "Izuku Midoriya", 15, 2019103639, "MidoriyaOnefa", "OneForAll");
		Estudiante e3 = new Estudiante("Primero", 7, "Izuku Midoriya", 15, 1000125899, "MidoriyaOnefa", "OneForAll");
		Estudiante e4 = new Estudiante("Décimo", 3, "Mirio Togata", 18, 100125895, "MirioAtraviesa", "LemillioN");
		Estudiante e5 = new Estudiante("Décimo", 3, "Mirio Togata", 18, 1001258977, "MirioAtraviesa", "LemillioN");
		Estudiante e6 = new Estudiante("Décimo", 3, "Mirio Togata", 18, 200125895, "MirioAtraviesa", "LemillioN");

		List<Estudiante> heroes = new ArrayList<>();
		heroes.add(e1);
		heroes.add(e2);
		heroes.add(e3);
		heroes.add(e4);
		heroes.add(e5);
		heroes.add(e6);
		
		Profesor p1 = new Profesor(8, 150, "All Might", 40, 1000125897, "I_AM_Here", "United_States_Of_Smash");
		Profesor p2 = new Profesor(12, 180, "Ecto plams", 43, 202033698, "Ecto_320", "UA_66045");
		Profesor p3 = new Profesor(10, 130, "Cementoss", 44, 304012589, "Cementoss", "Plus_Ultra_:)");
		Profesor p4 = new Profesor(3, 70, "Present Mic", 40, 5552594, "Yeahhhhh", "Rock_And_Roll");
		Profesor p5 = new Profesor(8, 130, "Eraser Head", 35, 355852482, "Eraser550", "Contraseña");
		Profesor p6 = new Profesor(15, 200, "Midnight", 39, 28464851, "MiauMiau", "UA_for_ever_;)");
		
		List <Profesor> Senseis = new ArrayList<>();
		Senseis.add(p1);
		Senseis.add(p2);
		Senseis.add(p3);
		Senseis.add(p4);
		Senseis.add(p5);
		Senseis.add(p6);
		
		Materia m1 = new Materia("Introducción al heroísmo", "Izuku Midoriya", "All Might");
		Materia m2 = new Materia("Cáculo Integral", "Izuku Midoriya", "All Might");
		Materia m3 = new Materia("Entrenamiento del don", "Izuku Midoriya", "Eraser Head");
		Materia m4 = new Materia("Inglés", "Mirio Togata", "Cementoss");
		Materia m5 = new Materia("Rescate", "Mirio Togata", "No.13");
		Materia m6 = new Materia("Arte", "Mirio Togata", "Midnight");
		
		List<Materia> materias = new ArrayList<>();
		materias.add(m1);
		materias.add(m2);
		materias.add(m3);
		materias.add(m4);
		materias.add(m5);
		materias.add(m6);
		
		List<Materia> materiasSensei = new ArrayList<>();
		
		HashMap<String, Integer> notas = new HashMap<>();
		
		System.out.println(Senseis.get(0).getName());
		System.out.println(Senseis.get(1).getName());
		
		do {
			
			exito = false;
			
			 op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido, por favor digite su tipo de usuario acontinuación: \n1)Sensei. \n2)Estudiante", "Inicio de sesión. campus UA", JOptionPane.INFORMATION_MESSAGE));
			
			if(op == 1){
				
				p.id2 = JOptionPane.showInputDialog(null, "Por favor digita tu id acontinuación \nid: ", "Incio de sesión para Senseis", JOptionPane.INFORMATION_MESSAGE);
				
				p.pass2 = JOptionPane.showInputDialog(null, "Por favor digita tu contraseña acontinuación \nContraseña: ", "Incio de sesión para Senseis", JOptionPane.INFORMATION_MESSAGE);
							
					for(int i = 0; i < Senseis.size() && exito == false; i++) {
					
						System.out.println("a");
					
						if(Senseis.get(i).getId().equals(p.id2) && Senseis.get(i).getPass().equals(p.pass2)) {
							
						p.setName(Senseis.get(i).getName());
						
						JOptionPane.showMessageDialog(null, "Bienvenido Sensei "+Senseis.get(i).getName()+".", "Incio de sesión para Senseis", JOptionPane.INFORMATION_MESSAGE);
						
						exito = true;
						
						}
						
					}
				
					if(exito == false) {
						
						JOptionPane.showMessageDialog(null, "Lo sentimos, no encontramos tu usuario en nuestra base de datos.", "Incio de sesión para Senseis", JOptionPane.ERROR_MESSAGE);
						
					}
					
					if(exito == true) {
						
						//
						do {
					
							op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Sensei: "+p.getName()+". \nDigite la opción acontinuación por favor. \n1)Ingresar notas \n2)salir", "CAMPUS UA", JOptionPane.INFORMATION_MESSAGE));
							
							if(op1 == 1) {
			
								for(Materia ma: materias) {
							
									if(ma.Sensei.equals(p.getName())) {
										
										try {
											
											p.establecer_nota( Integer.parseInt(JOptionPane.showInputDialog(null, "Materia: "+ma.getMateria()+". \nAlumno: "+ma.getEstudiante()+". \nNota: ", "Sensei "+ma.Sensei+" digita la nota", JOptionPane.INFORMATION_MESSAGE)) ); 
								
											notas.put("Materia: "+ma.Materia+". Alumno: "+ma.getEstudiante(), p.nota);
											
										}
										
										catch(NoMetaCosas sensei) {
											
											JOptionPane.showMessageDialog(null, sensei.getMensaje(), "ERROR", JOptionPane.ERROR_MESSAGE);
											
										}
								
									}
								
								}
								
								Set<String> Keys = notas.keySet();
								
								
							
								for(String key: Keys) {
									
									Integer valor = notas.get(key);
									
									System.out.println("Nota: "+valor+" "+key);
								}
								
							
							}
						
						
						
						}while(op1 !=2);	
						//
					}
					
					exito = false;
						
			}
			
			else if(op == 2){
				
				e.id2 = JOptionPane.showInputDialog(null, "Por favor digita tu id acontinuación \nid: ", "Incio de sesión para estudiantes", JOptionPane.INFORMATION_MESSAGE);
				
				e.pass2 = JOptionPane.showInputDialog(null, "Por favor digita tu contraseña acontinuación \nContraseña: ", "Incio de sesión para estudiantes", JOptionPane.INFORMATION_MESSAGE);
							
					for(int i = 0; i < heroes.size() && exito == false; i++) {
					
						System.out.println("a");
					
						if(heroes.get(i).getId().equals(e.id2) && heroes.get(i).getPass().equals(e.pass2)) {
						
						JOptionPane.showMessageDialog(null, "Bienvenido estudiante "+heroes.get(i).getName()+".", "Incio de sesión para estudiantes", JOptionPane.INFORMATION_MESSAGE);
						
						e.setName(heroes.get(i).getName());
						
						exito = true;
						
						}
						
					}
				
					if(exito == false) {
						
						JOptionPane.showMessageDialog(null, "Lo sentimos, no encontramos tu usuario en nuestra base de datos.", "Incio de sesión para Estudiantes", JOptionPane.ERROR_MESSAGE);
						
					}
					
					if(exito == true) {
						
						op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Estudiante: "+e.getName()+". \nPor favor selecciona una opción: \n1)Ver notas. \n2)Salir. \nOpción: "));
						
						do {
							
							if(op2 == 1) {
								
								Set<String>values = notas.keySet();
								
								for(String key: values) {
									
									Integer valor = notas.get(key);
									
									if(key.contains(e.getName())) {
										
										System.out.println("aaaaa"+valor+", Nota: "+key);
										
									}
									
								}
								
								op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea continuar \n1)Si \n2)no", "Etudiantes", JOptionPane.INFORMATION_MESSAGE));
								
							}
							
						}while(op2 != 2);
						
					}
				
			}
			
			exito = false;
		
		}while(exito == false);
			
	}

}
