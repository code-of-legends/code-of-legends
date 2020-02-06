package Ivan;

public class main538 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int abu;
		abu = in.nextInt();
		int igle;
		igle = in.nextInt();
		if (abu == 0 && igle==0)
			return false;
		if (abu>=igle)
			System.out.println("CUERDO");
		else
			System.out.println("SENIL");
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}

}
