package Miguel;

public class Navidad364 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (encriptar())
			;

	}

	public static boolean encriptar() {
		String texto = in.nextLine();
		String encriptado = "";
		if (texto.equals("FIN")) {
			return false;
		}
		char[] abc = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
//		char[] text = texto.toCharArray();
		for (int i = 0; i < texto.length(); i++) {

			for (int j = 0; j < abc.length - 1; j++) {
				if (texto.charAt(i) == abc[abc.length - 1]) {
					encriptado += abc[0];
					j = abc.length;
				}else if(texto.charAt(i) == ' ') {
					encriptado += " ";
					j = abc.length;
				}
				
				else if (texto.charAt(i) == abc[j]) {
					encriptado+=abc[j+1];
					j = abc.length;
				}
			}
		}
		System.out.println(encriptado);
		return true;

	}
}
