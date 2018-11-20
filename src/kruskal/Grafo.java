package kruskal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Grafo {

	private List<Nodo> nodos;
	private int cantDeNodos;
	private ListaDeAdyacencia listaDeAristas;
	private int[] vectorDeRepresentates;

	public Grafo(int cantDeNodos) {
		this.cantDeNodos = cantDeNodos;

		this.nodos = new ArrayList<>();
		this.vectorDeRepresentates = new int[cantDeNodos];

		//Cargo nodos y cargo el vector de representates con -1
		for (int i = 0; i < this.cantDeNodos; i++) {
			this.nodos.add(new Nodo(i));
			vectorDeRepresentates[i] = i;
		}

		this.listaDeAristas = new ListaDeAdyacencia(cantDeNodos);
	}

	public void setArista(int nodoOrigen, int nodoDestino, int peso) {
		this.listaDeAristas.setArista(nodoOrigen, nodoDestino, peso);
	}

	public SalidaKruskal resolverKruskal() {
		List<Arista> arbolAbarcadorCostoMinimo = new LinkedList<>();
		Set<Integer> nodosCargados = new TreeSet<>();
		int costoTotal = 0;
		PriorityQueue<Arista> colaDeAristas = new PriorityQueue<>();
		Arista aristaActual;
		int nodoOrigen, nodoDestino;

		// pongo todas las aristas en la cola
		for (int i = 0; i < this.cantDeNodos; i++) {
			for (Arista a : this.listaDeAristas.getAristasDeNodo(i)) {
				colaDeAristas.add(a);
			}
		}

		while (nodosCargados.size() != this.cantDeNodos) {

			aristaActual = colaDeAristas.poll();
			nodoOrigen = aristaActual.getNodoOrigen();
			nodoDestino = aristaActual.getNodoDestino();
			if (find(nodoOrigen) != find(nodoDestino)) {
				nodosCargados.add(nodoOrigen);
				nodosCargados.add(nodoDestino);
				union(nodoOrigen, nodoDestino);
				costoTotal += aristaActual.getPeso();
				arbolAbarcadorCostoMinimo.add(aristaActual);
			}
		}

		return new SalidaKruskal(costoTotal, arbolAbarcadorCostoMinimo);
	}

	private int find(int nodo) {
		return this.vectorDeRepresentates[nodo] == nodo ? nodo : find(this.vectorDeRepresentates[nodo]);
	}
	
	private void union(int nodo1, int nodo2) {
		this.vectorDeRepresentates[find(nodo1)] = this.vectorDeRepresentates[find(nodo2)];
	}

}
