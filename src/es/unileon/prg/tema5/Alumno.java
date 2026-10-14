package es.unileon.prg.tema5;

/**
 * Clase que representa un alumno.
 * 
 * @author PRG
 * @version 1.0
 */
public class Alumno {
	
	private String niu;
	private String nombre;
	private float nota;

	
	public Alumno(String niu, String nombre) {
		this.niu = niu;
		this.nombre = nombre;
	}


	public void asignarNota(float nota) {
		this.nota = nota;
	}

	
	public String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append("NIU: " + this.niu + " ");
		salida.append("Nombre: " + this.nombre + " ");
		salida.append("Nota: " + this.nota + " ");
		
		return salida.toString();
     }}

	

