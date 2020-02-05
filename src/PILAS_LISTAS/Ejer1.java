package PILAS_LISTAS;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char brackets;
		while (in.hasNext()) {
			String funciona = "YES";
			Stack<Character> pilas = new Stack<Character>();
			String frase = in.nextLine();
			pilas.push('r');
			int cont = 0, count = 0;
			for (int i = 0; i < frase.length(); i++) {
				brackets = frase.charAt(i);
				if ((brackets == '(') || (brackets == '{') || (brackets == '[')) {
					pilas.push(brackets);
					cont++;
				} else if (brackets == ')') {
					if (pilas.peek() != ('(')) {
						funciona = "NO";
					} else
						pilas.pop();
				} else if (brackets == '}') {
					if (pilas.peek() != ('{')) {
						funciona = "NO";
					} else
						pilas.pop();
				} else if (brackets == ']') {
					if (pilas.peek() != ('[')) {
						funciona = "NO";
					} else
						pilas.pop();
				}
			}
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == ')' || frase.charAt(i) == '}' || frase.charAt(i) == ']') {
					count++;
				}
			}
			if (cont != count) {
				funciona = "NO";
			}
			System.out.println(funciona);
		}
	}

}
