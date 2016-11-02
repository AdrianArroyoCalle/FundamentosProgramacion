import java.util.Scanner;

public class Enunciado3 {

	public static boolean esPrimo(long n){
		boolean primo = true;
		
		for(long d = n-1;d>1;d--){
			long c = n % d;
			if(c == 0)
				primo = false;
		}
		return primo;
	}
	
	public static void main(String[] args) {
		System.out.println("Introduzca el número de cifras de los números primos palindrómicos");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int primos = 0;
		int palindromo = 0;
		
		/* GENERAR PALINDROMOS DE N CIFRAS */
		/* O COMPROBAR PALINDROMOS DE ENTRE TODO N? */
		
		
		if(esPrimo(palindromo)){
			primos++;
		}
	}

}
