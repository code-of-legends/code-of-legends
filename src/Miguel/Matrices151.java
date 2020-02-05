package Miguel;

public class Matrices151 {
	static java.util.Scanner in;

	public static boolean cuadrada() {
		int filas = in.nextInt();
		String cuadrada = "SI";
		if (filas == 0) {
			return false;
		}
		int[][] matriz = new int[filas][filas];
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					if (matriz[i][j] != 1) {
						cuadrada = "NO";
					}
				}
				if (i != j) {
					if (matriz[i][j] != 0) {
						cuadrada = "NO";
					}
				}
			}
		}
		System.out.println(cuadrada);

		return true;
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (cuadrada())
			;
	}

}
