package CONJUNTOS;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 * @author SergioO
 *
 */

public class p452 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		boolean permanecia = true;

		while (permanecia) {
			int cantidadNumeros = Integer.parseInt(in.next());
			if (cantidadNumeros == 0) {
				permanecia = false;
			}

			else {
				TreeSet<Integer> coleccionInicial = new TreeSet<Integer>();
				TreeSet<Integer> coleccionFinal = new TreeSet<Integer>();

				for (int i = 0; i < cantidadNumeros; i++) {
					coleccionInicial.add(Integer.parseInt(in.next()));
				}

				for (Integer integer : coleccionInicial) {
					Iterator<Integer> paseador = coleccionInicial.iterator();
					while (paseador.hasNext()) {
						coleccionFinal.add(Math.abs(paseador.next() - integer));
					}
				}
				Iterator<Integer> paseador1 = coleccionFinal.iterator();
				paseador1.next();
				System.out.print(paseador1.next());
				while (paseador1.hasNext()) {
					System.out.print(" " + paseador1.next());

				}
				System.out.println();
			}

		}
	}

}
