package Miguel;

public class Todocampo538 {
	static java.util.Scanner in;

	public static boolean casoDeprueba() {
		int abuelo = in.nextInt();
		int iglesia = in.nextInt();
		if (abuelo == 0 && iglesia == 0) {
			return false;
		} else {
			if (abuelo >= iglesia) {
				System.out.println("CUERDO");
			} else
				System.out.println("SENIL");
		}
		return true;
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDeprueba())
			;
	}
}
