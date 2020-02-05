package Miguel;


public class StanLee475 {
	static java.util.Scanner in;
	
	public static void casoDeprueba() {
		String linea = in.nextLine().toLowerCase();
		char[] stan = {'s','t','a','n','l','e','e'};
		int count = 0;
		int res=0;
		for (int i = 0; i < linea.length(); i++) {
			if(linea.charAt(i)== stan[count]) {
				count++;
				
			}
			if(count == stan.length) {
				res++;
				count=0;
			}
			
		}
		
		
		System.out.println(res);
	}
	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCasos; i++) {
			casoDeprueba();
		}
	}

}
