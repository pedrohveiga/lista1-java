//Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
//será digitado.
//Pedro Veiga
import java.util.Scanner;

public class TP01Ex05 {

	public static void main(String[] args) {
		double v, d;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira o diametro da esfera: ");
		d = scan.nextDouble();
		v = (4 / 3) * Math.PI * (d / 2);
		System.out.println("Volume: " + v);
	}

}
