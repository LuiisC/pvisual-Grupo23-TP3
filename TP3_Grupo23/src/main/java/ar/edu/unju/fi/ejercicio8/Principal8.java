package ar.edu.unju.fi.ejercicio8;

import ar.edu.unju.fi.ejercicio3.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal8 {

	private static ArrayList<Alumno> lista = new ArrayList<>();
   
    public static void main(String[] args) {
        boolean band = true;
        
        while (band) {
            switch (menu()) {
                case 1: {
                    agregar();
                    break;
                }
                case 2: {
                    eliminar();
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    mostrar();
                    break;
                }
                case 5: {
                    mostrarSuperacion();
                    break;
                }
                case 6: {
                    band = false;
                    break;
                }
            }

        }

    }

    private static int menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 – Nuevo alumno");
        System.out.println("2 – Eliminar alumno");
        System.out.println("3 – Modificar notas alumno");
        System.out.println("4 – Mostrar todos los alumnos.");
        System.out.println("5 - Mostrar los que superan el promedio de 6");
        System.out.println("6 – Salir.");

        return entrada.nextInt();
    }

    private static void agregar() {
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("*****[AGREGAR]*******\n");

        System.out.println("\nIngrese el nombre del alumno :");
        String nombre = entrada1.nextLine();

        System.out.println("\nIngrese el apellido del alumno :");
        String apellido = entrada1.nextLine();

        System.out.println("\nIngrese la libreta unversitaria del alumno :");
        String lu = entrada2.nextLine();

        System.out.println("Ingrese las 5 notas : \n");
        double nota[] = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nNOTA %d : ", i + 1);
            nota[i] = entrada3.nextDouble();
        }

        Alumno a = new Alumno(nombre, apellido, lu, nota);
        lista.add(a);
        System.out.println("El alumno fue agregado a la lista.\n\n");

    }

    private static void eliminar() {
        Scanner entrada1 = new Scanner(System.in);

        System.out.println("*****[ELIMINAR]*******\n");

        System.out.println("\nIngrese la libreta universitaria del alumno : ");
        String lu = entrada1.nextLine();

        if (existe(lu)) {
            Alumno alumno = obtener(lu);

            lista.remove(alumno);

            System.out.println("El alumno fue eliminado de la lista.");
        } else {
            System.out.println("El alumno con existe!.");
        }

    }

    private static boolean existe(String lu) {
        boolean band = false;

        for (Alumno alumno : lista) {
            if (alumno.getLu().equals(lu)) {
                band = true;
            }
        }

        return band;
    }

    private static void mostrar() {
        System.out.println("\n\n*****[MOSTRAR LISTA]*******\n");

        for (int i = 0; i < lista.size(); i++) {
           // Alumno a = lista.get(i);

            System.out.println(lista.get(i).toString() + "\n");
        }
    }

    private static void mostrarSuperacion() {
        System.out.println("\n\n*****[MOSTRAR SUPERACION]*******\n");

        System.out.println("\n\nLista de alumnos con promedio mayor a 6.0 : ");
        for (int i = 0; i < lista.size(); i++) {
            Alumno a = lista.get(i);

            if (a.obtenerPromedio() >= 6) {
                System.out.println(a.toString() + "\n");
            }
        }
    }

    private static Alumno obtener(String lu) {
        for (Alumno alumno : lista) {
            if (alumno.getLu().equals(lu)) {
                return alumno;
            }
        }

        return null;
    }

}
