package fi.unju.edu.ar.ejercicio6;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal6 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		try{for(int i = 0; i < 10; i++) { //Ingreso de datos
			System.out.println("Ingrese un numero");
			numbers.add(read.nextInt());}
		System.out.println("En orden inverso"); 
		for(int i = numbers.size()-1; i >= 0; i--) {
			System.out.print(numbers.get(i) + "");}
		}catch(Exception e){
			System.out.println("Error en el ingreso " + e.getMessage());
		}finally {read.close();}
	}
}

