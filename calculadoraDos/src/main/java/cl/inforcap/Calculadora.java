package cl.inforcap;

import java.util.*;
	
	/**
	 * @author karu_
	 * Calculadora que suma, resta y hace otras 
	 * cuestiones
	 * que tengo que eliminar
	 */

/*Fase roja: Primero creé una calculadora que pedía los datos por consola. 
 Al hacer las pruebas unitarias no podía enviar los datos por consola, así
 que cambié la metodología de la calculadora.
 *Fase Verde: Implementé un método más simple que tomara los valores ingresados 
 directamente en las variables y así podía hacer los testing Equals más fácilmente.
 *Fase Refactorización: El código quedó más simplificado, realiza lo que debe hacer,
 los testing se realizaron primero funcionando, luego fallando. 
 */

public class Calculadora {
   
 static Scanner sc = new Scanner (System.in);
	    	
	static int num1 = 9;
	static int num2 = 5;
	static double num1_1 = 9;
	static double num2_2 = 5;
	
public static void main( String[] args ){
			int op = 0;
			
			do { 
				System.out.println("---- acá pondremos el menú-----");
				
				System.out.println("1.Suma");
				System.out.println("2.Resta");
				System.out.println("3.Multiplicar");
				System.out.println("4.Dividir");
				System.out.println("5.Me salgo");
				System.out.println("Ingrese una opción:");
				
				op = sc.nextInt();
				switch(op) {
				case 1:
					suma();
					break;
				case 2:
					resta();
					break;
				case 3:
					 multiplicar();
					 break;
				case 4:
					 dividir();
					 break;
				case 5:
					salir();
					break;
				default:
					System.out.println("Opción inválida");
					
				}
			} while (op != 5);
		}
	    
	    
		public static int suma() {
			
			System.out.println("sumamiento");
		//	capturaDatos();
			int resultado = num1+num2;
			System.out.println("resultado " +resultado);
			return resultado;
			
		}
		public static int resta() {
			
			System.out.println("resta");
//			capturaDatos();
			int resultado2 = num1-num2;
			System.out.println("resultado " +resultado2);
			return resultado2;
	}
		public static int multiplicar() {
			
			System.out.println("multiplicar");
		//	capturaDatos();
			int resultado = num1*num2;
			System.out.println("resultado " +resultado);
			return resultado;
		}
		
		public static double dividir() {
			
			System.out.println("dividir");
			//capturaDatos2();
			double resultado = num1_1/num2_2;
			System.out.println("resultado " +resultado);
			return resultado;
		}
	    	
		public static void salir() {
			System.out.println("me salgo");
		

		}

	}