package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		int numero1,numero2,comodin;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un número entero ");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro numero entero ");
		numero2 = teclado.nextInt();
		teclado.close();
		comodin=numero2;
		numero2=numero1;
		numero1=comodin;
		System.out.println("El numero 1 ahora vale " + numero1);
		System.out.println("El numero 2 ahora vale " + numero2);
			}
}
