package ar.edu.unju.fi.ejercicio3;

public class Alumno {
	
	public String nombre;
	public String apellido;
	public int lu;
	public double[] notas = new double[5];


	public Alumno(String nomb,String ap, int lu,double[] notas) {
		nombre=nomb;
		apellido=ap;
		this.lu=lu;
		this.notas=notas;
		
	}
	
	public double promedio() {
		double suma=0;
		for (int i=0;i<notas.length;i++) {
			suma= suma + notas[i];
		}	
		return (suma/notas.length);
	}
	public int notamax() {
		return 10;
	}
	
	
}
