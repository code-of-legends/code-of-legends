package Ivan;

public class main539 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int ini;
		if (!in.hasNext())
			return false;
		ini = in.nextInt();
		
		int fin;
		fin = in.nextInt();
		
		boolean esDecada = false;
		
		while (ini < fin) {
			ini = ini + 10;
			if (ini-1 == fin) 
				esDecada = true;
		}

		if (esDecada)
			System.out.println("FELIZ DECADA NUEVA");
		else
			System.out.println("TOCA ESPERAR");

		return true;

	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}

}
