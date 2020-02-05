package Miguel;

import java.util.LinkedList;

public class QuienEmpieza142 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (vive())
			;
	}

	public static boolean vive() {
		int niños = in.nextInt();
		int saltos = in.nextInt();
		if (niños == 0 && saltos == 0) {
			return false;
		}
		LinkedList<Integer> jugadores = new LinkedList<Integer>();
		for (int i = 1; i <= niños; i++) {
			jugadores.add(i);
		}
		while (jugadores.size() != 1) {
			for (int i = 0; i < saltos; i++) {
				jugadores.add(jugadores.poll());
			}
			jugadores.poll();
		}

		System.out.println(jugadores.get(0));
		return true;

	}
}
