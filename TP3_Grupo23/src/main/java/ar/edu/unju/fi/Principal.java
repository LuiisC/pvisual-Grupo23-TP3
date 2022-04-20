package ar.edu.unju.fi;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		int[] arreglo1 = new int[5];
		int[] arreglo2 = new int[5];
		
		System.out.println("Cargando datos Arreglo 1: ");
		for (int i=0;i<5; i++){
			System.out.print("Ingrese valor: ");
			arreglo1[i]=leer.nextInt();
		}
		
		System.out.println("Cargando datos Arreglo 2: ");
		for (int i=0;i<5; i++){
			System.out.print("Ingrese valor: ");
			arreglo2[i]=leer.nextInt();
		}
		division(arreglo1, arreglo2);
		leer.close();
	}
	public static void division(int[] A, int[] B) {
		double resultado;
		for (int i=0;i<Array.getLength(A) ;i++) {
			System.out.print("Division entre valor " + A[i] + " y "+B[i]);
			try {
				resultado=A[i]/B[i];
				System.out.println("= " + resultado);
			}
			catch(ArithmeticException ae){
				System.out.println("No se puede realizar la division: " + ae.getMessage());
			}
		}
		
	}
}
