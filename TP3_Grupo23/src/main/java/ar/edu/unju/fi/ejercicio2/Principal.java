package ar.edu.unju.fi.ejercicio2;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ingresar = new Scanner(System.in);
		int[] multiplicandos = {0,1,2,3,4,5,6,7,8,9};
		String respuesta=null;
		do {
			System.out.println("Ingrese un valor para mostrar la tabla");
			int valor = ingresar.nextInt();
			if ((valor<1)||(valor >9)) {
				 System.out.println("Debe ingresar in valor entre 1 y 9");
			 }
			else {
				System.out.println("Tabla de multiplicar de " + valor);
				for (int i=0;i<=10;i++) {
					System.out.println(valor+" x "+i+"= " +(valor*i));
				}
			}
			System.out.println("Desea ingresar otro numero? (S/N)");
			respuesta = ingresar.next();
		} while(respuesta.equals("S")|| respuesta.equals("s"));
		ingresar.close();

	}

}
