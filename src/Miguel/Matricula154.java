package Miguel;

public class Matricula154 {
	static java.util.Scanner in;

	public static boolean cambiar() {
		int num = in.nextInt();
		String mtr = in.next();
		char[] matricula = { mtr.charAt(0), mtr.charAt(1), mtr.charAt(2) };
		if (num >= 9999 && mtr.equals("ZZZ")) {
			return false;
		} else if (num < 9999) {
			num++;
			if (num < 10) {

				System.out.println("000" + num + " " + matricula[0] + matricula[1] + matricula[2]);

				return true;
			} else if (num < 100) {

				System.out.println("00" + num + " " + matricula[0] + matricula[1] + matricula[2]);
				return true;
			} else if (num < 1000) {

				System.out.println("0" + num + " " + matricula[0] + matricula[1] + matricula[2]);
				return true;
			} else {

				System.out.println(num + " " + matricula[0] + matricula[1] + matricula[2]);
				return true;
			}

		} else {
			num = 0000;
			char[] letra = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W',
					'X', 'Y', 'Z' };

			if (matricula[2] == letra[letra.length - 1] && matricula[1] == letra[letra.length - 1]) {
				matricula[2] = letra[0];
				matricula[1] = letra[0];
				for (int i = 0; i < letra.length - 1; i++) {
					if (letra[i] == matricula[0]) {
						matricula[0] = letra[i + 1];
						i=letra.length;
					}
				}
			} else if (matricula[2] == letra[letra.length - 1]) {
				matricula[2] = letra[0];
				for (int i = 0; i < letra.length - 1; i++) {
					if (letra[i] == matricula[1]) {
						matricula[1] = letra[i + 1];
						i = letra.length;
					}
				}
			} else {
				for (int i = 0; i < letra.length - 1; i++) {
					if (matricula[2] == letra[i]) {
						matricula[2] = letra[i + 1];
						i = letra.length;
					}
				}

			}
			System.out.println("0000" + " " + matricula[0] + matricula[1] + matricula[2]);

			return true;
		}

	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (cambiar())
			;
	}

}
