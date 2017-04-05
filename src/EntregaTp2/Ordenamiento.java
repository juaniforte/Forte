package EntregaTp2;

public class Ordenamiento {

	int[] arreglo;
	int[] numbers;
	int[] helper;
	int number;

	public Ordenamiento(int tamanio){

		arreglo = new int[tamanio];
		CargarArreglo();
	}

	public void CargarArreglo(){

		for (int i = 0; i < arreglo.length; i++) {

			arreglo[i] = (int)Math.floor(Math.random()*(100-1+1)+1) ;
		}
	}

	public void OrdenarPorBurbujeo(){

		int i, j, aux;

		for(i=0;i<arreglo.length-1;i++) 
			for(j=0;j<arreglo.length-i-1;j++)
				if(arreglo[j+1]<arreglo[j]){
					aux=arreglo[j+1];
					arreglo[j+1]=arreglo[j];
					arreglo[j]=aux;
				}
	}

	public void OrdenarPorMergeo(){

		this.numbers = arreglo;

		this.number = arreglo.length;

		this.helper = new int[number];

		mergesort(0, number - 1);
	}

	private void mergesort(int low, int high) {

		if (low < high) {

			int middle = (low + high) / 2;

			mergesort(low, middle);

			mergesort(middle + 1, high);

			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {

		for (int i = low; i <= high; i++) {

			helper[i] = numbers[i];
		}

		int i = low;

		int j = middle + 1;

		int k = low;

		while (i <= middle && j <= high) {

			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {

				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {

			numbers[k] = helper[i];
			k++;
			i++;
		}
	}

	public String toString() {
		String retorno="";
		for (int i = 0; i < arreglo.length; i++) {
			retorno += "["+arreglo[i]+"]";
		}
		return retorno;
	}
}