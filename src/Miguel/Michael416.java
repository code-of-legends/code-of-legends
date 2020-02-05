package Miguel;

import java.util.Arrays;
import java.util.HashSet;

public class Michael416 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (cumpleaños())
			;
	}

	public static boolean cumpleaños() {
		int num = in.nextInt();
		if (num == 0) {
			return false;
		}
		HashSet<String> fechas = new HashSet<String>();
		for (int i = 0; i < num; i++) {
			String fech = in.next();
			fechas.addAll(Arrays.asList(fech.substring(0, fech.length() - 4)));
		}
		if (fechas.size() != num) {
			System.out.println("SI");
		} else
			System.out.println("NO");

		return true;

	}

}
