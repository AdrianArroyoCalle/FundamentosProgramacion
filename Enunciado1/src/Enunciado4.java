import java.util.Scanner;

public class Enunciado4 {
	public static boolean esPrimo(long n){
		boolean primo = true;
		
		for(long d = n-1;d>1;d--){
			long c = n % d;
			if(c == 0)
				primo = false;
		}
		return primo;
	}
	
	public static int obtener_mcd(int a, int b) {
	       if(b==0)
	           return a;
	       else
	           return obtener_mcd(b, a % b);
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int mcm = 1;
		// MCM es PRODUCTO DE NUMEROS / MCD
		for(int i=2;i<=n;i++){
			mcm =(mcm*i) / obtener_mcd(i,mcm);
			
			System.out.println(i+" "+mcm);
		}
	}
}
