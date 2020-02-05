package PILAS_LISTAS;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author SergioO
 *
 */
public class p140 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		while (numero >= 0) {
			if (numero == 0) {
				System.out.print(numero + " = " + numero);
			} else {
				Stack<Integer> miPila = new Stack<Integer>();
				while (numero != 0) {
					miPila.push(numero % 10);
					numero /= 10;
				}
				int contenedor = miPila.peek();
				miPila.pop();
				System.out.print(contenedor);
				while (!miPila.empty()) {
					contenedor += miPila.peek();
					System.out.print(" + " + miPila.peek());
					miPila.pop();
				}
				System.out.print(" = " + contenedor);
			}
			System.out.println("");
			numero = in.nextInt();
		}

	}

}