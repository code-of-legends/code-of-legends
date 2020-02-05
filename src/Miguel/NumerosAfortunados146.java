package Miguel;

import java.util.Stack;
/**
 * 
 * @author miguel
 *
 */
public class NumerosAfortunados146 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (calculo())
			;
	}

	public static boolean calculo() {
		int num = in.nextInt();
		if (num == 0) {
			return false;
		}
		System.out.print(num + ":");
		num = num % 2 == 0 ? num : num - 1;
		Stack<Integer> pila = new Stack<Integer>();
		for (int i = num; i > 0; i-=2) {
				pila.push(i);
			
		}
		int count = 3;
		while (pila.size() >= count) {
			Stack<Integer> aux = new Stack<Integer>();
			pila.pop();
			int largo = pila.size();
			for (int i = 1; i <= largo; i++) {
				if (i % count == 0) {
					pila.pop();
				} else {
					aux.push(pila.pop());
				}
			}
			int largoaux = aux.size();
			for (int i = 0; i < largoaux; i++) {
				pila.push(aux.pop());
			}
			count++;
		}
		for (Integer integer : pila) {
			System.out.print(" " + integer);
		}
		System.out.println();
		return true;

	}

}
