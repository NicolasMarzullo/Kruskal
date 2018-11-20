package kruskal;

import java.util.List;


public class SalidaKruskal {
	
	private int pesoTotal;
	private List<Arista> arbolAbarcadorCostoMinimo;
	
	
	public SalidaKruskal(int pesoTotal, List<Arista> arbolAbarcadorCostoMinimo) {
		this.pesoTotal = pesoTotal;
		this.arbolAbarcadorCostoMinimo = arbolAbarcadorCostoMinimo;
	}


	@Override
	public String toString() {
		System.out.println("Peso total: " + this.pesoTotal);
		System.out.println("Orden de las aristas: ");
		for(Arista a: this.arbolAbarcadorCostoMinimo) {
			System.out.println("Arbol: " + a.getNodoDestino() + "  <----->  " + a.getNodoOrigen()  + "  Peso: " + a.getPeso());
		}
		return null;
	}
	
}
