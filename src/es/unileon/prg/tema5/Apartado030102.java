package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a operadores.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	protected String obtenerPractica(){
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Operadores";
	}

	/**
	 * Operadores - Ejercicio1.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo para realizar las operaciones solicitadas
	 */
	public void ejercicio01() {
		cabecera("01","Utilizacion de operadores aritmeticos");

		// Inicio modificacion
		final int CONST=128;
		int op1 = 10;
		int calculo = ++op1 * 12;	
		int op2 = --op1 + CONST;
		int resultado = op2 % op1;
		System.out.println("op1 = " + op1);
		System.out.println("op2 = " + op2);	
		System.out.println("resultado = " + resultado);
		//Preincrementa op1 y multiplicalo por 12
		//El valor de op2 es la suma op1 predecrementado con CONST
		//Halla el resto de dividir op2 entre op1 y guardalo en resultado
		//Muestra por pantalla los valores de op1, op2 y resultado
      // Fin modificacion
	}

	/**
	 * Operadores - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo para calcular el valor de rebaja
	 */
	public void ejercicio02() {
		cabecera("02", "Utilizacion de operadores logicos");

		// Inicio modificacion
		int edad = 25;
		int numeroPartes = 5;
		boolean deportivo = true;
		boolean rebaja = true; 
		System.out.println("rebajas=" + rebaja);
		// rebaja = expresion booleana
        /* DESCOMENTAR
		System.out.println("Rebaja = " + rebaja);
		*/
		// Fin modificacion
	}

	/**
	 * Operadores - Ejercicio3.
	 *
	 * </br>
	 *
	 * Se pide calcular cuantas horas, minutos y segundos hay en 56000 segundos
	 */
	public void ejercicio03() {
		cabecera("03", "Calculos aritmeticos");

		// Inicio modificacion
		int totalSegundos=56000;
		int horas = totalSegundos / 3600;
		int minutos = (totalSegundos % 3600) / 60;
		int segundos = (minutos % 60);
		System.out.println(horas + "h " + minutos + "m " + segundos + "s");
		// Realizacion de calculos
         /* DESCOMENTAR
		System.out.println(horas+"h "+minutos+"m "+segundos+"s ");   esto da como resultado 15h 33m 20s
		*/
		// Fin modificacion
	}
}
