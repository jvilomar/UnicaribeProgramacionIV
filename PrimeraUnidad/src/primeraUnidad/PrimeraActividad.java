
/*
 * Autor:  Jose Manuel Vilomar
 * Materia: Programación IV
 * Unidad I - Actividad I
 * */

package primeraUnidad;
import java.util.Scanner;

public class PrimeraActividad {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Por Favor introduzca un nombre : ");
		
		String nombre = input.nextLine();
		
		System.out.println(TransformarNombre(nombre));
		
		input.close();
	}
	
	
	// Procesa el nombre segun lo requerido.  se divide el nombre completo
	// y se invierte el resultado para presentar el Apellido y la primera
	// letra del Nombre.
	private static String TransformarNombre(String nombre) {
		String[] info = nombre.split(" "); 
		return info[1].concat(" , ").concat(info[0].substring(0, 1));
	}

}
