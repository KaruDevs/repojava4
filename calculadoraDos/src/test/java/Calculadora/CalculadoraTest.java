package Calculadora;

import java.util.*;
import java.util.logging.Logger;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import cl.inforcap.Calculadora;


@DisplayName("Tests Clase Calculadora")
public class CalculadoraTest {
private static Logger logger =
Logger.getLogger("cl.inforcap.Calculadora.CalculadoraTest");
 

//public static Calculadora Calculadora  = new Calculadora();
	
	@Test
	public void testSuma() {
		int expectativa = 14;
		int m = Calculadora.suma();
		
		Assertions.assertEquals(expectativa, m);
		//Assertions.assertTrue(false);
}


	@Test
	public void testResta() {
		int expectativa = 4;
		int m = Calculadora.resta();
		
		Assertions.assertEquals(expectativa, m);
		//Assertions.assertTrue(false);
	}

	@Test
	public void testMultiplicar() {
		int expectativa = 45;
		int m = Calculadora.multiplicar();
		
		Assertions.assertEquals(expectativa, m);
		//Assertions.assertTrue(false);
	}

	@Test
	public void testDividir() {
		double expectativa = 1.8;
		double m = Calculadora.dividir();
		
		Assertions.assertEquals(expectativa, m);
		//Assertions.assertTrue(false);
	}
	
}
	
	
	
	
	
	
	
/*
//	Scanner sc = new Scanner (System.in);

	/*int num1=3;
	int num2=4;
	int n=0;
	int m=0;
/*	int expectativa = 0;
		int m = Calculadora.suma();
		
		Assertions.assertEquals(expectativa, m);
		//Assertions.assertTrue(false);
		
		*/

/*		static Scanner sc = new Scanner (System.in);
		static int num1 = 3;
		static int num2 = 4;
		static double num1_1 = 5;
		static double num2_2 = 6;

		
		public static void main(String[] args) {	
			// menú
			
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
	
	public static void capturaDatos() {
		
				int n=0;
				int m=0;
				
				do {
					System.out.println("ingrese número 1: ");
					num1 = sc.nextInt();
					n = 1;
				}while(n == 0);
				
				do {
					System.out.println("ingrese número 2: ");
					num2 = sc.nextInt();
					m = 1;
				}while(m == 0);
				
			}
	
	public static void capturaDatos2() {
		
		int n=0;
		int m=0;
		
		do {
			System.out.println("ingrese número 1: ");
			num1_1 = sc.nextDouble();
			n = 1;
		}while(n == 0);
		
		do {
			System.out.println("ingrese número 2: ");
			num2_2 = sc.nextDouble();
			if (num2_2 == 0) {
				m = 0;
			}else {m = 1;}
		}while(m == 0);
		
	}
			
	@Test
	public static void suma() {
				
				System.out.println("sumar");
				capturaDatos();
				int resultado = num1+num2;
				System.out.println("resultado " +resultado);
				
			}
			
	@Test
	public static void resta() {
		
				System.out.println("resta");
				capturaDatos();
				int resultado2 = num1-num2;
				System.out.println("resultado " +resultado2);
		
		}
	
	@Test
	public static void multiplicar() {
		
		System.out.println("multiplicar");
		capturaDatos();
		int resultado = num1*num2;
		System.out.println("resultado " +resultado);
		
	}
	
	@Test
	public static void dividir() {
		
		System.out.println("dividir");
		capturaDatos2();
		double resultado = num1_1/num2_2;
		System.out.println("resultado " +resultado);
		
	}
	public static void salir() {
		System.out.println("me salgo");
	}
}*/
