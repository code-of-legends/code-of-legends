/**
 * @author iván hernán
 */
package Ivan;

import java.util.Scanner;

public class EspionajeenNavidad364 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continuar = true;
		char[] abcd = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		while (continuar) {
			String palabra = in.nextLine();
			StringBuilder palabra1 = new StringBuilder(palabra);
			if (palabra.equals("FIN"))
				continuar = false;
			else {
				for (int i = 0; i < palabra.length(); i++) {
					for (int j = 0; j < abcd.length - 1; j++) {
						if (palabra1.charAt(i) == ' ')
							j = abcd.length - 2;
						else {
							if (palabra1.charAt(i) == 'Z')
								palabra1.replace(i, i + 1, "" + abcd[0]);
							else {
								if (palabra1.charAt(i) == abcd[j]) {
									palabra1.replace(i, i + 1, "" + abcd[j + 1]);
									j = abcd.length - 2;

								}
							}
						}
					}
				}
				System.out.println(palabra1);
			}
			
		}
	}
}
