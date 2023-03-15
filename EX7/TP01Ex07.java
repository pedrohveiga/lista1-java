//Calcular e exibir a média geométrica de dois valores quaisquer que serão
//digitados.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex07 {

	public static void main(String[] args) {
		double v, x, y;
		Scanner scan = new Scanner(System.in);
		System.out.print("Primeiro valor: ");
		x = scan.nextDouble();
		System.out.print("Segundo valor: ");
		y = scan.nextDouble();
		v = Math.sqrt(x * y);
		System.out.println("Volume:" + v);
	}

}
