package Miguel;

import java.util.Arrays;
import java.util.LinkedList;

public class Hangares429 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (ordenacion())
			;
	}

	public static boolean ordenacion() {
		//lectura, creacion y ordenacion del array de hangares
		boolean valido = true;
		int hangares = in.nextInt();
		if (hangares == 0) {
			return false;
		}
		int[] hangar = new int[hangares];
		for (int i = 0; i < hangar.length; i++) {
			hangar[i] = in.nextInt();
		}
		Arrays.sort(hangar);
		//lectura y del array de aviones
		int aviones = in.nextInt();
		LinkedList<Integer> avion = new LinkedList<Integer>();
		for (int i = 0; i < aviones; i++) {
			avion.add(in.nextInt());
		}
		//proceso
		for (int i = 0; i < avion.size(); i++) {
			if(avion.get(i) > hangar[hangar.length-1]) {
				valido = false;
				i = avion.size();
			}else {
				hangar[hangar.length-1] -= avion.get(i);
				Arrays.sort(hangar);
			}
		}
		System.out.println(valido ? "SI" : "NO");
		return true;

	}

}
