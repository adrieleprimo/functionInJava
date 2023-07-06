package qualOMaiorNumero;
import java.util.Scanner;
/*An exercise that inputs three numbers and chooses the largest among them */
public class qualOMaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior = max (a, b,c );
		showResult(maior);
		sc.close();

	}
	public static int max(int x, int y, int z) {
		int resultado;
		if (x > y && x > z) {
			resultado = x;
		}
		else if ( y > x && y > z) {
			resultado = y;
		}
		else {
			resultado = z;
		}
		return resultado;
	}
	public static void showResult(int valor) {
		System.out.println(valor + "eh o maior");
		
	}
}
