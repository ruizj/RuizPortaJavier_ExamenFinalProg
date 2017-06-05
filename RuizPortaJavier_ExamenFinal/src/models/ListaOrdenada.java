package models;

import java.util.ArrayList;
import java.util.Comparator;

public class ListaOrdenada<E> extends ArrayList<E> {
	//VARIABLES PRIVADAS COMPARATOR Y UNA CONSTANTE PARA INDICAR EL TAMAÑO MAXIMO
	private Comparator comp;
	private final int max_size = 100;
	
	public ListaOrdenada(Comparator comp){
		super();
		this.comp = comp;
	}
	

}
