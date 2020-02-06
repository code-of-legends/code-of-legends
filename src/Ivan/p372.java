package Ivan;

import java.util.Scanner;

public class p372 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();

		for (int i = 0; i < casos; i++) {
			StringBuilder frase = new StringBuilder(in.next());
			if (frase.length() > 1) {
				frase.reverse();
			}
			if (Character.isUpperCase(frase.charAt(frase.length() - 1))) {
				frase.replace(frase.length() - 1, frase.length(),
						"" + Character.toLowerCase(frase.charAt(frase.length() - 1)));
				frase.replace(0, 1, "" + Character.toUpperCase(frase.charAt(0)));
			}
			System.out.println(frase);
		}

	}

}
