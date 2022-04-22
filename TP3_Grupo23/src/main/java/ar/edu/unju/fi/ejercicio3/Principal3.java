package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		double[] notas = new double[5];
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingreso de datos ");
		System.out.print("Ingrese nombre: ");
		String nombre = scn.next();
		System.out.print("Apellido: ");
		String apellido = scn.next();
		System.out.print("Numero de LU: ");
		int lu = scn.nextInt();
		System.out.println("******Notas******");
		try {
			for (int i=0;i<5;i++) {
				System.out.println("Ingrese nota " + (i+1));
				notas[i]=scn.nextDouble();
			}
		}
		catch(java.util.InputMismatchException ie) {
			System.out.println("Error en el ingreso... " + ie.getMessage());
		}
		Alumno alumno = new Alumno(nombre, apellido, lu, notas);
		System.out.println("El promedio es: "+ alumno.calcularPromedio());
		System.out.println("La nota maxima es: "+ alumno.obtenerNotaMaxima());
		scn.close();

	}

}
