package Miguel;

public class MatrizTriangular160 {
	static java.util.Scanner in;

	public static boolean triangular() {
		int filas = in.nextInt();
		boolean superior = true;
		boolean inferior = true;
		if (filas == 0) {
			return false;
		} else {
			int[][] matriz = new int[filas][filas];

			for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < matriz.length; j++) {
					matriz[i][j] = in.nextInt();
				}
			}

			for (int i = 0; i < matriz.length; i++) {

				for (int j = i + 1; j < matriz.length; j++) {
					if (matriz[i][j] != 0) {
						superior = false;
					}
				}

			}

			for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < i; j++) {
					if (matriz[i][j] != 0) {
						inferior = false;
					}
				}

			}

		}
		if (superior || inferior) {
			System.out.println("SI");

		} else {
			System.out.println("NO");
		}

		return true;

	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (triangular())
			;
	}
}
