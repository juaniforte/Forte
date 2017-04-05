package EntregaTp2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ordenamiento primero = new Ordenamiento(5);
		Ordenamiento segundo = new Ordenamiento(5);
		Ordenamiento tercero = new Ordenamiento(5000);
		Ordenamiento cuarto = new Ordenamiento(5000);
		Ordenamiento quinto = new Ordenamiento(50000);
		Ordenamiento sexto = new Ordenamiento(50000);
		
		long startTime;
		long totalTime;
		
		startTime = System.currentTimeMillis();
		primero.OrdenarPorBurbujeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Burbujeo  arreglo[20]: "+totalTime);
		
		startTime = System.currentTimeMillis();
		segundo.OrdenarPorMergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Merge  arreglo[20]: "+totalTime);
		
		System.out.println("");
		
		startTime = System.currentTimeMillis();
		tercero.OrdenarPorBurbujeo();;
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo burbujeo  arreglo[5000]: "+totalTime);
		
		startTime = System.currentTimeMillis();
		cuarto.OrdenarPorMergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Merge  arreglo[5000]: "+totalTime);
		
		System.out.println("");
		
		startTime = System.currentTimeMillis();
		quinto.OrdenarPorBurbujeo();;
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo burbujeo  arreglo[50000]: "+totalTime);
		
		startTime = System.currentTimeMillis();
		sexto.OrdenarPorMergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Merge  arreglo[50000]: "+totalTime);
		
		//Llegue a la conclusion de que para arreglos pequeños, tarda mas el ordenamiento por Mergeo, y es mas rapido por burbugeo,
		//mientras que con arreglos de grandes dimenciones es mas eficiente el ordenamiento por MergeSort.
		
	}
}