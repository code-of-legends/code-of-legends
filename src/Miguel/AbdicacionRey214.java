package Miguel;

import java.util.HashMap;
/**
 * 
 * @author miguel
 *
 */
public class AbdicacionRey214 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (conteo())
			;
	}

	private static boolean conteo() {
		int num = Integer.parseInt(in.nextLine());
		if (num == 0) {
			return false;
		}
		HashMap<String, Integer> familia = new HashMap<String, Integer>();
		String[] nombre = in.nextLine().split(" ");
		for (int i = 0; i < nombre.length; i++) {
			if (familia.containsKey(nombre[i])) {
				familia.put(nombre[i], familia.get(nombre[i]) + 1);
			} else {
				familia.put(nombre[i], 1);
			}

		}
		int num2 = Integer.parseInt(in.nextLine());
		String[] nombre2 = in.nextLine().split(" ");
		for (int i = 0; i < nombre2.length; i++) {
			if (familia.containsKey(nombre2[i])) {
				familia.put(nombre2[i], familia.get(nombre2[i]) +1);
				System.out.println(familia.get(nombre2[i]));
			} else {
				familia.put(nombre2[i], 1);
				System.out.println(familia.get(nombre2[i]));
			}

		}
		System.out.println();
		return true;
	}
}
