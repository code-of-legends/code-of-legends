package claseee;

public class Main {
	public static void main(String[] args) {
		String s = "1234567890";
		s = separarMiles(s);
		System.out.println(s);
	}

	public static String separarMiles(String s) {
		// creamos un StringBuilder a partir del String s
		StringBuilder aux = new StringBuilder(s);
		// le damos la vuelta
		aux.reverse();
		// variable que indica donde insertar el siguiente punto
		int posicion = 3;
		
		while (posicion < aux.length()) {
			
			aux.insert(posicion, '.');
			
			posicion += 4;
		}
		// le damos de nuevo la vuelta
		aux.reverse();
		// el StringBuilder se pasa a String y se devuelve
		return aux.toString();
	}
}