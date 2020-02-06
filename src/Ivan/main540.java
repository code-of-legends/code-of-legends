package Ivan;

public class main540 {

	static java.util.Scanner in;

	public static void casoDePrueba() {
		int [] n = new int[4];
		
		for (int i = 0; i < n.length; i++) {
			n[i]=in.nextInt();
		};
		int baj=n[1]*n[2]+n[3];
		int sub=baj+n[0]*n[1];
		
		System.out.println(baj+" "+sub);
		
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}

}
