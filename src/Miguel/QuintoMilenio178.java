package Miguel;

public class QuintoMilenio178 {
	static java.util.Scanner in;

	public static void casoDeprueba() {
		String texto = in.nextLine().toLowerCase();
		String oculto = in.nextLine().toLowerCase().replace(" ", "");
		int count = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == oculto.charAt(count)) {
				count++;
			}
			if (count >= oculto.length()) {
				i = texto.length();
			}

		}
		if (count == oculto.length()) {
			System.out.println("SI");
		} else
			System.out.println("NO");
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		for (int i = 0; i < num; i++) {
			casoDeprueba();
		}

	}
}
