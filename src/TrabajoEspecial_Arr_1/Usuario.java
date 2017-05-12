package TrabajoEspecial_Arr_1;

public class Usuario {
	String dni;
	Arreglo gustos;
	
	public Usuario(String[] datos){
		this.dni = datos[0];
		this.gustos = generarGustos(datos);
	}
	
	public Arreglo generarGustos(String[] datos){
		Arreglo retorno = new Arreglo(5);
		int pos = 1; //comienza en 1 para saltear el documento
		
		while (pos < datos.length){
			if((datos[pos] != "") && (!retorno.contiene(datos[pos]))) {
				retorno.agregar(datos[pos]);
			}
			pos++;
		}
		
		return retorno;
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