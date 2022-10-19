package Ordenamiento;
import java.util.*;

public class PorInsercion {

	static Scanner es=new Scanner(System.in);

	public static void ordenamientoporInsercion(int A[], int n) {
		
		for(int i=1; i< n; i++) {// Se empieza a  recorrer el arreglo desde la posicion 1(2 en el orden)
			
			int valorC=A[i]; // Guarda temporalmente el valor A[i], por si ha que cambiarlo debido al ordenamiento
			int posicion=i; // Guarda la Posicion en otra variable
			while((posicion >0) && (A[posicion-1]> valorC)) { /*/Mientras posicion sea mayor que el primer elemento(0) , el cual se asume que esta ordenado
															 Si la posicion es mayor al ValorC significa que esta desordenado y se requiere le cambio de posicion
															 /*/
				
				A[posicion]=A[posicion-1];
				posicion=posicion-1;
			}
			A[posicion]=valorC; // por si ya esta ordenado la variable temporal devuelv el valor al oorden que pertenece
		}
	}
	
	public static void mostrarArreglo(int A[], int n) {
		for(int i=0; i<n; i++) {
			System.out.println(A[i]+" ");
		}
		
	}
	public static void main(String args[]) {
		
		System.out.println("Ingrese el tamanho del Arreglo");
		int n=es.nextInt();
		int A[]=new int[n];
		
		System.out.println("Ingrese Los elementos del Arreglo");
		for(int i=0;i<n; i++) {
			
			System.out.println("Elemento ["+ i +"] =");
			A[i]=es.nextInt();
			
			
		}
		
		System.out.println("Arreglo original: ");
		mostrarArreglo(A,n);
		
		ordenamientoporInsercion(A,n);
		
		System.out.println("Arreglo ordenado");
		mostrarArreglo(A,n);

		
		
		
	}//Cierre del  Main
}
