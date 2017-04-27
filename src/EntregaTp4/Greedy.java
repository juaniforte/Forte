package EntregaTp4;

import java.util.ArrayList;

public class Greedy {

	ArrayList<Elemento> elementos;
	ArrayList<Elemento> mochila;
	double pesoMax;

	public Greedy(ArrayList<Elemento> elementos, double pesoMax){
		mochila = new ArrayList<Elemento>();
		this.elementos = elementos;
		this.pesoMax = pesoMax;
		ordenarElementos();
		for (Elemento e : elementos) {
			mochila.add(new Elemento(e.getPeso(),e.getValor(),0));
		}
	}

	public ArrayList<Elemento> cargar(){
		double pesoActual = 0;
		int i = 0;

		while(pesoActual < pesoMax && i < elementos.size()){

			if ( (elementos.get(i).getPeso() <= pesoMax - pesoActual) && (elementos.get(i).getCantidad() > 0) ){
				mochila.get(i).setCantidad(mochila.get(i).getCantidad()+1);
				pesoActual += elementos.get(i).getPeso();
				elementos.get(i).setCantidad(elementos.get(i).getCantidad()-1);
			}else{
				i++;
			}
		}
		return mochila;
	}

	private void ordenarElementos(){  
		int i,j;
		Elemento aux;
		for(i=0; i<elementos.size()-1; i++){
			for(j=0; j<elementos.size()-i-1; j++){
				if(elementos.get(j+1).getRelacionVP() > elementos.get(j).getRelacionVP()){
					aux = elementos.get(j+1);
					elementos.set(j+1, elementos.get(j));
					elementos.set(j,aux);
				}
			}
		}    
	}
}