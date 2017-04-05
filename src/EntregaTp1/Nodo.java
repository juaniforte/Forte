package EntregaTp1;

public class Nodo {
	private int elemento;
	private Nodo siguiente;

	public Nodo(int elem){
		this.elemento = elem;
		this.siguiente = null;
	}

	public int getElem() {
		return elemento;
	}

	public void setElem(int elem) {
		this.elemento = elem;
	}

	public Nodo getSig() {
		return siguiente;
	}

	public void setSig(Nodo sig) {
		this.siguiente = sig;
	}

	
	public String toString() {
		return "[" + this.elemento + "]->";
	}



}
