import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		// Calcula la media de los impares introducidos
		System.out.println("Introduce los 5 números enteros");
		Scanner in = new Scanner(System.in);
		int n, suma = 0, impares = 0;
		n = in.nextInt();
		if (n % 2 == 1) {
			suma += n;
			impares++;
		}
		n = in.nextInt();
		if (n % 2 == 1) {
			suma += n;
			impares++;
		}
		n = in.nextInt();
		if (n % 2 == 1) {
			suma += n;
			impares++;
		}
		n = in.nextInt();
		if (n % 2 == 1) {
			suma += n;
			impares++;
		}
		n = in.nextInt();
		if (n % 2 == 1) {
			suma += n;
			impares++;
		}
		if (impares != 0) {
			double media = (double) suma / impares;
			System.out.println("La media de los impares es: " + media);
		} else {
			System.out.println("No has introducido ningún impar");
		}
		in.close();

	}

}
