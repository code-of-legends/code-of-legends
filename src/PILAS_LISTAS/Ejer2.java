package PILAS_LISTAS;

import java.util.*;

public class Ejer2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Character> pila = new Stack<>();
		while (in.hasNextLine()) {
			String amor = in.nextLine();
			int num = 0;
			pila.removeAll(pila);
			for (int i = 0; i < amor.length(); i++) {
				char parejas = amor.charAt(i);
				if (parejas == 'H' || parejas == 'h') {
//						pila.removeAllElements();
					pila.push(parejas);
				}
				if (parejas == 'M') {
					if (!(pila.isEmpty()) && pila.peek() == ('H')) {
						num++;
					} else
						pila.removeAllElements();
				}
				if (parejas == 'm') {
					if (!(pila.isEmpty()) && pila.peek() == ('h')) {
						num++;
					} else
						pila.removeAllElements();

				}
				if (parejas == '@') {
					num = 0;
					break;
				}
			}
			System.out.println(num);
		}

	}

}
