package Miguel;

import java.util.HashMap;
import java.util.*;
/**
 * 
 * @author miguel
 *
 */
public class Toro270 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (evalua())
			;
	}

	private static boolean evalua() {
		int casos = Integer.parseInt(in.nextLine());
		if (casos == 0) {
			return false;
		}
		HashMap<String, Integer> evaluacion = new HashMap<String, Integer>();
		for (int i = 0; i < casos; i++) {
			String nombre = in.nextLine();
			String nota = in.nextLine();
			if (evaluacion.containsKey(nombre)) {
				if (nota.equals("CORRECTO")) {
					evaluacion.put(nombre, evaluacion.get(nombre) + 1);
				} else if (nota.equals("INCORRECTO")) {
					evaluacion.put(nombre, evaluacion.get(nombre) - 1);
				}
			} else {
				if (nota.equals("CORRECTO")) {
					evaluacion.put(nombre, 1);
				} else if (nota.equals("INCORRECTO")) {
					evaluacion.put(nombre, -1);
				}
			}
		}
		ArrayList<String> alumnos = new ArrayList<String>(evaluacion.keySet());
		Collections.sort(alumnos);
		for (int i = 0; i < alumnos.size(); i++) {
			if (evaluacion.get(alumnos.get(i)) != 0) {
				System.out.println(alumnos.get(i) + ", " + evaluacion.get(alumnos.get(i)));
			}
		}
		System.out.println("---");
		return true;
	}
}
