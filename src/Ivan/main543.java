package Ivan;

public class main543 {

	static java.util.Scanner in;

	public static void casoDePrueba() {
		int n;
		n = in.nextInt();
		
		int[][]somb=new int[n][3];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				somb[i][j]=in.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			if(somb[i][0]-somb[i+1][0]<=somb[]
		}
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}
}
