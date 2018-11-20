package kruskal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaDeAdyacencia {

	private List<List<Arista>> listaAdyacencia;

	public ListaDeAdyacencia(int cantDeNodos) {
		listaAdyacencia =  new ArrayList<>();
		
		for (int i = 0; i < cantDeNodos; i++) {
			listaAdyacencia.add(new LinkedList<>());
		}
	}
	
	public void setArista(int nodoOrigen, int nodoDestino, int peso) {
		if(nodoOrigen == nodoDestino)
			return;
		
		//Pensado para no dirigido
		this.listaAdyacencia.get(nodoOrigen).add(new Arista(nodoOrigen, nodoDestino, peso));
		this.listaAdyacencia.get(nodoOrigen).add(new Arista(nodoDestino, nodoOrigen, peso));
	}
	
	public List<Arista> getAristasDeNodo(int nodo){
		return this.listaAdyacencia.get(nodo);
	}

}
