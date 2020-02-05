package Miguel;

public class Fiestaburrida117 {
	static java.util.Scanner in;

	public static void hola() {
		String persona = in.nextLine();
		String[] per = persona.split(" ");
		System.out.println("Hola, " + per[1] + ".");

	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int nukmCasos = Integer.parseInt(in.nextLine());
		for (int n = nukmCasos; n > 0; n--) {
			hola();
		}
	}

}
