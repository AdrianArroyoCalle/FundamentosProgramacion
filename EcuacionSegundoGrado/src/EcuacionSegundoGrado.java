import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EcuacionSegundoGrado {

	public static void calcularEcuacion(double a, double b, double c){
		if(a == 0){
			if(b == 0){
				if(c == 0){
					System.out.println("X puede tomar cualquier valor");
				}else{
					System.out.println("La ecuación es incompatible");
				}
			}else{
				/* Ecuación de primer grado */
				if(c==0){
					System.out.println("x=0");
				}else{
					double x = -b/c;
					System.out.println("x="+x);
				}
			}
		}else{
			/* Ecuación de segundo grado */
			double d = Math.pow(b, 2) - 4*a*c;
			if(d>=0){
				/* Soluciones reales */
				double x1 = (-b + d)/(2*a);
				double x2 = (-b - d)/(2*a);
				if(x1 == x2){
					System.out.println("x="+x1+" (solución doble");
				}else{
					System.out.println("x="+x1);
					System.out.println("x="+x2);
				}
			}else{
				/* Soluciones imaginarias */
				double real = -b/(2*a);
				double img = Math.sqrt(-(Math.pow(b, 2) - 4*a*c))/(2*a);
				System.out.println("x="+real+" + "+img+"\u2148");
				
				System.out.println("x="+real+" - "+img+"\u2148");
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Introduce los coeficientes de la ecuación de segundo grado (ax\u00B2+bx+c = 0)");
		Scanner in = new Scanner(System.in);
		int a,b,c;
		a = in.nextInt();
		System.out.print("\r");
		System.out.print(a+"x\u00B2 ");
		b = in.nextInt();
		System.out.print("\r");
		System.out.print(a+"x\u00B2 ");
		if(b >= 0) System.out.print("+");
		System.out.print(b+"x ");
		c = in.nextInt();
		System.out.print("\r");
		System.out.print(a+"x\u00B2 ");
		if(b >= 0) System.out.print("+");
		System.out.print(b+"x ");
		if(c>= 0) System.out.print("+");
		System.out.print(c + " = 0\n");
		in.close();
		calcularEcuacion(a,b,c);*/
		Pattern pat = Pattern.compile(" [0-9.]+ ?€",Pattern.CASE_INSENSITIVE);
		Matcher m = pat.matcher("Esta cadena 75.34 € sale sin números");
		if(m.find()){
			System.out.println("Dinero: "+m.group());
		}
		
		
		
	}

}
