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
		Float result = 0.00f;

		if (tiempoLaborado > 5) {  return 1000.00f; }; 
		
		if(tiempoLaborado == 1 ) { 
			result = 100f; 
		} else if (tiempoLaborado == 2  ) {
			result = 200f;
		} else if (tiempoLaborado == 3) {
			result = 300f;
		} else if(tiempoLaborado == 4) {
			result = 400f;
		}else if(tiempoLaborado == 5) {
			result = 500f;
		}
		
		return result;
	}

}
