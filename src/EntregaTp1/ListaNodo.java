package EntregaTp1;

public class ListaNodo {

	private Nodo nodoPadre;
	private int cantidadElementos;

	public ListaNodo(){
		this.nodoPadre = null;
		this.cantidadElementos = 0;
	}
	
	public void agregarElementos(int N){
		
		if(nodoPadre == null){
			nodoPadre = new Nodo(N);
		}else{
			Nodo nodoActual = nodoPadre;
			while(nodoActual.getSig() != null){
				nodoActual = nodoActual.getSig();
			}
			nodoActual.setSig(new Nodo(N));
		}
		this.cantidadElementos++;
	}
	
	public void agregarElementoInicio(int N){
		
		if(nodoPadre == null){
			nodoPadre = new Nodo(N);
		}else{
			Nodo nuevoNodo = new Nodo(N);
			nuevoNodo.setSig(nodoPadre);
			nodoPadre = nuevoNodo;
		}
		this.cantidadElementos++;
	}

	public void eliminarElemento(int elemento){
		if(nodoPadre != null){
			Nodo nodoActual = nodoPadre;
			Nodo nodoAnterior = null;

			if(nodoPadre.getElem() == elemento){
				nodoPadre = nodoPadre.getSig(); 
			}else{
				do{
					nodoAnterior = nodoActual;
					nodoActual = nodoActual.getSig();
					if(nodoActual.getElem() == (elemento)){
						nodoAnterior.setSig(nodoActual.getSig());
					}
				}while(nodoActual.getSig() != null); 
			}
			this.cantidadElementos--;
		}
	}

	public boolean esVacia(){
		return nodoPadre == null;
	}

	public int getAt(int pos){
		int retorno = -1;
		Nodo nodoActual = nodoPadre;
		if(pos<this.cantidadElementos){
			for (int i = 0; i < pos; i++) {
				nodoActual = nodoActual.getSig();
			}
			retorno = nodoActual.getElem();
		}
		return retorno;
	}
	
	public String toString() {
		
		String salida = "";
		if(nodoPadre != null){
			Nodo nodoActual = nodoPadre;
			do{
				salida += nodoActual.toString();
				nodoActual = nodoActual.getSig();
			}while(nodoActual.getSig() != null);

			salida += nodoActual.toString();
		}
		return salida;
	}

	public int getCantElem() {
		return cantidadElementos;
	}
}
