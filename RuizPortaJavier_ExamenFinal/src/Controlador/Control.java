package Controlador;

import java.util.ArrayList;


import models.Coche;
import gui.MockUps;

public class Control {
private static ArrayList<Coche> listaCoche = new ArrayList<Coche>();
	
	public static boolean Buscar(String matricula){
		Coche co = Obtener(matricula);
		
		if(co == null){
			return false;
		}else{
			return true;
		}
	}
	
	public static void Aniadir( String matricula){
				
		listaCoche.add(new Coche(matricula, 0, 0, 0));
	}
	public static Coche Obtener(String matricula){
		Coche co = null;
		
		for(Coche i: listaCoche){
			if(i.getMatricula().equals(matricula)){
				co = i;
			}
		}
		
		return co;
	}
	
	

}
