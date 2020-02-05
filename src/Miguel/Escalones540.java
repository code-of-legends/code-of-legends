package Miguel;

public class Escalones540 {
	static java.util.Scanner in;

	public static void sumaEscaleras() {
		for (int i = in.nextInt(); i > 0; i--) {
			int vivo = in.nextInt();
			int escaleras = in.nextInt();
			int pisos = in.nextInt();
			int adicionales = in.nextInt();
			if (vivo > 20 || escaleras > 20 || pisos > 20 || adicionales > 20) {
				i++;
			} else {
				System.out.print(pisos * escaleras + adicionales + " ");
				System.out.println(pisos * escaleras + vivo * escaleras + adicionales);
			}
		}
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);

		sumaEscaleras();

	}

}
