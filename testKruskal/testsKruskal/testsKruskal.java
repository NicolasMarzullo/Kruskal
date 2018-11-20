package testsKruskal;

import org.junit.Test;

import kruskal.Grafo;
import kruskal.SalidaKruskal;

public class testsKruskal {
	
	@Test
	public void testEnunciado() {
		
		Grafo gKruskal = new Grafo(7);
		
		gKruskal.setArista(0, 1, 2);
		gKruskal.setArista(0, 3, 1);
		gKruskal.setArista(0, 2, 4);
		gKruskal.setArista(2, 3, 2);
		gKruskal.setArista(2, 5, 5);
		gKruskal.setArista(5, 3, 8);
		gKruskal.setArista(5, 6, 1);
		gKruskal.setArista(3, 1, 3);
		gKruskal.setArista(3, 4, 7);
		gKruskal.setArista(3, 6, 4);
		gKruskal.setArista(1, 4, 10);
		gKruskal.setArista(6, 4, 6);
		
		
		SalidaKruskal salida = gKruskal.resolverKruskal();
		
		salida.toString();
	}

}
