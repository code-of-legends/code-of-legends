package Ivan;

import java.util.Scanner;

public class Cualeslasiguientematricula154 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] abc = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X',
				'Y', 'Z' };
		boolean continu = true;
		int[] aux = new int[3];
		while (continu) {
			int numero = Integer.parseInt(in.next());
			char[] letras = in.next().toUpperCase().toCharArray();
			if (numero == 9999 && letras[0]==abc[abc.length-1] && letras[1]==abc[abc.length-1] && letras[2]==abc[abc.length-1])
				continu = false;
			else {
			if (numero < 9999)
				numero += 1;
			else {
				numero=0000;
				for (int i = 0; i < letras.length; i++) {
					for (int j = 0; j < abc.length; j++) {
						if (letras[i] == abc[j])
							aux[i] = j;
					}
				}
				for (int i = letras.length-1; i >= 0; i--) {
					if (letras[i] != abc[abc.length - 1]) {
						letras[i] = abc[aux[i] + 1];
						i=0;
					}
					else {
					if(letras[i]==abc[abc.length-1])
						letras[i]=abc[0];
					}
				}
				
			}

			System.out.printf("%04d",numero);
			System.out.print(" ");
			System.out.print(letras);
			System.out.println();
			}
		}

	}

}
