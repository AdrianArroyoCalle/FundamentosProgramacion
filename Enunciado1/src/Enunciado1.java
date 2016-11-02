import java.util.Scanner;

public class Enunciado1 {
	/* Calcula el número de operaciones necesarias para llegar a 1 según la conjetura de Collatz */
	public static int longCiclo(long n){
		/* PRE: n>0 */
		int times = 1;
		while(n!=1){
			if(n % 2 == 0){
				n /= 2;
			}else{
				n *= 3;
				n++;
			}
			times++;
		}
		return times;
	}
	public static void main(String args[]){
		System.out.println("Introduzca un rango con dos números enteros positivos");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int max = 0;
		int a = Math.min(n, m);
		int b = Math.max(n, m);
		while(a<=b){
			max = Math.max(longCiclo(a), max);
			a++;
		}
		System.out.println("El número máximos de ciclos para llegar a 1 en Collatz es: "+max);
	}
}
