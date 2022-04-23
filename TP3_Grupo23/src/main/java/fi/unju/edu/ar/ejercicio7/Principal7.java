package fi.unju.edu.ar.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal7 {
	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		boolean respuesta = true;
		do {System.out.println("Ingrese una fruta"); //Ingreso de datos
			frutas.add(leer.nextLine());  //asignacion al arreglo
			System.out.println("Desea ingresar mas datos?\nS/N");
			String rest = leer.nextLine(); 
			if(rest.equalsIgnoreCase("s")) { 
				respuesta = true;
			}else {respuesta = false;}
		}while(respuesta); //si responde "s" se repite en cualquier otro caso termina el bucle
		for(int i = 0; i < frutas.size(); i++) {
			if(i % 2 == 0) {System.out.println(i + ": " + frutas.get(i));}} //muestra el arreglo con cada indice par
		System.out.println("Ingrese el indice del elemento que desea borrar");
		try{int indice = leer.nextInt(); //se puede producir un error si se introduce un dato no numerico
		if(indice <= frutas.size()-1 && indice >= 0) {
			frutas.remove(indice);} //borra el elemento del indice ingresado
		for(String nom: frutas) {
			System.out.println(nom);} //muestra los elementos del array
		System.out.println("Cantidad de elementos: " + frutas.size());
		} catch(Exception e){System.out.println("error indice " + e.getMessage());
		}finally {leer.close();}
		
	}
}
