import java.util.Scanner;

public class Enunciado5 {
	public static void main(String args[]){
		System.out.println("Introduce dos números a multiplicar");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int suma = 0;
		suma +=b;
		System.out.println(a+" "+b+" "+"*");
		while(a!=1){
			a/=2;
			b*=2;
			if(a % 2 != 0) suma+=b;
			System.out.println(a+" "+b+" "+"*");
		}
		System.out.println(suma);
	}
}
