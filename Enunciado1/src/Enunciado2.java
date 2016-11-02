import java.util.Scanner;

public class Enunciado2 {

	public static boolean esPitagorica(long a, long b, long c) {
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
	}

	public static void main(String[] args) {
		System.out.println("Introduzca un intervalo de números enteros positivos");
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();
		long n = Math.min(x, y);
		long m = Math.max(x, y);

		for (long a = 1; a < m / 2; a++) {
			for (long b = a + 1; b < m / 2; b++) {
				long c = (long) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				if (n <= a + b + c && a + b + c <= m && esPitagorica(a, b, c)) {
					System.out.println(a + " " + b + " " + (c));
				}
			}
		}

	}

}
