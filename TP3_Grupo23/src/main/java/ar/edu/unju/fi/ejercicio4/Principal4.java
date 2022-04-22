package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numeros = new int[4];
		System.out.println("Ingrese los numeros");
		for (int i=0; i<numeros.length;i++) {
			System.out.print("Ingrese numero: ");
			numeros[i]= scn.nextInt();	
		}
		System.out.println("");
		ParImpar(numeros);
	}
	public static void ParImpar(int[] A) {
		for (int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				System.out.println("el numero " + A[i]+ " es par");
			}
			else {
				System.out.println("el numero " + A[i]+ " es impar");
			}
		}
	}

}
