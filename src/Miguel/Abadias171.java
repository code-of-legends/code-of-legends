package Miguel;

public class Abadias171 {
	static java.util.Scanner in;

	public static boolean contar() {
		int montañas = in.nextInt();
		if (montañas == 0) {
			return false;
		}
		int[] altura = new int[montañas];
		for (int i = 0; i < altura.length; i++) {
			altura[i] = in.nextInt();
		}
		int abadias = 1;
		int aux = altura[altura.length-1];

		for (int i = altura.length-1; i >= 0; i--) {
			if(altura[i]>aux) {
				abadias++;
				aux = altura[i];
			}

		}
		System.out.println(abadias);
		return true;
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (contar())
			;
	}

}
