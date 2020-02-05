package Miguel;

import java.util.Stack;

public class parentesisbalanceados141 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (in.hasNext()) {
			balance();
		}
	}

	public static void balance() {
		// TODO Auto-generated method stub
		String prueba = in.nextLine();
		Stack<Character> balance = new Stack<Character>();
		boolean valido = true;
		for (int i = 0; i < prueba.length(); i++) {
			if (prueba.charAt(i) == '(' || prueba.charAt(i) == '[' || prueba.charAt(i) == '{') {
				balance.push(prueba.charAt(i));
			}
			if ((prueba.charAt(i) == ')' || prueba.charAt(i) == '}' || prueba.charAt(i) == ']') && balance.empty()) {
				valido = false;
				i = prueba.length();
			} else if (prueba.charAt(i) == ')') {
				if (balance.peek() != '(') {
					valido = false;
					i = prueba.length();
				} else
					balance.pop();
			} else if (prueba.charAt(i) == ']') {
				if (balance.peek() != '[') {
					valido = false;
					i = prueba.length();
				} else
					balance.pop();
			} else if (prueba.charAt(i) == '}') {
				if (balance.peek() != '{') {
					valido = false;
					i = prueba.length();
				} else
					balance.pop();
			}
		}
		if(!balance.empty()) {
			valido=false;
		}
		System.out.println(valido ? "YES" : "NO");
	}

}
