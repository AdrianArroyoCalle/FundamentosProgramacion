import java.util.Scanner;

public class Piramide {

	public static int ultimaCifra(int n) {
		return (n < 10) ? n : n % 10;
	}

	public static void writeLineForV1(int line, int total) {

		int ancho = total * 2 - 1; // Ancho del gráfico
		for (int i = 0; i < ancho; i++) {
			if (i <= ancho / 2 - line) {
				System.out.print(" ");
			} else if (i <= ancho / 2) {
				int rel = ancho / 2 - line; // Calcular posición relativa desde
											// que empezaron los números
				System.out.print(ultimaCifra(i - rel + line - 1));
			} else if (i < ancho / 2 + line) {
				int rel = ancho / 2 + line; // Calcular posición relativa desde
											// el final de estos números
				System.out.print(ultimaCifra(rel - i + line - 1));
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	
	public static void writeLineForV2(int line, int total){
		
		int ancho = total * 2 -1;
		for(int i=0; i <= ancho / 2 - line;i++){
			System.out.print(" ");
		}
		for(int i=ancho / 2 - line + 1; i<= ancho / 2;i++){
			int rel = ancho / 2 - line; // Calcular posición relativa desde
						// que empezaron los números
			System.out.print(ultimaCifra(i - rel + line - 1));
		}
		for(int i= ancho/2 +1;i < ancho / 2 + line;i++){
			int rel = ancho / 2 + line; // Calcular posición relativa desde
						// el final de estos números
			System.out.print(ultimaCifra(rel - i + line - 1));
		}
		for(int i=ancho / 2 + line + 1;i<ancho;i++){
			System.out.print(" ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Introduzca un número entero positivo");
			n = in.nextInt();
		} while (n <= 0);
		in.close();
		
		//if(args[0].equals("v1")){
		/*	System.out.println("V1");
			for (int i = 0; i < n; i++) {
				writeLineForV1(i + 1, n);
			}*/
		//}else{
			System.out.println("V2");
			for (int i = 0; i < n; i++) {
				writeLineForV2(i + 1, n);
			}
		//}
		

	}

}
