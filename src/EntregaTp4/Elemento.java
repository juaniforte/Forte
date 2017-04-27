package EntregaTp4;

public class Elemento {

	double peso;
	double valor;
	int cantidad;
	
	public Elemento (double peso, double valor, int cantidad){
		this.cantidad = cantidad;
		this.peso = peso;
		this.valor = valor;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValor() {
		return valor;
	}

	public int getCantidad(){
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getRelacionVP(){
		return valor/peso;
	}

	@Override
	public String toString() {
		return "Elemento [peso=" + peso + ", valor=" + valor + ", cantidad="
				+ cantidad + "]";
	}
}