package Ivan;

public class problema2 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int D;
		int aux;
		int res = 0;
		D = in.nextInt();
		if (D == 0)
			return false;
		int[] alturas = new int[D];
		for (int i = 0; i < D; i++) {
			alturas[i] = in.nextInt();
		}
		for (int i = 0; i < alturas.length - 1; i++) {
			if (alturas[i+1] <= alturas[alturas.length - 1] && alturas[0] <= alturas[alturas.length - 1]) {
				aux = Math.abs(alturas[alturas.length - 1] - alturas[i]);
				res += aux;
			}
		}
		System.out.println(res);
		in.nextLine();
		return true;

	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba());
	}
}
