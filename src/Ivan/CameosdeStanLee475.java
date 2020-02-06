package Ivan;

import java.util.Scanner;

public class CameosdeStanLee475 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numCasos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCasos; i++) {
			String linea = in.nextLine();
			char[] stan = { 's', 't', 'a', 'n', 'l', 'e', 'e' };
			int cont = 0;
			int res = 0;
			linea = linea.toLowerCase();

			for (int j = 0; j < linea.length(); j++) {
				if (linea.charAt(j) == stan[cont])
					cont++;
				if (cont==stan.length) {
					cont = 0;
					res++;
				}

			}
			System.out.println(res);

		}

	}

}
