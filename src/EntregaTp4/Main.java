package EntregaTp4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Elemento> objetos = new ArrayList<Elemento>();
		ArrayList<Elemento> mochila = new ArrayList<Elemento>();

		Elemento elemento1 = new Elemento(0.10,200,10);
		Elemento elemento2 = new Elemento(1,100,2);

		objetos.add(elemento1);
		objetos.add(elemento2);

		Greedy greedy = new Greedy(objetos, 1);

		mochila = greedy.cargar();
		System.out.println(mochila);
	}
}
