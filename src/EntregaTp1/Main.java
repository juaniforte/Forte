package EntregaTp1;

public class Main {

	public static void main(String[] args) {
		
		Pila pila = new Pila();
	
		System.out.println("Esta vacia la pila? = "+pila.esVacia());
		pila.apilar(1);
		System.out.println("Esta vacia la pila? = "+pila.esVacia());
		pila.apilar(2);
		pila.apilar(3);
		System.out.println(pila.toString());
		System.out.println("Tope de la pila = "+pila.verTope());
		pila.desapilar();
		System.out.println("Tope de la pila = "+pila.verTope());
		pila.desapilar();
		System.out.println("Tope de la pila = "+pila.verTope());
		System.out.println("Esta vacia la pila? = "+pila.esVacia());
		pila.desapilar();
		System.out.println("Esta vacia la pila? = "+pila.esVacia());
		
		
	}

}
