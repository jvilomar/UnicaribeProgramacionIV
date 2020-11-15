/*
 * Autor:  Jose Manuel Vilomar
 * Materia: Programación IV
 * Unidad I - Actividad I
 * */

package primeraUnidad;
import java.util.Scanner;


public class SegundaActividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Por Favor Introduzca el tiempo laborado del empleado ==>");
		int tiempo = input.nextInt();
		System.out.println("El Monto a Recibir es de : ".concat(CalcularBono(tiempo).toString()));
		
		input.close();
	}
	
	/*
	 * Calcula el Monto del Bono a recibir dependiendo de los años laborados.
	 * */
	private static Float CalcularBono(int tiempoLaborado) {
		if (tiempoLaborado > 5) {  return 1000.00f; }; 
		
		return tiempoLaborado * 100f;
	}

}
