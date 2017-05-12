package TrabajoEspecial_Lista_AlFinal;

import TrabajoEspecial_Arr_1.Arreglo;

public class Usuario {
	String dni;
	Arreglo gustos;
	Usuario sig;
	
	public Usuario(String[] datos){
		this.dni = datos[0];
		this.gustos = generarGustos(datos);
		this.sig = null;
	}
	
	public Arreglo generarGustos(String[] datos){
		Arreglo retorno = new Arreglo(5);
		int pos = 1; 
		
		while (pos < datos.length){
			if((datos[pos] != "") && (!retorno.contiene(datos[pos]))) {
				retorno.agregar(datos[pos]);
			}
			pos++;
		}
		
		return retorno;
	}
	
	public Usuario getSig(){
		return sig;
	}
	
	public void setSig(Usuario usuario){
		sig = usuario;
	}
	
	public Arreglo getGustos(){
		return gustos;
	}
	
	public String getDni(){
		return this.dni;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", gustos=" + gustos + "]";
	}
	
}