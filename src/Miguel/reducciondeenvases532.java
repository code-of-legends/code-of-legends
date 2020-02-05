package Miguel;

import java.util.Scanner;

public class reducciondeenvases532 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = in.nextInt(); i > 0; i--) {
			int n = in.nextInt();
			int t = in.nextInt();
			System.out.println(t - n);
		}
	}

}
