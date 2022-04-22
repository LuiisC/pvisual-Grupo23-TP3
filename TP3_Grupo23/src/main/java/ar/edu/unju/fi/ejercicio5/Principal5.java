package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese una cadena de texto");
		String texto = scn.nextLine();
		char[] letras = new char[texto.length()];
		int indice= 0;
		for (int i=(letras.length-1); i>=0;i--) {
			letras[i]=texto.charAt(indice);
			indice=indice+1;
		}
		for(int i=0;i<texto.length();i++) {
			System.out.print(letras[i]);
		}
		scn.close();

	}

}
