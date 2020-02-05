package COLAS;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ejer127 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		int numeroVeces = num.nextInt();
		for (int i = 0; i < numeroVeces; i++) {

			String linea = str.nextLine();
			String[] lineaNombres = linea.split(" F ");
			String lineaNombresStr = lineaNombres[0];
			String lineaNumeros = lineaNombres[0];
			String valorQueue;
			int numCamas = Character.getNumericValue(lineaNumeros.charAt(0));
			int numPalabras = Character.getNumericValue(lineaNumeros.charAt(2));
			int cont = 0;
			int contadorCamas = 0;
			ArrayDeque<String> peregrinos = new ArrayDeque<String>();
			ArrayDeque<String> peregrinos2 = new ArrayDeque<String>();
			peregrinos.addAll(Arrays.asList(lineaNombresStr.split(" ")));

			if (numCamas == 0) {
				System.out.println("NADIE TIENE CAMA");
			} else {

				Iterator<String> it = peregrinos.iterator();
				while (it.hasNext() && contadorCamas < peregrinos.size() - numCamas) {
					valorQueue = it.next();
					// for (String valorQueue : peregrinos) {
					cont++;
					if (cont == numPalabras) {
						peregrinos.remove(valorQueue);
						cont = 0;
						contadorCamas++;
					} else if (contadorCamas < peregrinos.size() - numCamas) {
						peregrinos.addLast(valorQueue);
					}
				}
			}
			for (String valor : peregrinos) {
				System.out.println(valor);
			}
		}
	}
}
