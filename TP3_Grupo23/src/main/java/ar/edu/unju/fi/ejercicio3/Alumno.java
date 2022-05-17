package ar.edu.unju.fi.ejercicio3;

public class Alumno {
	
	public String nombre;
	public String apellido;
	public String lu;
	public double[] notas;


	public Alumno(String nomb,String ap, String lu2,double[] notas) {
		nombre=nomb;
		apellido=ap;
		this.lu=lu2;
		this.notas=notas;
		
	}
		
	public double calcularPromedio() {
		double suma=0;
		for (int i=0;i<notas.length;i++) {
			suma= suma + notas[i];
		}	
		return (suma/notas.length);
	}
	public double obtenerNotaMaxima() {
		double resultado=notas[0];
		for (int i=1;i<notas.length;i++) {
			if(notas[i]>resultado) {
					resultado=notas[i];			
			}
		}
		return resultado;
	}
	
	
}
