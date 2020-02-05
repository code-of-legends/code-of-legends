package Miguel;

import java.util.Arrays;

public class TiaManuela542 {
	static java.util.Scanner in;

	public static boolean comprobarDimensiones() {
		int[] juguetes = new int[3];
		int[] cajas = new int[3];
		String resultado = "SIRVE";
		for (int i = 0; i < juguetes.length; i++) {
			juguetes[i] = in.nextInt();
		}
		for (int i = 0; i < cajas.length; i++) {
			cajas[i] = in.nextInt();
		}
		Arrays.sort(juguetes);
		Arrays.sort(cajas);
		for (int i = 0; i < juguetes.length; i++) {
			if (juguetes[i] >= cajas[i]) {
				resultado = "NO SIRVE";
			}
		}

		System.out.println(resultado);
		return true;
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);

		for (int n = in.nextInt(); n > 0; n--) {
			comprobarDimensiones();
		}

	}

}
