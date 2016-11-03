import java.util.Scanner;

public class CapicuasYPrimos {

	public static boolean esPrimo(long n){
		boolean primo = true;
		for(int i=2;i<=Math.sqrt(n) && primo;i++){
			if(n % i == 0){
				primo = false;
			}
		}
		return primo;
	}
	
	public static void main(String[] args) {
		/* El programa calcula el numero de numeros de N cifras que son capicuas y primos */
		int capicuasPrimos = 0;
		
		// OBTENER ENTRADA
		Scanner in = new Scanner(System.in);
		byte n = 0;
		do{
			System.out.print("Introduzca un número entre 2 y 15: ");
			n = in.nextByte();
			
		}while(n < 2 || n > 15);
		
		// GENERAR CAPICUAS
		int mitadLongitud = n/2; 
		for(int semicapicua=(int) Math.pow(10, mitadLongitud -1);semicapicua<Math.pow(10, mitadLongitud);semicapicua++){
			long capicua = 0;
			int semicapicuatemp = semicapicua;
			capicua += semicapicuatemp;
			for(int i=1;i<=n;i++){
				capicua += (semicapicuatemp % 10)*Math.pow(10,n-i);
				semicapicuatemp /= 10;
				
			}
			
			if(n % 2 == 0){
				if(esPrimo(capicua)){
					capicuasPrimos++;
				}
				
			}else{
				if(esPrimo(capicua)){
					capicuasPrimos++;
				}
				for(int j=0;j<9;j++){
					capicua += Math.pow(10, n/2);
					if(esPrimo(capicua)){
						capicuasPrimos++;
					}
				}
			}
			
			// PARA PASARNOS EL CERO AL FINAL
			if(semicapicua % 10 == 9){
				semicapicua++;
			}

		}
		
		System.out.println("El número de capicúas primos de "+n+" cifras es: "+capicuasPrimos);
	}

}
