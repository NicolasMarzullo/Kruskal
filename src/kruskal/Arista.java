package kruskal;

public class Arista implements Comparable<Arista> {
	private int nodoOrigen;
	private int nodoDestino;
	private int peso;
	
	public Arista(int nodoOrigen, int nodoDestino, int peso) {
		this.nodoOrigen = nodoOrigen;
		this.nodoDestino = nodoDestino;
		this.peso = peso;
	}

	@Override
	public int compareTo(Arista otra) {
		return this.peso - otra.peso;
	}

	@Override
	public String toString() {
		return "Arista [nodoOrigen=" + nodoOrigen + ", nodoDestino=" + nodoDestino + ", costo=" + peso + "]";
	}

	public int getNodoOrigen() {
		return nodoOrigen;
	}

	public int getNodoDestino() {
		return nodoDestino;
	}

	public int getPeso() {
		return peso;
	}

	
	
	
	
	
	

}
